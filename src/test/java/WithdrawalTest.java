import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.CashierFinOperation1;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.CashierFinOperation2;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Session;

public class WithdrawalTest {
    public static void main(String[] args) throws InterruptedException {

        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";

        Session.get().driver().get(local);

        try {
            AutorisationPage auth = new AutorisationPage();
            auth.confirmPage();
            auth.loginInCabinet("hdfghdfg@fdsf.fds", "123qaz");

            TraderControlPage page = new TraderControlPage();
            page.confirmPage();

            page.header.cashier.click();
            page.header.cashierFinOperation.click();

            CashierFinOperation1 fin1 = new CashierFinOperation1();
            fin1.confirmPage();

            fin1.createWithdrawalInvoice(2,"SAFE","QIWI","79415645641","100");

            CashierFinOperation2 fin2 = new CashierFinOperation2();
            fin2.confirmPage();

            for (int i = 0; i < 9; i++){
                page.header.getAllLanguages(i);
                fin2.confirmButton.click();
                System.out.println(page.header.getNameLangauge(i) + " - OK");
                Thread.sleep(2500);
            }

        }finally {
            Session.get().close();
        }

    }
}
