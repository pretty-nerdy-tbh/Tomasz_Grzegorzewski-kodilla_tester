package wallet;

public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        if (amount > 0){this.contents = amount;}
    }

    public void clearContents(){
        this.contents = 0;
    }
}