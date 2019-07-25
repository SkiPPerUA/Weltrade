package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.SettingsSecurityBlock;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class SettingsMainPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='box ng-star-inserted']");
    }

    final public GUILink security = new GUILink(Locator.create(".//a[@routerlink='security']"));
    final public SettingsSecurityBlock securitySection = new SettingsSecurityBlock();
}
