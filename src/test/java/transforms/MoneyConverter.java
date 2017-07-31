package transforms;


import cucumber.api.Transformer;
import nicebank.Money;

/**
 * Created by Abel on 30/07/2017.
 */
public class MoneyConverter extends Transformer<Money> {
    public Money transform(String amount) {
        String[] numbers = amount.substring(1).split("\\.");

        int dollars = Integer.parseInt(numbers[0]);
        int cents = Integer.parseInt(numbers[1]);

        return new Money(dollars, cents);
    }
}
