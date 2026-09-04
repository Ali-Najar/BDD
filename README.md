# آزمایش BDD — ماشین‌حساب ضرب، تقسیم و توان

> این README به‌صورت گزارش‌کار قابل تحویل نوشته شده است.  
> نام و نام خانوادگی: `...`  
> شماره دانشجویی: `...`  
> لینک مخزن GitHub: `...`  
> تاریخ انجام آزمایش: `...`

## 1) هدف آزمایش

هدف این آزمایش آشنایی عملی با **Behavior-Driven Development (BDD)** و تبدیل نیازمندی‌ها به سناریوهای قابل اجرا با استفاده از **Gherkin + Cucumber + JUnit + Maven** است.

در مرحله نخست، مثال جمع دو عدد از مستند آزمایشگاه بازسازی می‌شود. سپس مشکل `undefined` در `Scenario Outline` تحلیل و اصلاح می‌شود. در مرحله اصلی، یک ماشین‌حساب برای عملیات `*`، `/` و `^` پیاده‌سازی می‌شود؛ ورودی‌های ماشین‌حساب دو عدد صحیح و یک عملگر هستند.

---

## 2) ابزارها و فناوری‌ها

- IntelliJ IDEA
- Java
- Maven
- JUnit 4.12
- Cucumber-JVM 1.2.5
- Gherkin
- Git / GitHub
- GitHub Projects (Kanban)

نسخه‌های Cucumber و JUnit در این پروژه عمداً مطابق مثال آزمایشگاه نگه داشته شده‌اند تا رفتار مستند قابل بازتولید باشد.

---

## 3) ساختار پروژه

```text
SELab-BDD-Calculator/
├── pom.xml
├── README.md
├── .gitignore
└── src
    ├── main
    │   └── java
    │       └── calculator
    │           └── Calculator.java
    └── test
        ├── java
        │   └── calculator
        │       ├── MyStepdefs.java
        │       └── RunnerTest.java
        └── resources
            └── features
                ├── addition.feature
                └── calculator.feature
```

---

## 4) بازسازی مثال مستند آزمایشگاه

ابتدا پروژه Maven ساخته شد و dependencyهای Cucumber و JUnit به `pom.xml` اضافه شدند. سپس مسیر `src/test/resources` به‌عنوان Test Resource Root و مسیر `features` برای فایل‌های Gherkin در نظر گرفته شد.

### سناریوی عادی جمع

```gherkin
Scenario: add two numbers
  Given Two input values, 1 and 2
  When I add the two values
  Then I expect the result 3
```

### Scenario Outline جمع

```gherkin
Scenario Outline: add two numbers
  Given Two input values, <first> and <second>
  When I add the two values
  Then I expect the result <result>

  Examples:
    | first | second | result |
    | 1     | 12     | 13     |
    | -1    | 6      | 5      |
    | 2     | 2      | 4      |
```

---

## 5) تحلیل مشکل undefined در Scenario Outline

در نسخه اولیه Step Definition، الگوی عددی به این شکل بود:

```java
@Given("^Two input values, (\\d+) and (\\d+)$")
```

عبارت `\d+` فقط رقم‌های بدون علامت را می‌پذیرد. بنابراین سطر زیر از Examples با Step Definition تطبیق داده نمی‌شود:

```text
| -1 | 6 | 5 |
```

در نتیجه Step مربوط به `Given Two input values, -1 and 6` به‌صورت `undefined` گزارش می‌شود.

### اصلاح

الگوی ورودی به شکل زیر تغییر داده شد:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
```

قسمت `-?` یعنی علامت منفی اختیاری است؛ پس هم اعداد مثبت و هم منفی پذیرفته می‌شوند.

برای اینکه خروجی منفی یا اعشاری نیز در تست‌های ماشین‌حساب قابل بررسی باشد، Step نتیجه نیز به شکل زیر نوشته شد:

```java
@Then("^I expect the result (-?\\d+(?:\\.\\d+)?)$")
```

---

## 6) نیازمندی مسئله اصلی

ماشین‌حساب دو عدد صحیح و یک عملگر از مجموعه زیر دریافت می‌کند:

- `*` ضرب
- `/` تقسیم
- `^` توان

عمل توان بدون `Math.pow` و با **ضرب تکراری** پیاده‌سازی شده است.

نمونه‌های الزامی مسئله:

| first | second | opt | result |
|---:|---:|:---:|---:|
| 6 | 2 | `*` | 12 |
| 6 | 2 | `/` | 3 |
| 6 | 2 | `^` | 36 |

---

## 7) سناریوهای عادی

برای هر عملگر حداقل یک سناریوی عادی نوشته شده است:

```gherkin
Scenario: multiply two integers
  Given Two input values, 6 and 2
  When I press the * key
  Then I expect the result 12

