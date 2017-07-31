package nicebank;

/**
 * Created by Abel on 30/07/2017.
 */
public class CashSlot {
    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int dollars) {
        contents = dollars;
    }
}
