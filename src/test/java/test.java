import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.AutorisationPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.TraderControlPage;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUILink;
import ua.kiev.prog.automation.framework.base.widget.GUITextBox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) throws InterruptedException {

        Session.get().driver().get("https://account.weltrade.com/auth/login");


        AutorisationPage page = new AutorisationPage();



        try
        {
            page.confirmPage();
            page.loginInCabinet("cyndap-49@bigmir.net","123qaz");
            TraderControlPage logiedPage = new TraderControlPage();
            logiedPage.accBlock.confirmBlock();
            logiedPage.accBlock.accountSettings("503501");
            Thread.sleep(5000);


        }finally {
            Session.get().close();
        }

    }



}


