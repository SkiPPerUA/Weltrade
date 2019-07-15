package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import ua.kiev.prog.automation.framework.base.Locator;

public class SupportPage extends MainPage {
    @Override
    protected Locator readyLocator() {
        return Locator.create("/html/body/section/section/div[1]/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div/b/a");
    }


}
