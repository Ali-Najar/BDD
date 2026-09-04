## کاربر

در انجام گام به گام این پروژه توضیحات لازمی که باید داده شود و کارهایی که نیاز است تا انجام دهم را بگو.
در حال انجام پروژه بصورت تک نفره هستم ولی خب میشه عمده چیز هایش را تک نفره هم انجام داد  
@SELab-Plc-Summer-2025.pdf  دستور العمل ازمایشگاه هم گذاشتم.  طبق این readme کامل را به من بده برای گزارش کار. سپس توضیح بده که چه نکاتی مهم است که به آنها اشاره کنم و چیز های خواسته شده مسئله چیست.   (بجای همگیت هم از گیتهاب استفاده میکنم و توضیحات مربوط به استفاده از کانبان را هم بگو) همه ی موارد نیاز از جمله کد های هر بخش را هم به من بده به همراه توضیحات مربوط. از صفر تا صد بگو چیکار باید بکنم.

## روال انجام آزمایش

1-   مستند  [BDD Example.pdf](https://hamgit.ir/sqrlab-public/sharif-software-engineering-lab/-/blob/main/educational-resources/BDD/Example.pdf?ref_type=heads) حاوی مثالی از نحوه به‌کارگیری BDD در محیط IntelliJ است. مستند را به دقت مطالعه کنید
و مراحل آن را به ‌صورت عملی انجام دهید.

2-   در انتهای مستند، هنگام اجرای Scenario Outline، برخی تست­ها با مشکل undefined
مواجه می شوند:

- این موارد تست کدامند؟
- علت بروز مشکل چیست؟
- مشکل را با تغییر کد برطرف نمایید.

توضیح مربوط به این بخش را باید به صورت یک
گزارش کوتاه (در حد چند خط) از علت بروز مشکل و نحوه رفع آن ارائه کنید.

3-   مشابه مراحل انجام کار در مستند مذکور، پیاده‌سازی‌های
لازم برای مسئله زیر را انجام دهید. این پیاده‌سازی شامل نوشتن سناریوهای تست به
دو صورت عادی و outline (فایل feature)، تبدیل سناریوها به موارد تست (Stepdefs)، نوشتن کد برنامه، اجرای تست و مشاهده نتایج پاس شدن سناریوها می‌باشد
*با فرض وارد کردن دو عدد صحیح به عنوان ورودی به یک ماشین حساب و فشردن کلیدهای ضرب (*), تقسیم (/) و یا توان (^) نتیجه عملیات ضرب و تقسیم دو عدد بر یکدیگر و یا به توان رساندن (با کمک عملگر ضرب) به درستی نشان داده شود. در واقع، ورودی‌ها شامل دو عدد صحیح و یک عملگر به صورت زیر می‌باشد:

Examples:

| first | second | opt | result |
| 6 | 2 | * | 12 |
| 6 | 2 | / | 3 |
| 6 | 2 | ^ | 36 |

- پروژه باید به‌طور کامل و به درستی قابل اجرا بوده و نتایج پاس شدن سناریوهای تست در آن مشخص باشد (در صورت عدم اجرا توسط دستیاران آموزشی، نمره‌ای به آن تعلق نخواهد گرفت). 
- لازم است تمامی سناریوهای تست در نظر گرفته شوند.

موفق باشید

---

## دستیار

بله؛ این پروژه را می‌توانی کاملاً تک‌نفره انجام بدهی. برای اینکه هم بخش فنی درست باشد و هم گزارش‌کارت شکل یک پروژه مهندسی نرم‌افزار واقعی داشته باشد، بهتر است مراحل را با GitHub Issues، Branch، Pull Request و GitHub Projects/Kanban ثبت کنی.

یک نکته: فایلی که در این گفتگو در دسترس من قرار گرفته **Example.pdf** است. فایل جداگانه‌ای با نام `SELab-Plc-Summer-2025.pdf` در فایل‌های قابل دسترسی من نیست؛ بنابراین بخش زیر را دقیقاً بر اساس `Example.pdf` و متن صورت‌مسئله‌ای که خودت فرستادی تنظیم کرده‌ام. اگر آن PDF فایل دیگری است، آن را هم بفرستی می‌توانم در انتها گزارش را با rubric رسمی آن تطبیق بدهم.

برای راحتی، هم **README آماده تحویل** و هم **کل پروژه Maven آماده** را ساخته‌ام:

[دانلود README کامل](sandbox:/mnt/data/SELab-BDD-README.md)

[دانلود پروژه کامل به‌صورت ZIP](sandbox:/mnt/data/SELab-BDD-Calculator.zip)

---

# 1. دقیقاً از تو چه خواسته شده است؟

آزمایش عملاً سه بخش دارد.

**بخش اول:** مثال جمع دو عدد موجود در PDF را عیناً پیاده‌سازی کنی. در فایل، ابتدا پروژه Maven ساخته می‌شود و dependencyهای `Cucumber 1.2.5` و `JUnit 4.12` اضافه می‌شوند. سپس یک feature برای جمع دو عدد نوشته شده که شامل `Given / When / Then` است.

**بخش دوم:** `Scenario Outline` انتهای مستند را اجرا کنی، خطای `undefined` را پیدا کنی و علت و اصلاح آن را در چند خط توضیح بدهی. جدول مستند این سه تست را دارد:

```text
| first | second | result |
| 1     | 12     | 13     |
| -1    | 6      | 5      |
| 2     | 2      | 4      |
```

**بخش سوم:** مشابه همان مثال، ماشین‌حسابی بسازی که دو عدد صحیح و یکی از عملگرهای زیر را بگیرد:

```text
*
/
^
```

و باید هم **Scenario معمولی** و هم **Scenario Outline** داشته باشی، Step Definition بنویسی، برنامه را پیاده‌سازی کنی و نشان بدهی تمام تست‌ها Pass شده‌اند.

---

# 2. جواب مهم بخش undefined چیست؟

این مورد را حتماً در گزارش بنویس.

در PDF، Step Definition ورودی به این صورت تعریف شده است:

```java
@Given("^Two input values, (\\d+) and (\\d+)$")
public void twoInputValuesAnd(int arg0, int arg1) {
    value1 = arg0;
    value2 = arg1;
}
```

و Step نتیجه نیز با `\d+` تعریف شده است.

اما در Scenario Outline یک مقدار `-1` داریم.

عبارت:

```regex
\d+
```

فقط رقم را match می‌کند و علامت `-` را قبول نمی‌کند.

پس **تست مشکل‌دار این مورد است:**

```text
first = -1
second = 6
result = 5
```

و Step زیر undefined می‌شود:

```gherkin
Given Two input values, -1 and 6
```

راه‌حل:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
```

`-?` یعنی علامت منفی می‌تواند وجود داشته باشد یا نداشته باشد.

### متن کوتاهی که می‌توانی عیناً در گزارش بگذاری

> در Scenario Outline، تست مربوط به `first=-1`، `second=6` و `result=5` به حالت undefined می‌رفت. علت این مسئله استفاده از عبارت منظم `\d+` در Step Definition بود که تنها اعداد بدون علامت را شناسایی می‌کند و مقدار `-1` با آن تطبیق داده نمی‌شود. با تغییر عبارت منظم به `-?\d+`، علامت منفی به‌صورت اختیاری پذیرفته شد و سناریوی مربوط به اعداد منفی نیز با موفقیت اجرا شد.

این مهم‌ترین جواب نظری آزمایش است.

---

# 3. ترتیب درست انجام پروژه

پیشنهاد می‌کنم دقیقاً این ترتیب را بروی؛ مخصوصاً مرحله undefined را زودتر fix نکن، چون باید اول آن را **بازتولید** کنی و از آن screenshot بگیری.

## مرحله 1 — ساخت Repository در GitHub

یک repository مثلاً با نام:

```text
SELab-BDD-Calculator
```

بساز.

بعد پروژه را clone کن یا پروژه محلی را به آن متصل کن.

شروع کار:

```bash
git init
git add .
git commit -m "chore: initialize BDD calculator project"

git branch -M main
git remote add origin <repository-url>
git push -u origin main
```

در `.gitignore`:

```gitignore
target/
.idea/
*.iml
out/
.DS_Store
```

---

# 4. Kanban روی GitHub

چون تک‌نفره هستی، استفاده از Kanban همچنان کاملاً معنی دارد. در واقع نشان می‌دهد کار را مرحله‌ای مدیریت کرده‌ای.

در **GitHub Projects** یک Board بساز و این ستون‌ها را داشته باش:

```text
Backlog
   ↓
Todo
   ↓
In Progress
   ↓
Review / Test
   ↓
Done
```

Issueهای پیشنهادی:

| Issue | کار |
|---|---|
| #1 | Setup Maven project and dependencies |
| #2 | Reproduce BDD addition example |
| #3 | Reproduce and fix undefined Scenario Outline |
| #4 | Implement multiplication |
| #5 | Implement division |
| #6 | Implement power using repeated multiplication |
| #7 | Write normal Gherkin scenarios |
| #8 | Write Scenario Outline and edge cases |
| #9 | Configure Runner and run tests |
| #10 | Complete README and screenshots |

مثلاً وقتی روی Issue شماره 3 کار می‌کنی:

```bash
git checkout -b fix/negative-number-step
```

بعد از اصلاح:

```bash
git add .
git commit -m "fix: support signed integers in BDD step definitions"
git push -u origin fix/negative-number-step
```

در GitHub یک PR به `main` بزن و در توضیح آن بنویس:

```text
Closes #3
```

حتی اگر خودت هم author و reviewer هستی اشکالی ندارد؛ هدف این است که فرآیند توسعه مشخص باشد.

بعد از merge، کارت Issue را به `Done` منتقل کن.

---

# 5. ساخت Maven Project

در IntelliJ:

```text
File
→ New Project
→ Maven
```

ساختار نهایی بهتر است این باشد:

```text
SELab-BDD-Calculator/
│
├── pom.xml
├── README.md
├── .gitignore
│
└── src/
    ├── main/
    │   └── java/
    │       └── calculator/
    │           └── Calculator.java
    │
    └── test/
        ├── java/
        │   └── calculator/
        │       ├── MyStepdefs.java
        │       └── RunnerTest.java
        │
        └── resources/
            └── features/
                ├── addition.feature
                └── calculator.feature
```

---

# 6. فایل `pom.xml`

برای اینکه دقیقاً با دستورکار آزمایشگاه سازگار باشی، نسخه‌های dependency را همان نسخه PDF گذاشته‌ام.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>edu.sharif.selab</groupId>
    <artifactId>bdd-calculator</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>

        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.5</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.22.2</version>
            </plugin>
        </plugins>
    </build>

</project>
```

---

# 7. ابتدا مثال PDF را اجرا کن

فایل:

```text
src/test/resources/features/addition.feature
```

ابتدا دقیقاً بنویس:

```gherkin
Feature: Addition example from the laboratory document

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

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

# 8. برای بازتولید خطا اول StepDefs غلط را بنویس

در ابتدا، برای اینکه خروجی آزمایشگاه را واقعاً مشاهده کنی:

```java
@Given("^Two input values, (\\d+) and (\\d+)$")
public void twoInputValuesAnd(int arg0, int arg1) {
    value1 = arg0;
    value2 = arg1;
}
```

اجرا کن.

باید Scenario دارای `-1` undefined شود.

**از این خروجی screenshot بگیر.**

بعد اصلاحش کن:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
public void twoInputValuesAnd(int arg0, int arg1) {
    value1 = arg0;
    value2 = arg1;
}
```

و دوباره تست را اجرا کن.

این یکی از مهم‌ترین شواهد گزارش توست.

---

# 9. مسئله اصلی ماشین حساب

سه عملیات باید داشته باشی:

```text
6 * 2 = 12
6 / 2 = 3
6 ^ 2 = 36
```

و نکته مهم:

> توان باید با کمک عملگر ضرب پیاده‌سازی شود.

پس بهتر است از:

```java
Math.pow(...)
```

استفاده نکنی.

---

# 10. کد کامل `Calculator.java`

```java
package calculator;

public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double multiply(int a, int b) {
        return (double) a * b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException(
                    "Division by zero is not allowed"
            );
        }

        return (double) a / b;
    }

    public double power(int base, int exponent) {

        if (base == 0 && exponent < 0) {
            throw new ArithmeticException(
                    "Zero cannot be raised to a negative power"
            );
        }

        if (exponent == 0) {
            return 1.0;
        }

        long exp = exponent;

        boolean negativeExponent = exp < 0;

        if (negativeExponent) {
            exp = -exp;
        }

        double result = 1.0;

        for (long i = 0; i < exp; i++) {
            result *= base;
        }

        if (negativeExponent) {
            return 1.0 / result;
        }

        return result;
    }

    public double calculate(
            int first,
            int second,
            char operator
    ) {

        switch (operator) {

            case '*':
                return multiply(first, second);

            case '/':
                return divide(first, second);

            case '^':
                return power(first, second);

            default:
                throw new IllegalArgumentException(
                        "Unsupported operator: " + operator
                );
        }
    }
}
```

---

# 11. چرا خروجی را `double` گرفته‌ام؟

چون ورودی‌ها باید integer باشند، نه الزاماً خروجی.

مثلاً:

```text
7 / 2
```

جواب ریاضی آن:

```text
3.5
```

است.

اگر بنویسی:

```java
int result = 7 / 2;
```

Java جواب `3` می‌دهد.

بنابراین:

```java
return (double) a / b;
```

انتخاب مطمئن‌تری است.

---

# 12. توان با ضرب دقیقاً چگونه انجام می‌شود؟

مثلاً:

```text
6 ^ 3
```

به شکل زیر محاسبه می‌شود:

```text
result = 1

result = result * 6 → 6
result = result * 6 → 36
result = result * 6 → 216
```

همان:

```java
for (long i = 0; i < exp; i++) {
    result *= base;
}
```

---

# 13. Feature اصلی ماشین‌حساب

```gherkin
Feature: Integer calculator multiplication, division and power

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

  Scenario: division by zero
    Given Two input values, 6 and 0
    When I press the / key
    Then I expect a division by zero error
```

---

# 14. کدام تست‌ها واقعاً الزامی هستند؟

حداقل این سه مورد را **حتماً** در Examples داشته باش:

```gherkin
Examples:
  | first | second | opt | result |
  | 6     | 2      | *   | 12     |
  | 6     | 2      | /   | 3      |
  | 6     | 2      | ^   | 36     |
```

اما بهتر است تعدادی edge case هم اضافه کنی:

```text
عدد منفی
صفر
دو عدد منفی
تقسیم غیرصحیح مثل 7/2
توان صفر
پایه منفی
توان منفی
تقسیم بر صفر
```

---

# 15. Step Definitions کامل

```java
package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    private Calculator calculator;

    private int value1;
    private int value2;

    private double result;

    private RuntimeException exception;


    @Before
    public void before() {

        calculator = new Calculator();

        result = 0.0;

        exception = null;
    }


    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(
            int arg0,
            int arg1
    ) {

        value1 = arg0;
        value2 = arg1;
    }


    @When("^I add the two values$")
    public void iAddTheTwoValues() {

        result = calculator.add(
                value1,
                value2
        );
    }


    @When("^I press the ([*/^]) key$")
    public void iPressTheOperatorKey(
            String operator
    ) {

        try {

            result = calculator.calculate(
                    value1,
                    value2,
                    operator.charAt(0)
            );

        } catch (RuntimeException ex) {

            exception = ex;
        }
    }


    @Then("^I expect the result (-?\\d+(?:\\.\\d+)?)$")
    public void iExpectTheResult(
            double expected
    ) {

        Assert.assertNull(
                "Unexpected exception: "
                        + (exception == null
                        ? ""
                        : exception.getMessage()),
                exception
        );

        Assert.assertEquals(
                expected,
                result,
                1e-9
        );
    }


    @Then("^I expect a division by zero error$")
    public void iExpectADivisionByZeroError() {

        Assert.assertNotNull(
                "Expected an exception",
                exception
        );

        Assert.assertTrue(
                exception instanceof ArithmeticException
        );

        Assert.assertEquals(
                "Division by zero is not allowed",
                exception.getMessage()
        );
    }
}
```

---

# 16. Regexها را در گزارش توضیح بده

```java
(-?\\d+)
```

یعنی:

```text
-?    → علامت منفی صفر یا یک بار
\d+   → یک یا چند رقم
```

و برای نتیجه:

```java
(-?\\d+(?:\\.\\d+)?)
```

اعداد صحیح، منفی و اعشاری را می‌پذیرد.

---

# 17. Runner

```java
package calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "calculator",
        monochrome = true
)
public class RunnerTest {
}
```

---

# 18. اجرای پروژه

```bash
mvn clean test
```

یا IntelliJ:

```text
Maven
→ Lifecycle
→ test
```

یا:

```text
RunnerTest.java
→ Right Click
→ Run
```

---

# 19. شرط بسیار مهم تحویل

حتماً قبل از تحویل روی یک clone تمیز تست کن:

```bash
git clone <repository-url>
cd SELab-BDD-Calculator
mvn clean test
```

---

# 20. چه screenshotهایی بگیری؟

1. ساخت Maven Project.
2. `pom.xml` و dependencyها.
3. ساختار `src/main` و `src/test`.
4. `addition.feature`.
5. Step Definition اولیه دارای `\d+`.
6. اجرای Outline و مشاهده undefined برای `-1`.
7. اصلاح regex به `-?\d+`.
8. Pass شدن Outline بعد از fix.
9. `calculator.feature`.
10. Scenarioهای معمولی.
11. Scenario Outline.
12. `Calculator.java`.
13. قسمت `power()` که نشان می‌دهد از ضرب استفاده کرده‌ای.
14. `MyStepdefs.java`.
15. `RunnerTest.java`.
16. خروجی نهایی تمام تست‌های Pass.
17. صفحه GitHub repository.
18. commit history.
19. Issues.
20. Kanban.
21. یک PR نمونه.
22. Board نهایی.

---

# 21. Commit history پیشنهادی

```text
chore: initialize Maven BDD project
test: add laboratory addition feature
test: add addition step definitions
test: reproduce undefined step with negative input
fix: support signed integers in BDD steps
feat: implement multiplication
feat: implement division
feat: implement power using repeated multiplication
test: add normal calculator scenarios
test: add calculator scenario outline
test: add calculator edge cases
test: configure Cucumber JUnit runner
docs: complete laboratory README
```

---

# 22. برای گزارش Kanban چه بنویسم؟

> برای مدیریت فرایند توسعه از GitHub Projects به‌عنوان Kanban Board استفاده شد. فعالیت‌های پروژه در قالب Issue تعریف و در ستون‌های Backlog، Todo، In Progress، Review/Test و Done مدیریت شدند. با وجود تک‌نفره بودن پروژه، برای هر فعالیت اصلی یک Issue و در موارد مناسب یک Branch مجزا ایجاد شد. پس از تکمیل هر فعالیت، تغییرات commit شده و از طریق Pull Request وارد شاخه main شدند. این روش امکان مشاهده روند توسعه، ارتباط تغییرات کد با وظایف و وضعیت هر بخش از پروژه را فراهم می‌کند.

---

# 23. برای توضیح BDD در گزارش چه بنویسم؟

> در روش BDD، رفتار مورد انتظار سیستم پیش از یا همزمان با پیاده‌سازی در قالب سناریوهای قابل فهم برای انسان بیان می‌شود. در این پروژه سناریوها با زبان Gherkin و ساختار Given/When/Then نوشته شدند. Given وضعیت اولیه و ورودی‌ها، When عملیات مورد اجرا و Then نتیجه مورد انتظار را مشخص می‌کند. Cucumber این مراحل را از طریق Step Definitionها به متدهای Java متصل می‌کند و JUnit نیز برای بررسی نتیجه مورد انتظار استفاده می‌شود.

---

# 24. Given / When / Then در پروژه تو چه معنایی دارند؟

مثلاً:

```gherkin
Given Two input values, 6 and 2
When I press the * key
Then I expect the result 12
```

Given = وضعیت اولیه، When = رفتار مورد آزمون، Then = نتیجه مورد انتظار.

---

# 25. فرق Scenario و Scenario Outline

Scenario یک ورودی مشخص دارد؛ Scenario Outline یک template برای چند مجموعه داده است.

---

# 26. موارد تستی پیشنهادی

ضرب:
```text
6 * 2 = 12
-6 * 2 = -12
-6 * -2 = 12
0 * 5 = 0
```

تقسیم:
```text
6 / 2 = 3
7 / 2 = 3.5
-6 / 2 = -3
6 / 0 = error
```

توان:
```text
6 ^ 2 = 36
2 ^ 0 = 1
-2 ^ 3 = -8
2 ^ -2 = 0.25
```

---

# 27. نکات مهمی که دستیار احتمالاً روی آن حساس است

- هر سه عملگر `*`, `/`, `^`
- Scenario معمولی
- Scenario Outline
- سه Example صورت سؤال
- undefined واقعی و رفع آن
- توضیح regex
- توان با ضرب
- اجرای موفق با `mvn clean test`
- وجود همه فایل‌ها در repository
- خروجی Pass شدن تست‌ها

---

# 28. نتیجه نهایی برای README

> در این آزمایش ابتدا مثال BDD مربوط به جمع دو عدد مطابق دستورکار پیاده‌سازی شد. هنگام اجرای Scenario Outline مشخص شد سناریوی شامل مقدار `-1` به دلیل عدم پشتیبانی عبارت منظم `\d+` از اعداد علامت‌دار به حالت undefined می‌رود. با تغییر regex به `-?\d+` مشکل برطرف شد. سپس ماشین‌حسابی برای عملیات ضرب، تقسیم و توان پیاده‌سازی گردید. رفتار سیستم در قالب Scenarioهای عادی و Scenario Outline تعریف شد و Step Definitionهای متناظر برای اتصال سناریوهای Gherkin به کد Java نوشته شدند. عملیات توان با ضرب تکراری و بدون استفاده از `Math.pow` پیاده‌سازی شد. در نهایت تمامی سناریوهای تعریف‌شده با موفقیت اجرا شدند.

---

README آماده گزارش و پروژه کامل نیز در فایل‌های تولیدشده قرار داده شد.

---

## کاربر

خب بگو مرحله به مرحله اول فایل هام چی باشن و چجوری تغییرشون بدم و کلن بگو چجوری یکسری چیز هارو باید انجام بدم مثلا تست گرفتن و اینا

---

## دستیار

آره؛ بهترین کار این است که پروژه را **مرحله‌ای بسازی**، نه اینکه از همان اول همه فایل‌ها را با نسخه نهایی پر کنی. این‌طوری هم دقیقاً روند آزمایشگاه را انجام می‌دهی، هم خطای `undefined` را واقعاً می‌بینی، هم برای گزارش screenshot داری، هم history گیتت طبیعی می‌شود.

ترتیب زیر را دقیقاً اجرا کن:

1. **اول یک پروژه Maven خالی بساز.** در IntelliJ برو به `File > New > Project` و Maven را انتخاب کن. اسم پروژه را مثلاً بگذار `SELab-BDD-Calculator`.

   ```bash
   git init
   git add .
   git commit -m "chore: initialize Maven project"
   ```

2. **فایل `pom.xml` را تنظیم کن.** dependencyهای Cucumber/JUnit را مطابق دستورکار اضافه کن و برای تست اولیه بزن:

   ```bash
   mvn test
   ```

   اگر `BUILD SUCCESS` دیدی، dependencyها درست هستند.

3. **ساختار پوشه‌ها را بساز:**

   ```text
   src/
   ├── main/
   │   └── java/
   │       └── calculator/
   │           └── Calculator.java
   │
   └── test/
       ├── java/
       │   └── calculator/
       │       ├── MyStepdefs.java
       │       └── RunnerTest.java
       │
       └── resources/
           └── features/
               ├── addition.feature
               └── calculator.feature
   ```

4. **فعلاً فقط مثال جمع PDF را بساز.** `Calculator.java` در ابتدا فقط:

   ```java
   package calculator;

   public class Calculator {

       public int add(int a, int b) {
           return a + b;
       }
   }
   ```

5. **فایل feature اولیه:**

   ```gherkin
   Feature: Calculator

     Scenario: add two numbers
       Given Two input values, 1 and 2
       When I add the two values
       Then I expect the result 3
   ```

6. **Step Definition اولیه** را عمداً با regex اولیه بساز:

   ```java
   package calculator;

   import cucumber.api.java.Before;
   import cucumber.api.java.en.Given;
   import cucumber.api.java.en.Then;
   import cucumber.api.java.en.When;
   import org.junit.Assert;

   public class MyStepdefs {

       private Calculator calculator;
       private int value1;
       private int value2;
       private int result;

       @Before
       public void before() {
           calculator = new Calculator();
       }

       @Given("^Two input values, (\\d+) and (\\d+)$")
       public void twoInputValuesAnd(int arg0, int arg1) {
           value1 = arg0;
           value2 = arg1;
       }

       @When("^I add the two values$")
       public void iAddTheTwoValues() {
           result = calculator.add(value1, value2);
       }

       @Then("^I expect the result (\\d+)$")
       public void iExpectTheResult(int expected) {
           Assert.assertEquals(expected, result);
       }
   }
   ```

7. **Runner را بساز:**

   ```java
   package calculator;

   import cucumber.api.CucumberOptions;
   import cucumber.api.junit.Cucumber;
   import org.junit.runner.RunWith;

   @RunWith(Cucumber.class)
   @CucumberOptions(
           features = "src/test/resources/features",
           glue = "calculator",
           monochrome = true
   )
   public class RunnerTest {
   }
   ```

8. **اولین تست واقعی را بگیر:**

   ```bash
   mvn clean test
   ```

   یا `RunnerTest` را از IntelliJ اجرا کن. اگر Scenario ساده پاس شد، از آن screenshot بگیر.

9. **حالا Scenario Outline را اضافه کن:**

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

   بعد دوباره:

   ```bash
   mvn clean test
   ```

   و از undefined مربوط به `-1` screenshot بگیر.

10. **regex را اصلاح کن:**

   ```java
   @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
   ```

   و دوباره تست بگیر.

11. **حالا `Calculator.java` را برای ضرب، تقسیم و توان تکمیل کن.**

12. **فایل `calculator.feature` را بساز** و Scenarioهای عادی و Outline را اضافه کن.

13. **`MyStepdefs.java` را نسخه نهایی کن** تا operator و نتایج اعشاری/منفی را پشتیبانی کند.

14. **RunnerTest را حفظ کن.**

15. **تست نهایی بگیر:**

   ```bash
   mvn clean test
   ```

16. اگر خطا دیدی:
   - `Undefined step` → متن feature با regex StepDefs match نیست.
   - `No features found` → مسیر `features` در Runner را چک کن.
   - `cannot find symbol Calculator` → package/path را بررسی کن.

17. بعد GitHub را مرتب کن و commitهای معنی‌دار بزن.

18. Kanban را با ستون‌های:
   `Backlog → Todo → In Progress → Review/Test → Done`
   مدیریت کن.

19. از مراحل کلیدی screenshot بگیر.

20. قبل از تحویل، یک clone تمیز بگیر و `mvn clean test` اجرا کن.

در عمل، **الان فقط مراحل 1 تا 8 را انجام بده**؛ بعد برو مرحله Scenario Outline و عمداً undefined را تولید کن.

---

## کاربر

at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

[ERROR] Scenario: add two numbers  Time elapsed: 0.011 s  <<< ERROR!
java.lang.ExceptionInInitializerError
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)
        ...
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.util.Comparator java.util.TreeMap.comparator accessible: module java.base does not "opens java.util" to unnamed module @6bf256fa
        ...
