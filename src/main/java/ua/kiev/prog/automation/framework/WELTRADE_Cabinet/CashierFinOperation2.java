package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class CashierFinOperation2 extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//form[@class='pt-lg-5 pt-sm-4 pt-3 pb-4 ng-untouched ng-pristine ng-valid']");
    }

    final public GUIButton confirmButton = new GUIButton(Locator.create(".//button[@class='wt-btn blue ng-star-inserted']"));
}
