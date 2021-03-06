import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.*;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.SettingsSecurityBlock;
import ua.kiev.prog.automation.framework.base.Session;

import static org.testng.Assert.*;

public class StandartTestCabient {

    @Test
    public void testMain() throws InterruptedException {
        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";



        String http = local; // ------> адресс



        Session.get().driver().get(http);

        try{
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

            page.header.userInfo.click();
            page.header.userSettings.click();
            SettingsSecurityBlock secBlock = new SettingsSecurityBlock();
            secBlock.seccuritySection.click();

            page.header.cashier.click();
            page.header.cashierFinOperation.click();
            CashierFinOperation1 fin = new CashierFinOperation1();
            fin.confirmPage();

            //"794654654 " - local
            fin.createWithdrawalInvoice(2,"SAFE","QIWI", "794654654 ", "10");
            CashierFinOperation2 fin2 = new CashierFinOperation2();
            fin2.confirmPage();
            fin2.confirmButton.click();



        }finally {
            Session.get().close();
        }
    }
}