Scenario: divide two integers
  Given Two input values, 6 and 2
  When I press the / key
  Then I expect the result 3

Scenario: raise an integer to a power
  Given Two input values, 6 and 2
  When I press the ^ key
  Then I expect the result 36
```

---

## 8) Scenario Outline مسئله اصلی

```gherkin
Scenario Outline: calculate two integer inputs
  Given Two input values, <first> and <second>
  When I press the <opt> key
  Then I expect the result <result>

  Examples:
    | first | second | opt | result |
    | 6     | 2      | *   | 12     |
    | 6     | 2      | /   | 3      |
    | 6     | 2      | ^   | 36     |
    | -6    | 2      | *   | -12    |
    | -6    | -2     | *   | 12     |
    | 0     | 5      | *   | 0      |
    | 7     | 2      | /   | 3.5    |
    | -6    | 2      | /   | -3     |
    | 2     | 0      | ^   | 1      |
    | -2    | 3      | ^   | -8     |
    | 2     | -2     | ^   | 0.25   |
```

یک سناریوی جداگانه برای تقسیم بر صفر نیز در نظر گرفته شده است:

```gherkin
Scenario: division by zero
  Given Two input values, 6 and 0
  When I press the / key
  Then I expect a division by zero error
```

---

## 9) پیاده‌سازی Calculator

فایل:

```text
src/main/java/calculator/Calculator.java
```

نکات مهم پیاده‌سازی:

1. ضرب با عملگر `*` انجام می‌شود.
2. تقسیم برای جلوگیری از integer division به `double` تبدیل می‌شود.
3. تقسیم بر صفر `ArithmeticException` ایجاد می‌کند.
4. توان با حلقه و ضرب تکراری پیاده‌سازی شده و از `Math.pow` استفاده نشده است.
5. برای توان منفی، ابتدا توان مثبت با ضرب ساخته شده و سپس معکوس آن برگردانده می‌شود.
6. عملگر ناشناخته با `IllegalArgumentException` رد می‌شود.

---

## 10) Step Definitions

فایل:

```text
src/test/java/calculator/MyStepdefs.java
```

در Step Definitions، عبارت‌های Gherkin به کد Java متصل می‌شوند. Hook از نوع `@Before` قبل از هر Scenario یک نمونه تازه از Calculator می‌سازد تا سناریوها به یکدیگر وابسته نباشند.

Stepهای اصلی عبارت‌اند از:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
@When("^I add the two values$")
@When("^I press the ([*/^]) key$")
@Then("^I expect the result (-?\\d+(?:\\.\\d+)?)$")
@Then("^I expect a division by zero error$")
```

---

## 11) Runner

فایل:

```text
src/test/java/calculator/RunnerTest.java
```

Runner با JUnit اجرا می‌شود:

```java
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "calculator",
    monochrome = true
)
public class RunnerTest {
}
```

قرار دادن `features` باعث می‌شود Cucumber فایل‌های feature را از مسیر مشخص‌شده پیدا کند. `glue` نیز package مربوط به Step Definitions را تعیین می‌کند.

---

## 12) اجرای پروژه

در ریشه پروژه:

```bash
mvn clean test
```

یا در IntelliJ:

1. Maven را باز کنید.
2. Lifecycle → `test` را اجرا کنید.
3. یا روی `RunnerTest` راست‌کلیک و Run را انتخاب کنید.

شرط تحویل: تمام Scenarioها باید Pass باشند و خروجی اجرای تست در گزارش قابل مشاهده باشد.

---

## 13) شواهدی که باید در گزارش قرار دهم

در نسخه نهایی گزارش، این تصاویر اضافه می‌شوند:

