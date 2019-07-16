import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class LinksPublic {



    public static void main(String[] args) {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(prod);

        MainPage page = new MainPage();
        GUILink move = new GUILink(Locator.create("/html/body/header/div[2]/div/nav/ul/li[3]/span"));

        try{


            for (int i = 0; i < 9; i++){

                page.header.languages.click();
                page.header.getAllLanguages(i).click();
                move.moveCursorToElement();
                List<WebElement> elements = Session.get().driver().findElements(By.xpath(".//li[3]/div/ul/li/a/span"));

                for (int t = 1; t <= elements.size(); t++){

                    move.moveCursorToElement();
                    WebElement now = Session.get().driver().findElement(By.xpath(".//li[3]/div/ul/li["+t+"]/a"));
                    now.click();
                    System.out.println(page.header.getNameLangauge(i) + " -> " + Session.get().driver().getCurrentUrl());


                }

                System.out.println("------------------------");

            }



        } finally {
            Session.get().close();
        }


    }
}