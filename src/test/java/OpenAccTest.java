import org.testng.Assert;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.OpenAccountPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Session;

public class OpenAccTest extends Assert {

    @Test
   public void openAcc(){
        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";



        String http = local; // ------> адресс



        Session.get().driver().get(http);

        try {
            AutorisationPage auth = new AutorisationPage();
            auth.confirmPage();

            if(http.equalsIgnoreCase(prod)){
                auth.loginInCabinet("savchukvi12@gmail.com","4766147sv");}
            else {
                auth.loginInCabinet("cyndap-49@bigmir.net","123qaz");}

            TraderControlPage page = new TraderControlPage();
            page.confirmPage();
            page.openAccountButton.click();

            OpenAccountPage openAcc = new OpenAccountPage();
            openAcc.confirmPage();

            openAcc.openRealAcc("PRO","MT5", "USD", "1:100");

            page.header.trader.click();
            page.openAccountButton.click();

            openAcc.openDemoAcc("MT5", "Premium", "USD", 3000, "1:200");


        }finally {
            Session.get().close();
        }
    }

}
