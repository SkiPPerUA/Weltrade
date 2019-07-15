package ua.kiev.prog.automation.framework.base.widget;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Widget;

public class GUIButton extends Widget
{
    public GUIButton(Locator locator) {
        super(locator);
    }

    public void click ()
    {
        _logger.debug("Click " + this.locator().getWDLocator());
        this.element().click();
        this.waitAction();
    }
}
