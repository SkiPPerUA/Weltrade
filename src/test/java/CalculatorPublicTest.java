import org.junit.Test;
import org.testng.Assert;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Calculator;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.OnlineQuotes;
import ua.kiev.prog.automation.framework.base.Session;

import static org.testng.Assert.*;

public class CalculatorPublicTest extends Assert {

    @Test
    public void testCulc() throws InterruptedException {

        String [] calcTools = {"AUDCAD"	,
                "AUDCHF"	,
                "AUDJPY"	,
                "AUDNZD"	,
                "AUDUSD"	,
                "CADCHF"	,
                "CADJPY"	,
                "CHFJPY"	,
                "EURAUD"	,
                "EURCAD"	,
                "EURCHF"	,
                "EURDKK"	,
                "EURGBP"	,
                "EURHUF"	,
                "EURJPY"	,
                "EURMXN"	,
                "EURNOK"	,
                "EURNZD"	,
                "EURRUB"	,
                "EURSEK"	,
                "EURUSD"	,
                "GBPAUD"	,
                "GBPCAD"	,
                "GBPCHF"	,
                "GBPJPY"	,
                "GBPNZD"	,
                "GBPSGD"	,
                "GBPUSD"	,
                "NZDCAD"	,
                "NZDCHF"	,
                "NZDJPY"	,
                "NZDSGD"	,
                "NZDUSD"	,
                "USDCAD"	,
                "USDCHF"	,
                "USDCNH"	,
                "USDDKK"	,
                "USDHUF"	,
                "USDJPY"	,
                "USDMXN"	,
                "USDNOK"	,
                "USDRUB"	,
                "USDSEK"	,
                "USDSGD"	,
                "USDZAR"	,
                "USDHKD"	,
                "USDTRY"

                        };

        String [] tiketTools = {"USDCAD"	,
                "USDCHF"	,
                "USDJPY"	,
                "NZDUSD"	,
                null		,
                "USDCHF"	,
                "USDJPY"	,
                "USDJPY"	,
                "AUDUSD"	,
                "USDCAD"	,
                "USDCHF"	,
                "USDDKK"	,
                "GBPUSD"	,
                "USDHUF"	,
                "USDJPY"	,
                "USDMXN"	,
                "USDNOK"	,
                "NZDUSD"	,
                "USDRUB"	,
                "USDSEK"	,
                null		,
                "AUDUSD"	,
                "USDCAD"	,
                "USDCHF"	,
                "USDJPY"	,
                "NZDUSD"	,
                "USDSGD"	,
                null		,
                "USDCAD"	,
                "USDCHF"	,
                "USDJPY"	,
                "USDSGD"	,
                null		,
                "USDCAD"	,
                "USDCHF"	,
                "USDCNH"	,
                "USDDKK"	,
                "USDHUF"	,
                "USDJPY"	,
                "USDMXN"	,
                "USDNOK"	,
                "USDRUB"	,
                "USDSEK"	,
                "USDSGD"	,
                "USDZAR"	,
                "USDHKD"	,
                "USDTRY"	,

        };

        String onlineQuotes [] = new String[50];
        String pipVal [] = new String[50];



        try{

            for(int i = 0; i < tiketTools.length; i++){
                OnlineQuotes quo = new OnlineQuotes();

                if(tiketTools[i] != null){
                    Session.get().driver().navigate().to("https://www.weltrade.com.ua/tools/quotes/");
                    quo.confirmPage();
                    quo.setQuotes(tiketTools[i]);
                    Thread.sleep(4000);
                    onlineQuotes[i] = quo.price.getText();
                }

                Session.get().driver().navigate().to("http://www.weltrade.com.ua/tools/calculator/");

                Calculator calc = new Calculator();
                calc.confirmPage();
                calc.culculateForex("premium",calcTools[i],"1","1:500");
                pipVal[i] = calc.pipValue.getText();

            }

            System.out.println("Тикеты");
            for (int z = 0; z < pipVal.length; z++){
                System.out.println(onlineQuotes[z]);
            }

            System.out.println();
            System.out.println("Результат");
            for (int p = 0; p < pipVal.length; p++){
                System.out.println(pipVal[p]);
            }





        }
        finally {
            Session.get().close();
        }

    }

}