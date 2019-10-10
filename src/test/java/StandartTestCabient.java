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



        String http = prod; // ------> адресс



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

            openAcc.premAcc.click();
            openAcc.setPlatformAcc("MT5");
            openAcc.setCurrencyAcc("USD");
            openAcc.setLeverageAcc(100);

            OpenAccountInfoPage infoAcc = openAcc.openAcc();
            String accNum = infoAcc.accountNumber.getText();

            openAcc.header.trader.click();
            openAcc.header.traderControl.click();
            page.confirmPage();
            page.openAccountButton.click();

            openAcc.proAcc.click();
            openAcc.setPlatformAcc("MT5");
            openAcc.setCurrencyAcc("USD");
            openAcc.setLeverageAcc(100);
            openAcc.openAccButt.click();

            page.header.userInfo.click();
            page.header.userSettings.click();
            SettingsSecurityBlock secBlock = new SettingsSecurityBlock();
            secBlock.seccuritySection.click();

            page.header.cashier.click();
            page.header.cashierFinOperation.click();
            CashierFinOperation1 fin = new CashierFinOperation1();
            fin.confirmPage();

            //"508369" - prod:   "503369" - dev
            fin.createDepositInvoice(1,"Visa/Mastercard", "USD", accNum, "500");

            CashierFinOperation2 conf = new CashierFinOperation2();
            conf.confirmPage();
            conf.confirmButton.click();


        }finally {
            Session.get().close();
        }
    }
}