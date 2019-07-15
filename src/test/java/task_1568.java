import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Calculator;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.TraderTools;
import ua.kiev.prog.automation.framework.base.Session;

public class task_1568 {

    static String[] acc = {"Micro", "Premium", "Pro", "Crypto"};

    static String [][] ticket = new String[4][60];

    public static void main(String[] args) {

        ticket[0][0]="AUDUSD";
        ticket[0][1]="EURCHF";
        ticket[0][2]="EURGBP";
        ticket[0][3]="EURGBP";
        ticket[0][4]="EURUSD";
        ticket[0][5]="GBPCHF";
        ticket[0][6]="GBPJPY";
        ticket[0][7]="GBPUSD";
        ticket[0][8]="NZDUSD";
        ticket[0][9]="USDCAD";
        ticket[0][10]="USDCHF";
        ticket[0][11]="USDJPY";
        ticket[0][12]="AUDCAD";
        ticket[0][13]="AUDCHF";
        ticket[0][14]="AUDJPY";
        ticket[0][15]="AUDNZD";
        ticket[0][16]="CADCHF";
        ticket[0][17]="CADJPY";
        ticket[0][18]="CHFJPY";
        ticket[0][19]="EURAUD";
        ticket[0][20]="EURCAD";
        ticket[0][21]="EURDKK";
        ticket[0][22]="EURHUF";
        ticket[0][23]="EURNOK";
        ticket[0][24]="EURNZD";
        ticket[0][25]="EURRUB";
        ticket[0][26]="EURSEK";
        ticket[0][27]="GBPAUD";
        ticket[0][28]="GBPCAD";
        ticket[0][29]="GBPNZD";
        ticket[0][30]="GBPSGD";
        ticket[0][31]="NZDCAD";
        ticket[0][32]="NZDCHF";
        ticket[0][33]="NZDJPY";
        ticket[0][34]="NZDSGD";
        ticket[0][35]="USDCNH";
        ticket[0][36]="USDDKK";
        ticket[0][37]="USDHKD";
        ticket[0][38]="USDHUF";
        ticket[0][39]="USDNOK";
        ticket[0][40]="USDRUB";
        ticket[0][41]="USDSEK";
        ticket[0][42]="USDSGD";
        ticket[0][43]="USDTRY";
        ticket[0][44]="USDZAR";
        ticket[0][45]="XAGUSD";
        ticket[0][46]="XAUUSD";
        ticket[0][47]="EURMXN";
        ticket[0][48]="USDMXN";

        ticket[1][0]="AUDUSD";
        ticket[1][1]="EURCHF";
        ticket[1][2]="EURGBP";
        ticket[1][3]="EURGBP";
        ticket[1][4]="EURUSD";
        ticket[1][5]="GBPCHF";
        ticket[1][6]="GBPJPY";
        ticket[1][7]="GBPUSD";
        ticket[1][8]="NZDUSD";
        ticket[1][9]="USDCAD";
        ticket[1][10]="USDCHF";
        ticket[1][11]="USDJPY";
        ticket[1][12]="AUDCAD";
        ticket[1][13]="AUDCHF";
        ticket[1][14]="AUDJPY";
        ticket[1][15]="AUDNZD";
        ticket[1][16]="CADCHF";
        ticket[1][17]="CADJPY";
        ticket[1][18]="CHFJPY";
        ticket[1][19]="EURAUD";
        ticket[1][20]="EURCAD";
        ticket[1][21]="EURDKK";
        ticket[1][22]="EURHUF";
        ticket[1][23]="EURNOK";
        ticket[1][24]="EURNZD";
        ticket[1][25]="EURRUB";
        ticket[1][26]="EURSEK";
        ticket[1][27]="GBPAUD";
        ticket[1][28]="GBPCAD";
        ticket[1][29]="GBPNZD";
        ticket[1][30]="GBPSGD";
        ticket[1][31]="NZDCAD";
        ticket[1][32]="NZDCHF";
        ticket[1][33]="NZDJPY";
        ticket[1][34]="NZDSGD";
        ticket[1][35]="USDCNH";
        ticket[1][36]="USDDKK";
        ticket[1][37]="USDHKD";
        ticket[1][38]="USDHUF";
        ticket[1][39]="USDNOK";
        ticket[1][40]="USDRUB";
        ticket[1][41]="USDSEK";
        ticket[1][42]="USDSGD";
        ticket[1][43]="USDTRY";
        ticket[1][44]="USDZAR";
        ticket[1][45]="XAGUSD";
        ticket[1][46]="XAUUSD";
        ticket[1][47]="EURMXN";
        ticket[1][48]="USDMXN";
        ticket[1][49]="XPTUSD";
        ticket[1][50]="XBRUSD";
        ticket[1][51]="XTIUSD";
        ticket[1][52]="XPDUSD";

        ticket[2][0]="AUDUSD";
        ticket[2][1]="EURCHF";
        ticket[2][2]="EURGBP";
        ticket[2][3]="EURGBP";
        ticket[2][4]="EURUSD";
        ticket[2][5]="GBPCHF";
        ticket[2][6]="GBPJPY";
        ticket[2][7]="GBPUSD";
        ticket[2][8]="NZDUSD";
        ticket[2][9]="USDCAD";
        ticket[2][10]="USDCHF";
        ticket[2][11]="USDJPY";
        ticket[2][12]="AUDCAD";
        ticket[2][13]="AUDCHF";
        ticket[2][14]="AUDJPY";
        ticket[2][15]="AUDNZD";
        ticket[2][16]="CADCHF";
        ticket[2][17]="CADJPY";
        ticket[2][18]="CHFJPY";
        ticket[2][19]="EURAUD";
        ticket[2][20]="EURCAD";
        ticket[2][21]="EURNZD";
        ticket[2][22]="EURRUB";
        ticket[2][23]="GBPAUD";
        ticket[2][24]="GBPCAD";
        ticket[2][25]="GBPNZD";
        ticket[2][26]="NZDCAD";
        ticket[2][27]="NZDCHF";
        ticket[2][28]="NZDJPY";
        ticket[2][29]="USDCNH";
        ticket[2][30]="USDHKD";
        ticket[2][31]="USDNOK";
        ticket[2][32]="USDRUB";
        ticket[2][33]="USDSGD";
        ticket[2][34]="USDTRY";
        ticket[2][35]="USDZAR";
        ticket[2][36]="XAGUSD";
        ticket[2][37]="XAUUSD";
        ticket[2][38]="EURMXN";
        ticket[2][39]="USDMXN";
        ticket[2][40]="XPTUSD";
        ticket[2][41]="XBRUSD";
        ticket[2][42]="XTIUSD";
        ticket[2][43]="XPDUSD";


        ticket[3][0]="BTCUSD";
        ticket[3][1]="BCHBTC";
        ticket[3][2]="BCHUSD";
        ticket[3][3]="DASHBTC";
        ticket[3][4]="DASHUSD";
        ticket[3][5]="EOSUSD";
        ticket[3][6]="ETHBTC";
        ticket[3][7]="ETHUSD";
        ticket[3][8]="LTCUSD";
        ticket[3][9]="NEOUSD";
        ticket[3][10]="XMRBTC";
        ticket[3][11]="XMRUSD";
        ticket[3][12]="XRPUSD";
        ticket[3][13]="ZECBTC";
        ticket[3][14]="ZECUSD";
        ticket[3][15]="XRPUSDT";


        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "https://www.weltrade.com.ua";

        Session.get().driver().get(prod);

        MainPage page = new MainPage();



        int x = 3;


        //калькулятор
        /*try{

        page.header.moveOnElement(page.header.instruments);
        page.header.tradingCalculator.click();
        Calculator curentPage = new Calculator();
        curentPage.confirmPage();


                curentPage.setTypeAccount(acc[x]);

                for(int t = 0; t < 16; t++){

                    curentPage.setInstrument(ticket[x][t]);

                    System.out.println(acc[x] + " -> " + ticket[x][t] + " = ОК");
                }*/


        //инструменты
        try {

            page.header.moveOnElement(page.header.trading);
            page.header.trading_tools.click();
            TraderTools tools = new TraderTools();
            tools.cripto_info.click();

            for(int i = 13; i < 16; i++){
            WebElement el = Session.get().driver().findElement(By.xpath(".//tbody/tr/td/div[text()='"+ticket[x][i]+"']"));
                System.out.println(acc[x] + " -> " + ticket[x][i] + " = ОК");

            }




        }finally {
            Session.get().close();
        }


    }


}
