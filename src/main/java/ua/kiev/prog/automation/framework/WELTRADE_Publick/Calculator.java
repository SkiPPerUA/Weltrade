package ua.kiev.prog.automation.framework.WELTRADE_Publick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.Widget;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class Calculator extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='js_calculator']");
    }


    private final GUIButton typeAccount = new GUIButton(Locator.create(".//form/div/div[1]/div/div/a"));
    private final GUIButton instrument = new GUIButton(Locator.create("/html/body/section/section/div[3]/div/div/div/div[1]/form/div/div[2]/div/div/a"));

    final public GUIButton button = new GUIButton(Locator.create(".//div[@class='col-md-5 col-sm-2']/button"));

    public void setTypeAccount(String type){

        this.typeAccount.click();
        WebElement acc = Session.get().driver().findElement(By.xpath(".//li/a/span[text()='"+type+"']"));
        acc.click();

    }

    public void setInstrument(String inst){

        this.instrument.click();
        WebElement ins = Session.get().driver().findElement(By.xpath(".//li/a/span[text()='"+inst+"']"));
        ins.click();
    }

}
