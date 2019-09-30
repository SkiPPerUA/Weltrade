import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class AllTitlePublic extends Assert {

    public static void main(String[] args) throws InterruptedException {


        Session.get().driver().get("http://www.weltrade.com.ua");


        try{

            MainPage page = new MainPage();

            String [] mail = {"https://www.weltrade.com.ua/","https://www.weltrade.kz/","https://bel.weltrade.com/"};
            int y = 0;

            for(int r = 0; r < 12; r++) {

                List<WebElement> group = null;
                if (r < 9) {

                    page.header.getAllLanguages(r);
                    System.out.println(page.header.getNameLangauge(r));
                    System.out.println();
                    List<WebElement> gro = Session.get().driver().findElements(By.xpath("/html/body/header/div[2]/div/nav/ul/li/span"));
                    group = gro;
                } else {

                    Session.get().driver().navigate().to(mail[y]);
                    List<WebElement> grou = Session.get().driver().findElements(By.xpath("/html/body/header/div[2]/div/nav/ul/li/span"));
                    y++;
                    group = grou;
                }


                for (int i = 1; i <= group.size(); i++) {

                    Widget op = new Widget(Locator.create("/html/body/header/div[2]/div/nav/ul/li[" + i + "]"));
                    op.moveCursorToElement();

                    List<WebElement> comp = Session.get().driver().findElements(By.xpath("/html/body/header/div[2]/div/nav/ul/li[" + i + "]/div/ul/li/a"));

                    for (int t = 1; t <= comp.size(); t++) {

                        if (i == 5) {
                            op.moveCursorToElement();
                            GUILink lin = new GUILink(Locator.create("/html/body/header/div[2]/div/nav/ul/li[" + i + "]/div/ul/li[" + t + "]/a"));
                            lin.click();
                            Thread.sleep(5000);
                            System.out.println(Session.get().driver().getCurrentUrl() /*+ "  ------> " + Session.get().driver().getTitle()*/);

                        } else {
                            op.moveCursorToElement();
                            GUILink lin = new GUILink(Locator.create("/html/body/header/div[2]/div/nav/ul/li[" + i + "]/div/ul/li[" + t + "]/a"));
                            lin.click();
                            System.out.println(Session.get().driver().getCurrentUrl() /*+ "  ------> " + Session.get().driver().getTitle()*/);

                        }



                    }

                    System.out.println("-------------------------------");
                }
                System.out.println("===================================");
            }
        }finally {
            Session.get().close();
        }


    }
}