[ERROR] Tests run: 4, Failures: 0, Errors: 2, Skipped: 2
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
...
PS C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD> 

This is where I first run the runnerTest

---

## دستیار

این خطا **از سناریوی BDD یا کد `Calculator` تو نیست**. اجرای Runner درست شروع شده، ولی قبل از اینکه Cucumber بتواند Step را اجرا کند، کتابخانه قدیمی Cucumber/XStream با Java جدید درگیر شده است.

خط کلیدی این است:

```text
Caused by: java.lang.reflect.InaccessibleObjectException:
Unable to make field private final java.util.Comparator
java.util.TreeMap.comparator accessible:
module java.base does not "opens java.util" to unnamed module
```

یعنی `Cucumber 1.2.5` که دستورکار استفاده کرده خیلی قدیمی است و داخل خودش نسخه قدیمی XStream دارد. این کتابخانه می‌خواهد با Reflection به `java.util.TreeMap` دسترسی داخلی بگیرد، ولی Javaهای جدید مثل 17/21 این دسترسی را به‌صورت پیش‌فرض مسدود می‌کنند.

## اول هیچ کدام از فایل‌های feature یا StepDefs را تغییر نده

فعلاً این‌ها مشکل ندارند:

```text
addition.feature
MyStepdefs.java
RunnerTest.java
Calculator.java
```

