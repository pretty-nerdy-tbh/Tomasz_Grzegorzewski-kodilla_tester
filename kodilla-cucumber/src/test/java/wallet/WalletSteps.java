package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_amout_in_my_wallet(int deposit) {
        wallet.deposit(deposit);
        Assertions.assertEquals(wallet.getBalance(), deposit, "Incorrect wallet balance");
    }
    @When("I request {int}")
    public void i_request_amout(int request) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, request);
    }
    @Then("I should get {int}")
    public void i_should_get_amout(int request) {
        Assertions.assertEquals(request, cashSlot.getContents());
    }
}
