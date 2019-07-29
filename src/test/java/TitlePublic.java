
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.lang.reflect.Array;
import java.util.List;
import java.util.WeakHashMap;

public class TitlePublic {

    public static void main(String[] args) {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(dev);

        //"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"
        String [] waitTitle = {
                "Maintenance Mode - WELTRADE",
                "โหมดการบำรุงรักษา - WELTRADE",
                "Технические работы - WELTRADE",
                "iPhone XS Max Gratis | WELTRADE",
                "Modo mantenimiento - WELTRADE",
                "iPhone XS Max miễn phí | WELTRADE",
                "ຫມວດການບຳລຸງຮັກສາ  - WELTRADE",
                "Percuma iPhone XS Max | WELTRADE",
                "维护模式 - WELTRADE"
        };

        MainPage page = new MainPage();

        try{
            for (int i = 3; i < waitTitle.length; i++){
                if (i == 3 || i == 5 || i == 7){

                    page.header.getAllLanguages(i);
                    Assert.assertEquals(waitTitle[i],Session.get().driver().getTitle());
                    System.out.println(page.header.getNameLangauge(i) + " - OK");

                }


            }


        }finally {
            Session.get().close();
        }


    }
}
