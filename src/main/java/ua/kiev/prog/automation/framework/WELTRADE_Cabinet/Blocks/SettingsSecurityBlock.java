package ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks;

import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class SettingsSecurityBlock extends BlockObject {

    public SettingsSecurityBlock() {
        super (Locator.create(""));
    }

    final public GUILink logs = new GUILink(Locator.create(".//a[@routerlink='logs']"));
    final public GUIButton seccuritySection = new GUIButton(Locator.create(".//li/a[@routerlink='security']"));

}
