package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks.Header;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUITextBox;

public class CashierFinOperation1 extends PageObject {

    @Override
    protected Locator readyLocator() {
        return Locator.create(".//div[@class='operations-body']");
    }

    final public Header header = new Header();

    final public GUIButton typeOperation = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-deposit/div/div[1]/div/div/div[1]/div/div[1]/div[2]/mat-form-field"));
    final public GUIButton paySystem = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-deposit/div/div[1]/div/div/div[1]/div/div[2]/div[2]/mat-form-field"));
    final public GUIButton payCurrency = new GUIButton(Locator.create(".//div[3]/mat-form-field"));
    final public GUIButton targetAccount = new GUIButton(Locator.create(".//div[4]/div[2]/mat-form-field"));
    final public GUITextBox summ = new GUITextBox(Locator.create(".//div[5]/div[2]/input[@type='text']"));

    final public GUIButton createInvoiceButton = new GUIButton(Locator.create(".//button[@class='ng-star-inserted wt-btn blue']"));


    // (tp) 1 - пополнение; 2 - вывод; 3 - перевод;
    public void setTypeOperation(int tp) throws InterruptedException {
        typeOperation.click();
        Thread.sleep(1000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//div/mat-option["+tp+"]"));
        a.click();
    }


    public void setPaySystem(String sys) throws InterruptedException {
        paySystem.click();
        Thread.sleep(3000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//span[contains(text(), '"+sys+"')]"));
        a.click();

    }


    public void setPayCurrency(String cr) throws InterruptedException {
        payCurrency.click();
        Thread.sleep(3000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+cr+"')]/.."));
        a.click();
    }

    public void setTargetAccount(String acc){
        targetAccount.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+acc+"')]/.."));
        a.click();
    }
}
