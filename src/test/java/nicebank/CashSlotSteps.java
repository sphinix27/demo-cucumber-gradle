package nicebank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;

/**
 * Created by Abel on 30/07/2017.
 */
public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Then("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars, helper.getCashSlot().getContents());
    }
}
