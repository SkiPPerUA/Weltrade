package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.Header;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUITextBox;

public class OpenAccountPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='box main ng-star-inserted']");
    }

    final public Header header = new Header();

    final public GUIButton premAcc = new GUIButton(Locator.create(".//nav/ul/li/a[text()='PREMIUM']"));
    final public GUIButton proAcc = new GUIButton(Locator.create(".//nav/ul/li/a[text()='PRO']"));

    final public GUIButton openAccButt = new GUIButton(Locator.create(".//div[2]/button[@class='wt-btn green']"));


    final private GUIButton platformAcc = new GUIButton(Locator.create(".//div[1]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
    final private GUIButton currencyAcc = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[3]/div/div/form/div[2]/div[2]/mat-form-field"));
    final private GUIButton leverageAcc = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[3]/div/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div"));



    public void openRealAcc(String accType, String platform, String currency, String leverage) {

        GUIButton acc = new GUIButton(Locator.create(".//nav/ul/li/a[text()='"+accType+"']/.."));
        acc.click();
        platformAcc.click();
        GUIButton plat = new GUIButton(Locator.create(".//mat-option/span[contains(text(), '"+platform+"')]"));
        plat.click();
        currencyAcc.click();
        GUIButton curr = new GUIButton(Locator.create(".//div/div/mat-option/span[text()='"+currency+" ']"));
        curr.click();
        leverageAcc.click();
        GUIButton lever = new GUIButton(Locator.create(".//span[text()='"+leverage+" ']"));
        lever.click();
        openAccButt.click();
    }

    public void openDemoAcc(String platform, String accDemoType, String currency, int deposit, String leverage){
        GUIButton acc = new GUIButton(Locator.create(".//nav/ul/li/a[text()='DEMO']"));
        acc.click();
        GUIButton pl = new GUIButton(Locator.create(".//div[1]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
        pl.click();
        GUIButton setPl = new GUIButton(Locator.create(".//mat-option/span[contains(text(), '"+platform+"')]"));
        setPl.click();
        GUIButton demoType = new GUIButton(Locator.create(".//div[2]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
        demoType.click();
        GUIButton setDemoType = new GUIButton(Locator.create(".//div/div/mat-option/span[text()='"+accDemoType+" ']"));
        setDemoType.click();
        GUIButton curr = new GUIButton(Locator.create(".//div[3]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
        curr.click();
        GUIButton setCurr = new GUIButton(Locator.create(".//div/div/mat-option/span[text()='"+currency+" ']"));
        setCurr.click();
        GUIButton depVal = new GUIButton(Locator.create(".//div[4]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
        depVal.click();
        GUIButton setDepVal = new GUIButton(Locator.create(".//div/div/mat-option/span[text()='"+deposit+" ']"));
        setDepVal.click();
        GUIButton lev = new GUIButton(Locator.create(".//div[5]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
        lev.click();
        GUIButton setLev = new GUIButton(Locator.create(".//span[text()='"+leverage+" ']"));
        setLev.click();
        openAccButt.click();





    }

}
