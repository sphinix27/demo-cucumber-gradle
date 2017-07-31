package support;

import nicebank.Account;
import nicebank.CashSlot;
import nicebank.Teller;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by Abel on 30/07/2017.
 */
public class KnowsTheDomain {
    private Account myAccount;
    private Teller teller;
    private CashSlot cashSlot;
    private EventFiringWebDriver webDriver;

    public Account getMyAccount() {
        if (myAccount == null) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public Teller getTeller() {
        if (teller == null) {
            teller = new AtmUserInterface(getWebDriver());
        }
        return teller;
    }

    public EventFiringWebDriver getWebDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
//            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
//            this.webDriver = new EventFiringWebDriver(new ChromeDriver());
        }
        return webDriver;
    }
}
