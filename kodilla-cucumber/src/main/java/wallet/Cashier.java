package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if(wallet.getBalance() < amount){
            System.out.println("You don't have enough money in your wallet");
        } else if (wallet.getBalance() > 0 && amount > 0) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
            }
    }
}
