package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUIElement;

public class OnlineQuotes extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='dropdown wt-dropdown']");
    }

    final private GUIButton quotes = new GUIButton(Locator.create(".//div[@class='wt-quotes-symbol']/div"));
    final public GUIElement price = new GUIElement(Locator.create(".//div[@class='col-md-2 col-sm-4 col-xs-12']/div"));


    public void setQuotes(String q)  {
        quotes.click();
        Widget a = new Widget(Locator.create(".//div/ul/li[contains(@value,'"+q+"')]/a"));
        a.element().click();
    }
}
