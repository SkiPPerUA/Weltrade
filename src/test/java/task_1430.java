import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Calculator;
import ua.kiev.prog.automation.framework.base.Session;

public class task_1430 {

    static String[] acc = {"Демо", "Micro", "Premium", "ZuluTrade"};

    static String[] ticket = {"EURDKK", "EURHUF", "EURNOK", "EURSEK", "GBPSGD", "NZDSGD", "USDDKK", "USDHUF", "USDSEK", "USDZAR"};

    static Integer op = 0;
    static Integer opa = 0;

    public static void main(String[] args) throws InterruptedException {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "https://www.weltrade.com.ua";

        Session.get().driver().get(dev);

        MainPage page = new MainPage();

        page.header.moveOnElement(page.header.instruments);
        page.header.tradingCalculator.click();
        Calculator curentPage = new Calculator();
        curentPage.confirmPage();



        try {


            test11(ticket[opa]);


        } catch (Exception e) {
            System.out.println(acc[op] + " -> " + ticket[opa] + " = Не найдено");
            opa++;
            test11(ticket[opa]);

        } finally {
            Session.get().close();
        }
    }

        public static void test11(String yn) throws InterruptedException {

            Calculator curentPage1 = new Calculator();


            while (op < acc.length) {

                curentPage1.setTypeAccount(acc[op]);


                while (opa < ticket.length) {

                    curentPage1.setInstrument(ticket[opa]);
                    Thread.sleep                         (2000);
                    System.out.println(acc[op] + " -> " + ticket[opa] + " = Проверено");
                    opa++;

                }

                op++;

            }
        }

}
