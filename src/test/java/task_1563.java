import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.SettingsPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.base.Session;

public class task_1563 {

    public static void main(String[] args) throws InterruptedException {


        String local = "http://localhost:4200/auth";
        String prod = "https://account.weltrade.com/auth/login";

        Session.get().driver().get(prod);

        AutorisationPage auth = new AutorisationPage();
        auth.loginInCabinet("savchukvi12@gmail.com" , "4766147sv");


        try{

            TraderControlPage page = new TraderControlPage();
            page.confirmPage();
            page.header.cashier.click();

            page.header.cashierHistory.click();

            /*Thread.sleep(7000);

            WebElement el1 = Session.get().driver().findElement(By.xpath("/html/body/app-root/app-pages/main/app-history/section/div/div/app-cashbox-history-table/div[11]/div[3]/p"));

            for(int i = 0; i < 9;i++){
                page.header.language.click();
                page.header.getAllLanguages(i).click();
                System.out.println(page.header.getNameLangauge(i) + " -> " + el1.getText());

            }*/


            page.header.userInfo.click();
            page.header.userSettings.click();

            SettingsPage sett = new SettingsPage();
            sett.security.click();
            sett.securitySection.logs.click();
            //Thread.sleep(10000);

            WebElement el2 = Session.get().driver().findElement(By.xpath("/html/body/app-root/app-pages/main/app-settings/section/div/div/div[2]/app-logs/div/div[2]/div[3]/p"));

            for (int i = 0; i < 9; i++){
                page.header.language.click();
                page.header.getAllLanguages(i).click();
                System.out.println(page.header.getNameLangauge(i) + " -> " + el2.getText());

            }



        }finally {
            Session.get().close();
        }

    }
}
