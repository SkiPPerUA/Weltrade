import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Calculator;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.OnlineQuotes;
import ua.kiev.prog.automation.framework.base.Session;

import static org.testng.Assert.*;

public class QuotesPublicTest {

   @Test
    public static void main(String[] args) throws InterruptedException {

       String [] quotes = {"AUDUSD"	,
               "EURCHF"	,
               "EURGBP"	,
               "EURJPY"	,
               "EURUSD"	,
               "GBPCHF"	,
               "GBPJPY"	,
               "GBPUSD"	,
               "NZDUSD"	,
               "USDCAD"	,
               "USDCHF"	,
               "USDJPY"	,
               "AUDCAD"	,
               "AUDCHF"	,
               "AUDJPY"	,
               "AUDNZD"	,
               "CADCHF"	,
               "CADJPY"	,
               "CHFJPY"	,
               "EURAUD"	,
               "EURCAD"	,
               "EURDKK"	,
               "EURHUF"	,
               "EURNOK"	,
               "EURNZD"	,
               "EURRUB"	,
               "EURSEK"	,
               "GBPAUD"	,
               "GBPCAD"	,
               "GBPNZD"	,
               "GBPSGD"	,
               "NZDCAD"	,
               "NZDCHF"	,
               "NZDJPY"	,
               "NZDSGD"	,
               "USDCNH"	,
               "USDDKK"	,
               "USDHKD"	,
               "USDHUF"	,
               "USDNOK"	,
               "USDRUB"	,
               "USDSEK"	,
               "USDSGD"	,
               "USDTRY"	,
               "USDZAR"	,
               "XAGUSD"	,
               "XAUUSD"	,
               "XPTUSD"	,
               "XBRUSD"	,
               "XTIUSD"	,
               "XPDUSD"	,
               "EURMXN"	,
               "USDMXN"	,
       };

       String dev = "http://wt23.dev.weltrade.com.ua";
       String prod = "https://www.weltrade.com.ua/";

       try {

        Session.get().driver().get(prod);
        MainPage page = new MainPage();

        for (int i = 0; i < quotes.length; i++) {
            page.header.instruments.moveCursorToElement();
            page.header.onlineQuotes.click();
            OnlineQuotes page1 = new OnlineQuotes();
            page1.readyLocator();
            page1.setQuotes(quotes[i]);
            Thread.sleep(4000);
            String prices = page1.price.getText();

            page.header.instruments.moveCursorToElement();
            page.header.tradingCalculator.click();
            Calculator calc = new Calculator();
            calc.readyLocator();

            Thread.sleep(1000);

            WebElement a = Session.get().driver().findElement(By.xpath("/html/body/section/section/div[3]/div/div/div/div[2]/table[1]/tbody/tr[2]/td[7]"));

            System.out.println(quotes[i] + " --> Quotes = " + prices + ";  Calc = " + a.getText());


        }
       }finally {
           Session.get().close();
       }

    }
}