ما اول باید Java environment را درست کنیم.

### مرحله 1 — ببین Maven واقعاً با چه Javaای اجرا می‌شود

```powershell
java -version
mvn -v
```

اگر Maven با Java 17/19/21 اجرا شود، علت مشخص است.

راه پیشنهادی برای دستورکار قدیمی JDK 8 است، چون dependencyها متعلق به همان دوران‌اند؛ ولی اگر بخواهی با Java جدید ادامه بدهی، می‌توانیم با `--add-opens` دسترسی مورد نیاز XStream را باز کنیم.

همچنین دقت کن:

```xml
<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>
```

به این معنی نیست که Maven خودش با Java 8 اجرا می‌شود؛ فقط target کامپایل را تعیین می‌کند.

خطای فعلی `InaccessibleObjectException` همان undefined موردنظر آزمایش نیست. undefined واقعی را بعداً باید برای ورودی منفی بازتولید کنیم.

---

## کاربر

نمیشه با همین درستش کنی؟

PS C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD> mvn -v
Apache Maven 3.9.1 (2e178502fcdbffc201671fb2537d0cb4b4cc58f8)
Maven home: C:\Maven\apache-maven-3.9.1
Java version: 19.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-19
Default locale: en_US, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
PS C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD>

---

## دستیار

