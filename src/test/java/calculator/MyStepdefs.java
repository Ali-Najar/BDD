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
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
    }

    @When("^I press the ([*/^]) key$")
    public void iPressTheOperatorKey(String operator) {

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
    public void iExpectTheResult(double expected) {

        Assert.assertNull(
                "Unexpected exception",
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