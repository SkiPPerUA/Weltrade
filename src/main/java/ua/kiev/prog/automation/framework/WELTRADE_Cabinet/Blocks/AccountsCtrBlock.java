package ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.util.List;

public class AccountsCtrBlock extends BlockObject {

    final public GUILink account = new GUILink(Locator.create(".//tr/td[@class='text-left']"));

    public AccountsCtrBlock() {
        super(Locator.create(".//div[@class='col-md-6 d-flex justify-content-md-start justify-content-between align-items-center']"));
    }


    public void accountSettings (String acc){

        GUIButton settingsButton = new GUIButton(Locator.create(".//tr/td[@class='text-left']/a[contains(@href, '"+acc+"')]/../../td[@class='text-right']/i"));
        settingsButton.click();

    }


}
