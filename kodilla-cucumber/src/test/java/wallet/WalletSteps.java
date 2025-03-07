package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WalletSteps {
    private final Wallet walletWithdrawal = new Wallet();
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    //cash_withdrawal
    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_amout_in_my_wallet(int deposit) {
        walletWithdrawal.deposit(deposit);
        Assertions.assertEquals(walletWithdrawal.getBalance(), deposit, "Incorrect wallet balance");
    }

    @When("I request {int}")
    public void i_request_amout(int request) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(walletWithdrawal, request);
    }
    @Then("I should get {int}")
    public void i_should_get_amout(int request) {
        Assertions.assertEquals(request, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be {int}")
    public void the_balance_of_my_wallet_should_be(Integer remaining_balance) {
        Assertions.assertEquals(remaining_balance, walletWithdrawal.getBalance());
        cashSlot.clearContents();
    }

    //Wspólny krok
    @Given("there is {int} in my wallet")
    public void there_is_in_my_wallet(int deposit) {
        wallet.deposit(deposit);
        Assertions.assertEquals(wallet.getBalance(), deposit, "Incorrect wallet balance");
    }

    //Prevent
    @When("I withdraw {int}")
    public void i_withdraw(int request) {
        Cashier cashier = new Cashier(cashSlot);
        System.setOut(new PrintStream(outContent));
        cashier.withdraw(wallet, request);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("You don't have enough money in your wallet", outContent.toString().trim());
    }


    //Display
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
    }

    @Then("I should see that the balance is {int}")
    public void i_should_see_that_the_balance_is(int expected_balance) {
        Assertions.assertEquals(expected_balance, wallet.getBalance());
    }

}
