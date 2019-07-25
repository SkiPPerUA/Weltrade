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


    final public GUIButton platformAcc = new GUIButton(Locator.create(".//div[1]/div[2]/mat-form-field/div/div/div[@class='mat-input-infix mat-form-field-infix']/mat-select"));
    final public GUIButton currencyAcc = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[3]/div/div/form/div[2]/div[2]/mat-form-field"));
    final public GUIButton leverageAcc = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-open-account/section/div/div/div[3]/div/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div"));

    public void setPlatformAcc (String pl){
        platformAcc.click();
       WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+pl+"')]"));
       a.click();
    }


    public void setCurrencyAcc(String cr){
        currencyAcc.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//div/div/mat-option/span[text()='"+cr+" ']"));
        a.click();
    }


    public void setLeverageAcc(int lv){
        leverageAcc.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//span[text()='1:"+lv+" ']"));
        a.click();
    }

    public OpenAccountInfoPage openAcc(){
       this.openAccButt.click();
       OpenAccountInfoPage page = new OpenAccountInfoPage();
       page.confirmPage();
       return page;
    }

}
