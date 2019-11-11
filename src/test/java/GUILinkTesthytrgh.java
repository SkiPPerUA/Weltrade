import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import static org.testng.Assert.*;

public class GUILinkTesthytrgh {

    public static void main(String[] args) {

        Session.get().driver().get("https://www.weltrade.com.ua/");

        GUILink ae = new GUILink(Locator.create("//*[@id='content-main']/div[2]/a"));
        System.out.println(ae.getText());
        ae.getHref();
        Session.get().close();
    }

}