package seasonchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItSummerSteps {
    private MonthDay today;
    private String answer;

    @Given("today is last day of December")
    public void today_is_last_day_of_december() {
        this.today = MonthDay.of(12, 31);
    }
    @When("I ask whether it's Summer")
    public void i_ask_whether_it_s_summer() {
        this.answer = SeasonChecker.checkIfSummer(this.today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, this.answer);
    }



    @Given("today is first day of August")
    public void today_is_first_day_of_august() {
        this.today = MonthDay.of(8, 1);
    }


}
