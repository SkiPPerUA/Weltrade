import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class LinksPublic extends Assert {



    public static void main(String[] args) throws InterruptedException {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(dev);

        MainPage page = new MainPage();

        //елемент на какой нужно навести мышку
        GUILink move = new GUILink(Locator.create("/html/body/section/section[3]/div/div/div[3]/div[3]"));


        try{

            for(int i = 8; i < 9; i++){
                page.confirmPage();
                page.header.getAllLanguages(i);
                move.click();
                System.out.println(page.header.getNameLangauge(i));
                System.out.println(Session.get().driver().getCurrentUrl());
                System.out.println("----------------------");
                page.header.logo.click();


            }





        } finally {
            Session.get().close();
        }


    }
}
