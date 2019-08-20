package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.TraderControlAccountsBlock;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.Header;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class TraderControlPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[1]/div[2]/app-switcher/div/div");
    }

    final public Header header = new Header();
    final public TraderControlAccountsBlock accBlock = new TraderControlAccountsBlock();

    final public GUIButton openAccountButton = new GUIButton(Locator.create(".//div[@class='col d-lg-flex d-none justify-content-end ']/button[@class='wt-btn blue ml-3']"));
}
