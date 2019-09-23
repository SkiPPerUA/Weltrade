package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.PartnerCalculator;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;

public class PartnerTermsPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='box d-flex flex-column justify-content-between status-partner']");
    }


    public final PartnerCalculator calculator = new PartnerCalculator();

}
