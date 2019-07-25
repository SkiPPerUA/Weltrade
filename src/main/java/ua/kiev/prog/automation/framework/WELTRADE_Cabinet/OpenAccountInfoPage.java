package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;

public class OpenAccountInfoPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[1]/div/div");
    }

    final public Widget accountNumber = new Widget(Locator.create(".//div[@class='col-sm-6 d-flex align-items-center justify-content-sm-start justify-content-between']/span[1]"));
    final public Widget accountPassword = new Widget(Locator.create(".//div[@class='col-sm-6 title d-flex align-items-center justify-content-sm-start justify-content-between']/span[1]"));
}
