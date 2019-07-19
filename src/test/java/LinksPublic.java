import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class LinksPublic {



    public static void main(String[] args) throws InterruptedException {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(prod);

        MainPage page = new MainPage();

        //елемент на какой нужно навести мышку
        //GUILink move = new GUILink(Locator.create("/html/body/header/div[2]/div/nav/ul/li[3]/span"));


        try{


            for (int i = 2; i < 9; i++){

                page.header.languages.click();
                page.header.getAllLanguages(i).click();

                for(int y = 1; y < 7; y++) {

                    GUILink move = new GUILink(Locator.create(".//nav/ul/li[" + y + "]/span"));

                    move.moveCursorToElement();

                    //список страниц для проверки
                    List<WebElement> elements = Session.get().driver().findElements(By.xpath(".//li["+y+"]/div/ul/li/a"));

                    for (int t = 1; t <= elements.size(); t++) {

                        move.moveCursorToElement();

                        //елемент на какой будет переход
                        WebElement now = Session.get().driver().findElement(By.xpath(".//li["+y+"]/div/ul/li["+t+"]/a"));
                        now.click();

                        System.out.println(page.header.getNameLangauge(i) + " -> " + Session.get().driver().getCurrentUrl());
                        if (y == 5){
                        Thread.sleep(5000);
                        }



                    }
                    System.out.println("------------------------------");
                }

                System.out.println("==============================");

            }



        } finally {
            Session.get().close();
        }


    }
}
