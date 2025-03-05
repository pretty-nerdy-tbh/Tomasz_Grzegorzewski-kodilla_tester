package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhetherItIsDivisibleSteps {

    private int dividend;
    private String answer;

    @Given("Number is {int}")
    public void number_is(int dividend) {
        this.dividend = dividend;
    }
    @When("I ask whether number is divisible by 3, 5 or both")
    public void i_ask_whether_number_is_divisibl_bye_3_5_or_both() {
        this.answer = DivisiblityChecker.isItDivisible(this.dividend);
    }
    @Then("Then the system returns {string}")
    public void then_the_system_returns(String string) {
        assertEquals(string, this.answer);
    }
}
