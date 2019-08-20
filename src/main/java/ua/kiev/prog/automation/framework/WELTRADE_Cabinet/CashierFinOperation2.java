package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class CashierFinOperation2 extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//button[contains(@class,'wt-btn transparent not-hover')]");
    }

    final public GUIButton confirmButton = new GUIButton(Locator.create(".//button[contains(@class,'wt-btn blue')]"));
}