بله، با همین **JDK 19** هم می‌شود درستش کرد و لازم نیست فعلاً Java 8 نصب کنی. مشکل فقط این است که Cucumber قدیمی `1.2.5` می‌خواهد به بخش داخلی `java.util` دسترسی Reflection داشته باشد و Java 19 جلوی آن را می‌گیرد.

اول یک تست سریع:

```powershell
mvn clean test -DargLine="--add-opens java.base/java.util=ALL-UNNAMED"
```

یا در `pom.xml` داخل Surefire:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0</version>
            <configuration>
                <argLine>
                    --add-opens java.base/java.util=ALL-UNNAMED
                </argLine>
            </configuration>
        </plugin>
    </plugins>
</build>
```

بعد:

```powershell
mvn clean test
```

اگر خطای مشابه برای package دیگری آمد، همان package را هم با `--add-opens` باز می‌کنیم.

این تنظیم برای این است که dependencyهای قدیمی آزمایشگاه را نگه داریم و Java 19 را سازگار کنیم.

دقت کن این مشکل با undefined مربوط به regex فرق دارد؛ آن بخش را بعد از درست شدن محیط اجرا بررسی می‌کنیم.

---

## کاربر

ببین فایل پروژه تا همون مرحله رو خودت بهم بده و چک کن pom اش درست باشه. فکر کنم تازه داشته RunnerTest رو برای بار اول اجرا میکردم

---

## دستیار

آره. پروژه را دقیقاً تا همان مرحله‌ای که **RunnerTest ساخته شده و هنوز Scenario Outline را اضافه نکرده‌ایم** آماده کردم.

[دانلود پروژه تا مرحله اولین اجرای RunnerTest](sandbox:/mnt/data/BDD-Stage-First-RunnerTest.zip)

داخلش این ساختار است:

```text
BDD-Stage-First-RunnerTest/
├── pom.xml
├── .gitignore
├── README_STAGE.md
│
└── src/
    ├── main/
    │   └── java/
    │       └── calculator/
    │           └── Calculator.java
    │
    └── test/
        ├── java/
        │   └── calculator/
        │       ├── MyStepdefs.java
        │       └── RunnerTest.java
        │
        └── resources/
            └── features/
                └── addition.feature
