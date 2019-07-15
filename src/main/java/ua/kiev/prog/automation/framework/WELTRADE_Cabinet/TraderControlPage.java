package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.AccountsCtrPage;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.Header;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class TraderControlPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='col d-lg-flex d-none justify-content-end ']/button[@class='wt-btn green']");
    }

    final public Header header = new Header();
    final public AccountsCtrPage accBlock = new AccountsCtrPage();

    final public GUIButton openAccountButton = new GUIButton(Locator.create(".//div[@class='col d-lg-flex d-none justify-content-end ']/button[@class='wt-btn blue ml-3']"));
}
