package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks.Footer;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks.Header;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class MainPage extends PageObject
{

    @Override
    protected Locator readyLocator() {
        return Locator.create(".//*[@id='content-main']/div/a");
    }


    final public Header header = new Header();
    final public Footer footer = new Footer();
}