```

`pom.xml` را validate کردم و dependencyهای Cucumber 1.2.5 و JUnit 4.12 را دارد. برای Java 19 هم این گزینه داخل Surefire قرار داده شده:

```xml
<argLine>
    --add-opens java.base/java.util=ALL-UNNAMED
</argLine>
```

در این snapshot، `Calculator.java` هنوز فقط جمع دارد و `MyStepdefs.java` عمداً هنوز regex اولیه `(\\d+)` را دارد تا بعداً Scenario Outline و undefined را مرحله‌ای بازتولید کنیم.

الان ZIP را extract کن و از root پروژه بزن:

```powershell
mvn clean test
```

فعلاً فقط Scenario ساده `1 + 2 = 3` باید Pass شود.

---

## کاربر

[پیوست متنی: خروجی اجرای تست]

```text
3 Steps (1 failed, 2 skipped)
0m0.181s

java.lang.ExceptionInInitializerError
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        at Γ£╜.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @13969fbe
        at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
        at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
        at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

[ERROR] Tests run: 4, Failures: 0, Errors: 2, Skipped: 2, Time elapsed: 0.58 s <<< FAILURE! - in calculator.RunnerTest
[ERROR] Scenario: add two numbers.Given Two input values, 1 and 2  Time elapsed: 0.009 s  <<< ERROR!
java.lang.ExceptionInInitializerError
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        at Γ£╜.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @13969fbe
        at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
        at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
        at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