1. ساختار پروژه در IntelliJ.
2. بخش dependencyهای `pom.xml`.
3. `addition.feature` قبل از رفع مشکل و خروجی `undefined`.
4. خط Step Definition قدیمی با `\d+`.
5. نسخه اصلاح‌شده با `-?\d+`.
6. خروجی Pass شدن Scenario Outline مثال.
7. فایل `calculator.feature`.
8. کلاس `Calculator`.
9. فایل `MyStepdefs`.
10. `RunnerTest`.
11. خروجی `mvn clean test` یا Run از IntelliJ.
12. GitHub repository و تاریخچه commitها.
13. GitHub Projects / Kanban در حالت نهایی.

---

## 14) GitHub و Kanban

برای انجام انفرادی پروژه، همچنان از Issue، Branch، Pull Request و Project Board استفاده می‌شود تا روند مهندسی نرم‌افزار قابل مشاهده باشد.

ستون‌های پیشنهادی Kanban:

```text
Backlog → Todo → In Progress → Review/Test → Done
```

Issueهای پیشنهادی:

```text
#1  Setup Maven project and dependencies
#2  Reproduce BDD addition example
#3  Reproduce and fix undefined Scenario Outline
#4  Implement multiplication
#5  Implement division
#6  Implement power using repeated multiplication
#7  Write normal Gherkin scenarios
#8  Write Scenario Outline and edge cases
#9  Configure Cucumber Runner and run Maven tests
#10 Complete README, screenshots and final report
```

برای هر Issue یک branch جدا ساخته می‌شود؛ مثلا:

```bash
git checkout -b fix/negative-number-step
```

پس از انجام کار:

```bash
git add .
git commit -m "fix: support signed integers in BDD step definitions"
git push -u origin fix/negative-number-step
```

سپس یک Pull Request به `main` ایجاد می‌شود و در توضیح PR نوشته می‌شود:

```text
Closes #3
```

پس از merge، Issue به Done منتقل می‌شود.

---

## 15) نمونه توالی commitها

```text
chore: initialize Maven BDD project
test: add laboratory addition feature
test: add addition step definitions
fix: support signed integers in BDD steps
feat: implement multiplication
feat: implement division
feat: implement power with repeated multiplication
test: add normal calculator scenarios
test: add calculator scenario outline and edge cases
test: add Cucumber JUnit runner
docs: complete README and report evidence
```

---

## 16) نتیجه‌گیری

در این آزمایش، نیازمندی‌های رفتاری ابتدا به زبان Gherkin نوشته شدند و سپس با Step Definitions به کد Java متصل شدند. مشکل `undefined` در Scenario Outline به علت عدم پذیرش علامت منفی در regex شناسایی و با `-?\d+` اصلاح شد. پس از آن، عملیات ضرب، تقسیم و توان پیاده‌سازی شدند و هر سه عملگر هم با Scenarioهای عادی و هم با Scenario Outline مورد آزمون قرار گرفتند.

توان بدون `Math.pow` و با ضرب تکراری پیاده‌سازی شده است. همچنین حالت‌های مرزی مانند اعداد منفی، صفر، تقسیم غیرصحیح، توان صفر، توان منفی و تقسیم بر صفر نیز پوشش داده شده‌اند.

---

## 17) چک‌لیست تحویل

- [ ] پروژه Maven بدون خطا build می‌شود.
- [ ] `mvn clean test` موفق است.
- [ ] مثال جمع مستند اجرا شده است.
- [ ] خطای `undefined` بازتولید شده است.
- [ ] علت خطا در چند خط توضیح داده شده است.
- [ ] regex برای اعداد منفی اصلاح شده است.
- [ ] Scenario عادی برای `*` وجود دارد.
- [ ] Scenario عادی برای `/` وجود دارد.
- [ ] Scenario عادی برای `^` وجود دارد.
- [ ] Scenario Outline شامل سه مثال اصلی مسئله است.
- [ ] Step Definitions کامل‌اند.
- [ ] کد `Calculator` کامل است.
- [ ] توان با ضرب تکراری نوشته شده است.
- [ ] Runner درست تنظیم شده است.
- [ ] همه تست‌ها Pass هستند.
- [ ] README شامل توضیح مراحل، کد، نتیجه و تصاویر است.
- [ ] GitHub repository مرتب است.
- [ ] Kanban/Project Board تکمیل شده است.
- [ ] Issueها، branchها، commitها و PRها روند انجام کار را نشان می‌دهند.
