package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;

public class OpenAccountPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='box main ng-star-inserted']");
    }



}