[ERROR] Scenario: add two numbers  Time elapsed: 0.011 s  <<< ERROR!
java.lang.ExceptionInInitializerError
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        at Γ£╜.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @13969fbe
        at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
        at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
        at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
        at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
        at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
        at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
        at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
        at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
        at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
        at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
        at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
        at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
        at cucumber.runtime.Runtime.runStep(Runtime.java:300)
        at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
        at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
        at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
        at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
        at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
        at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
        at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
        at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:316)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:240)
        at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:214)
        at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:155)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

[INFO] 
[INFO] Results:
[INFO]
[ERROR] Errors: 
[ERROR]   null
[ERROR]   null
[INFO]
[ERROR] Tests run: 4, Failures: 0, Errors: 2, Skipped: 2
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.027 s
[INFO] Finished at: 2026-09-04T20:57:34+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.0.0:test (default-test) on project bdd-calculator:
[ERROR]
[ERROR] Please refer to C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```

---

## دستیار

آره، مشخصه که تنظیم قبلی **تا حدی اثر کرده**؛ چون خطا از `java.util` رفته و حالا روی `java.lang.reflect` گیر کرده. یعنی JDK 19 دارد Cucumber/XStream قدیمی را مرحله‌به‌مرحله به خاطر Reflection محدود می‌کند.

برای اینکه مجبور نشویم هر بار یک package جدید اضافه کنیم، بهتر است `pom.xml` را یک‌بار کامل‌تر کنیم.

داخل `pom.xml` این قسمت:

```xml
<configuration>
    <argLine>
        --add-opens java.base/java.util=ALL-UNNAMED
    </argLine>
