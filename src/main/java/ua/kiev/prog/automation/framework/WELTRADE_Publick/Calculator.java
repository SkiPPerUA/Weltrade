package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUITextBox;

public class Calculator extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create("/html/body/section/section/div[2]/div[1]");
    }



    private final GUIButton typeAccount = new GUIButton(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[1]/div[1]/div/button[@class='btn dropdown-toggle bs-placeholder btn-default']/div[@class='filter-option']"));
    private final GUIButton instrument = new GUIButton(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[1]/div[2]/div/button/div"));
    private final GUITextBox searchTool = new GUITextBox(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[1]/div[2]/div/div/div[1]/input"));
    private final GUITextBox lots = new GUITextBox(Locator.create("//*[@id='select-lot']"));
    private final GUIButton leverage = new GUIButton(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[2]/div[1]/div/button/div"));

    final private GUIButton button = new GUIButton(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[2]/div[2]/button"));

    public final GUITextBox pipValue = new GUITextBox(Locator.create("/html/body/section/section/div[2]/div[2]/div/div/div[2]/div[2]/p"));


    public void culculateForex (String acc, String tool, String lot, String leverages){

        typeAccount.click();
        GUIButton account = new GUIButton(Locator.create(".//a/span[contains(text(), '"+acc+"')]"));
        account.click();

        instrument.click();
        searchTool.setValue(tool);
        GUIButton tools = new GUIButton(Locator.create("/html/body/section/section/div[2]/div[1]/div/form[1]/div[2]/div/div/div[2]/ul/li/a"));
        tools.click();

        lots.setValue(lot);

        leverage.click();
        GUIButton lever = new GUIButton(Locator.create(".//a/span[contains(text(), '"+leverages+"')]"));
        lever.click();

        button.click();


    }

}
