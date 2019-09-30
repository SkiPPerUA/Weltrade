import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Session;

import java.util.List;

import static org.testng.Assert.*;

public class HrefPublicTest extends Assert {
    public static void main(String[] args) {

        String dev = "http://wt23.dev.weltrade.com.ua";
        String prod = "http://www.weltrade.com.ua";

        Session.get().driver().get(dev);
        MainPage mainPage = new MainPage();

        String [] mail = {"https://www.weltrade.com.ua/","https://www.weltrade.kz/","https://bel.weltrade.com/"};

        int y = 0;

        String [] face = {"https://www.facebook.com/weltradecom/"	,
                "https://www.facebook.com/WeltradeTH/"	,
                "https://www.facebook.com/weltradeclub/"	,
                "https://www.facebook.com/indo.weltrade/"	,
                "https://www.facebook.com/weltrade.latam/"	,
                "https://www.facebook.com/WeltradeVi/"	,
                null	,
                "https://www.facebook.com/WeltradeMY/"	,
                null	,
                "https://www.facebook.com/weltradeclub/"	,
                "https://www.facebook.com/weltradeclub/",
                "https://www.facebook.com/weltradeclub/" ,
                	};

        String [] you = {null	,
                "https://www.youtube.com/weltradeth"	,
                "https://www.youtube.com/user/WeltradeRu/"	,
               null,
                null,
               null	,
                null	,
                null	,
                null	,
                "https://www.youtube.com/user/WeltradeRu/"	,
                "https://www.youtube.com/user/WeltradeRu/",
                "https://www.youtube.com/user/WeltradeRu/" ,};
        try {
            for (int i = 0; i < 12; i++){

                if (i < 9) {
                    mainPage.header.getAllLanguages(i);

                    if (face[i] != null){

                       Assert.assertEquals(face[i],mainPage.footer.facebook.getHref());
                    }
                    if (you[i] != null){
                       Assert.assertEquals(you[i], mainPage.footer.youtube.getHref());
                        System.out.println(mainPage.header.getNameLangauge(i) + " ОК");

                    }


                } else {

                    Session.get().driver().navigate().to(mail[y]);
                    Assert.assertEquals(face[i],mainPage.footer.facebook.getHref());
                    Assert.assertEquals(you[i], mainPage.footer.youtube.getHref());


                    y++;

                }




            }


        }finally {
            Session.get().close();
        }



    }

}