</configuration>
```

را با این جایگزین کن:

```xml
<configuration>
    <argLine>
        --add-opens java.base/java.util=ALL-UNNAMED
        --add-opens java.base/java.lang.reflect=ALL-UNNAMED
        --add-opens java.base/java.text=ALL-UNNAMED
        --add-opens java.desktop/java.awt.font=ALL-UNNAMED
    </argLine>
</configuration>
```

بعد:

```powershell
mvn clean test
```

را اجرا کن.

هنوز Scenario Outline را اضافه نکن تا ابتدا اجرای سناریوی ساده کاملاً پایدار شود. خروجی فعلی نشان می‌دهد Cucumber feature را پیدا می‌کند و مشکل در XStream/JDK است، نه در مسیر feature یا Step Definition.

---

## کاربر

I got this after testing after fixing like below:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
public void twoInputValuesAnd(int arg0, int arg1) {
    value1 = arg0;
    value2 = arg1;
}
```

[پیوست متنی: خروجی اجرای IntelliJ RunnerTest]

```text
"C:\Program Files\Java\jdk-19\bin\java.exe" -ea --add-opens java.base/java.util=ALL-UNNAMED -DnodeNamesHandler=org.jetbrains.plugins.cucumber.java.run.CucumberTestTreeNodeManager -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\lib\idea_rt.jar=55457:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\plugins\junit\lib\junit-rt.jar;C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD\target\test-classes;C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD\target\classes;C:\Users\Haj Ali\.m2\repository\info\cukes\cucumber-junit\1.2.5\cucumber-junit-1.2.5.jar;C:\Users\Haj Ali\.m2\repository\info\cukes\cucumber-core\1.2.5\cucumber-core-1.2.5.jar;C:\Users\Haj Ali\.m2\repository\info\cukes\cucumber-html\0.2.3\cucumber-html-0.2.3.jar;C:\Users\Haj Ali\.m2\repository\info\cukes\cucumber-jvm-deps\1.0.5\cucumber-jvm-deps-1.0.5.jar;C:\Users\Haj Ali\.m2\repository\info\cukes\gherkin\2.12.2\gherkin-2.12.2.jar;C:\Users\Haj Ali\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\Haj Ali\.m2\repository\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar;C:\Users\Haj Ali\.m2\repository\info\cukes\cucumber-java\1.2.5\cucumber-java-1.2.5.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2022.2\plugins\cucumber-java\lib\cucumber-jvmFormatter.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 calculator.RunnerTest

java.lang.ExceptionInInitializerError
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Test ignored.

Test ignored.

java.lang.ExceptionInInitializerError
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 12(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Test ignored.

Test ignored.

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 12(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, -1 and 6(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Test ignored.

Test ignored.

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, -1 and 6(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 2 and 2(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Test ignored.

Test ignored.

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter

	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 2 and 2(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Failed scenarios:
addition.feature:3 # Scenario: add two numbers
addition.feature:16 # Scenario Outline: add two numbers
addition.feature:17 # Scenario Outline: add two numbers
addition.feature:18 # Scenario Outline: add two numbers

4 Scenarios (4 failed)
12 Steps (4 failed, 8 skipped)
0m0.220s

java.lang.ExceptionInInitializerError
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 2(addition.feature:4)
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 1 and 12(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, -1 and 6(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)

java.lang.NoClassDefFoundError: Could not initialize class cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
	at ?.Given Two input values, 2 and 2(addition.feature:10)
Caused by: java.lang.ExceptionInInitializerError: Exception java.lang.reflect.InaccessibleObjectException: Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect.Proxy.h accessible: module java.base does not "opens java.lang.reflect" to unnamed module @23ab930d [in thread "main"]
	at java.base/java.lang.reflect.AccessibleObject.throwInaccessibleObjectException(AccessibleObject.java:387)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:363)
	at java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:311)
	at java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:180)
	at java.base/java.lang.reflect.Field.setAccessible(Field.java:174)
	at cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)
	at cucumber.deps.com.thoughtworks.xstream.converters.extended.DynamicProxyConverter.<clinit>(DynamicProxyConverter.java:42)
	at cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:833)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:574)
	at cucumber.deps.com.thoughtworks.xstream.XStream.<init>(XStream.java:530)
	at cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.<init>(LocalizedXStreams.java:50)
	at cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)
	at cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)
	at cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)
	at cucumber.runtime.Runtime.runStep(Runtime.java:300)
	at cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)
	at cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)
	at cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)
	at cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)
	at cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)
	at cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at cucumber.api.junit.Cucumber.run(Cucumber.java:100)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
	at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
	at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
	at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
	at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)


Process finished with exit code -1
```

---

## دستیار

آره، الان معلوم شد مشکل دقیقاً کجاست. **اصلاح regex تو درست است**:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
public void twoInputValuesAnd(int arg0, int arg1) {
    value1 = arg0;
    value2 = arg1;
}
```

اما تستی که فرستادی هنوز به خاطر Java 19 و Cucumber قدیمی fail می‌شود، نه به خاطر regex.

مهم‌ترین نکته در لاگت این است که داری `RunnerTest` را **مستقیم با دکمه Run در IntelliJ** اجرا می‌کنی. command اجرای IntelliJ فقط این VM option را دارد:

```text
--add-opens java.base/java.util=ALL-UNNAMED
```

ولی خطا می‌گوید `java.lang.reflect` هم باید باز باشد.

پس دو راه داری:

### راه ساده‌تر: از Maven تست بگیر

اگر `pom.xml` را با `argLine` کامل کرده‌ای:

```powershell
mvn clean test
```

### اگر می‌خواهی با فلش سبز IntelliJ هم کار کند

برو به:

```text
Run
→ Edit Configurations
→ RunnerTest
```

در **VM options** بگذار:

```text
--add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.text=ALL-UNNAMED --add-opens java.desktop/java.awt.font=ALL-UNNAMED
```

بعد Apply/OK و دوباره Run.

نکته مهم: `pom.xml` و Run Configuration خود IntelliJ دو چیز جدا هستند.

برای آزمایش دانشگاه نیز بعد از حل مشکل Java، regex را موقتاً به نسخه قبلی برگردان، undefined را برای `-1` مشاهده و screenshot کن، بعد دوباره به `-?\d+` اصلاحش کن.

---

## کاربر

این همون با mvn test عه

```text
[INFO] ------------------< edu.sharif.selab:bdd-calculator >-------------------
[INFO] Building bdd-calculator 1.0-SNAPSHOT
...
[INFO] Running calculator.RunnerTest

