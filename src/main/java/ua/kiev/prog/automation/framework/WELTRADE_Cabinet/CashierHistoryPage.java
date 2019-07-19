package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;

public class CashierHistoryPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//button[@class='filter']");
    }
}
