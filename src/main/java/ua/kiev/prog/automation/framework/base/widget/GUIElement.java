package ua.kiev.prog.automation.framework.base.widget;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Widget;

public class GUIElement extends Widget
{
    public GUIElement(Locator locator) {
        super(locator);
    }

    final public void click ()
    {
        _logger.debug("Click " + this.locator().getWDLocator());
        this.element().click();
    }
}