4 Scenarios (1 undefined, 3 passed)
12 Steps (2 skipped, 1 undefined, 9 passed)
0m0.261s

You can implement missing steps with the snippets below:

@Given("^Two input values, -(\\d+) and (\\d+)$")
public void two_input_values_and(int arg1, int arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

[WARNING] Tests run: 17, Failures: 0, Errors: 0, Skipped: 4
...
[INFO] BUILD SUCCESS
...
PS C:\Users\Haj Ali\Desktop\MyStuff\University\SE Az\4-BDD> mvn clean test
...
[INFO] Running calculator.RunnerTest

4 Scenarios (4 passed)
12 Steps (12 passed)
0m0.240s

[INFO] Tests run: 16, Failures: 0, Errors: 0, Skipped: 0
...
[INFO] BUILD SUCCESS
...
```

---

## دستیار

عالیه؛ الان دقیقاً به همان نقطه‌ای رسیدی که آزمایش ازت می‌خواهد. هر دو خروجی درست‌اند و حتی برای گزارش خیلی مناسب‌اند.

در اجرای اول، قبل از اصلاح regex، این را داری:

```text
4 Scenarios (1 undefined, 3 passed)
12 Steps (2 skipped, 1 undefined, 9 passed)
```

و Cucumber خودش Step گمشده را پیشنهاد داده. این دقیقاً ثابت می‌کند که سناریوی دارای عدد منفی یعنی `-1 and 6` با Step Definition قبلی match نشده است. پس **همین خروجی را حتماً برای گزارش screenshot بگیر**.

بعد از اینکه regex را به:

```java
@Given("^Two input values, (-?\\d+) and (-?\\d+)$")
```

تغییر دادی، خروجی دوم:

```text
4 Scenarios (4 passed)
12 Steps (12 passed)
```

و:

```text
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS
```

یعنی **بخش مثال PDF + پیدا کردن undefined + رفع آن را کامل انجام داده‌ای**.

از هر دو خروجی screenshot بگیر و وضعیت فعلی را commit کن:

```bash
git add .
git commit -m "fix: support negative integers in BDD step definitions"
```

بعد فایل `addition.feature` را نگه دار و یک فایل جدید `calculator.feature` برای بخش اصلی ضرب/تقسیم/توان بساز. از اینجا به بعد مراحل:
`calculator.feature` → `Calculator.java` → Step مربوط به operator → تست Scenarioهای عادی → Scenario Outline اصلی.

---

## کاربر

نه میگم چرا وقتی تو ترمینال میزنمش build میشه ولی وقتی میرم runnerTest رو اجرا میکنم build نمیشه

---

## دستیار

دلیلش اینه که این دو اجرا **از دو مسیر متفاوت** انجام می‌شن.

وقتی در ترمینال می‌زنی:

```powershell
mvn clean test
```

تست‌ها توسط **Maven Surefire** اجرا می‌شن و Surefire تنظیمات `pom.xml` رو می‌خونه؛ از جمله `argLine`هایی که اضافه کردیم.

اما وقتی روی `RunnerTest` در IntelliJ دکمه سبز Run رو می‌زنی، IntelliJ از **JUnit runner خودش** استفاده می‌کنه و تنظیم `argLine` داخل `pom.xml` رو نادیده می‌گیره.

برای اینکه خود `RunnerTest` هم از IntelliJ اجرا شود، برو به:

```text
Run
→ Edit Configurations
→ RunnerTest
```

و در **VM options** قرار بده:

```text
--add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.text=ALL-UNNAMED --add-opens java.desktop/java.awt.font=ALL-UNNAMED
```

پس:

```text
Maven → Surefire → JUnit
```

با:

```text
IntelliJ → JUnit Runner → RunnerTest
```

فرق دارد.

وضعیت پروژه در واقع خوب است چون:

```text
mvn clean test
→ 4 Scenarios (4 passed)
→ 12 Steps (12 passed)
→ BUILD SUCCESS
```

---

## کاربر

خب پس از خروجی mvn clean test اسکرین شات بگیرم اوکیه؟

---

## دستیار

آره، کاملاً اوکیه. برای گزارش حتی **خروجی `mvn clean test` بهتر از Run داخل IntelliJ** است، چون نشان می‌دهد پروژه از طریق Maven و مستقل از تنظیمات IDE قابل build و test شدن است.

بهتره screenshot طوری باشد که این بخش‌ها داخلش دیده شوند:

```text
Running calculator.RunnerTest
```

و مخصوصاً:

```text
4 Scenarios (4 passed)
12 Steps (12 passed)
```

و پایین‌تر:

```text
Tests run: 16, Failures: 0, Errors: 0, Skipped: 0
```

و در آخر:

```text
BUILD SUCCESS
```

برای بخش قبل از رفع `undefined` هم یک screenshot جدا بگیر که این را نشان بدهد:

```text
4 Scenarios (1 undefined, 3 passed)
12 Steps (2 skipped, 1 undefined, 9 passed)
```

این دوتا کنار هم خیلی خوب نشان می‌دهند:
قبل از fix → یک سناریو undefined بوده  
بعد از fix → همه سناریوها پاس شده‌اند

پس بله، برای گزارش از خروجی ترمینال `mvn clean test` استفاده کن.
