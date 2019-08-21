import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.CashierFinOperation1;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Session;

import static org.testng.Assert.*;

public class Deposit {

    @Test(priority = 0)
    public void testMain() throws InterruptedException {

        Session.get().driver().get("http://localhost:4200/aut");
        AutorisationPage au = new AutorisationPage();
        au.confirmPage();
        au.loginInCabinet("cyndap-49@bigmir.net","123qaz");

        TraderControlPage page = new TraderControlPage();
        page.header.cashier.click();
        page.header.cashierFinOperation.click();

        CashierFinOperation1 fin = new CashierFinOperation1();
        fin.confirmPage();
        fin.createDepositInvoice(1,"Visa/Mastercard", "USD", "503369", "500");


    }

    @Test
    public void test(){
        TraderControlPage page = new TraderControlPage();
        page.header.trader.click();
        page.header.traderControl.click();
        page.header.cashier.click();
        page.header.cashierFinOperation.click();
        Session.get().close();

    }


}