import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Session;

public class testheagercabinet {
    public static void main(String[] args) throws InterruptedException {


        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";

        Session.get().driver().get(prod);

        AutorisationPage auth = new AutorisationPage();
        auth.loginInCabinet("savchukvi12@gmail.com", "4766147sv");

        try {

            TraderControlPage page = new TraderControlPage();
            page.confirmPage();
            page.openAccountButton.click();
           // page.header.cashier.moveCursorToElement();
           // Thread.sleep(10000);
            page.header.cashier.click();
            page.header.cashierHistory.click();
            Thread.sleep(5000);
        }
        finally {
            Session.get().close();
        }



    }


}
