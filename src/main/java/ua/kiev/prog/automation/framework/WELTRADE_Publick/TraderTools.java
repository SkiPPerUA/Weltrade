package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks.Footer;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks.Header;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class TraderTools extends PageObject {

    final public Header header = new Header();
    final public Footer footer = new Footer();

    final public GUILink micro_info = new GUILink(Locator.create("/html/body/section/section[2]/div/ul/li[1]/a"));
    final public GUILink premium_info = new GUILink(Locator.create("/html/body/section/section[2]/div/ul/li[2]/a"));
    final public GUILink pro_info = new GUILink(Locator.create("/html/body/section/section[2]/div/ul/li[3]/a"));
    final public GUILink zulu_info = new GUILink(Locator.create("/html/body/section/section[2]/div/ul/li[4]/a"));
    final public GUILink cripto_info = new GUILink(Locator.create("/html/body/section/section[2]/div/ul/li[5]/a"));

    @Override
    protected Locator readyLocator() {
        return Locator.create(".//section[@class='trader-instruments-content']/div[@class='container']");
    }
}
