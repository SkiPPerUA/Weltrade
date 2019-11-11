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
        return Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-deposit/div/div[1]/div/div/div[1]/div/div[4]/div[2]/mat-form-field/div/div[1]/div");
    }

    final public Header header = new Header();

    private final GUIButton typeOperation = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-deposit/div/div[1]/div/div/div[1]/div/div[1]/div[2]/app-financial-operations-selector/mat-form-field"));
    private final GUIButton createInvoiceButton = new GUIButton(Locator.create(".//button[contains(@class,'wt-btn blue')]"));

    //Депозит
    private final GUIButton paySystemDeposit = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-deposit/div/div[1]/div/div/div[1]/div/div[2]/div[2]/mat-form-field"));
    private final GUIButton payCurrencyDeposit = new GUIButton(Locator.create(".//div[3]/mat-form-field"));
    private final GUIButton targetAccountDeposit = new GUIButton(Locator.create(".//div[4]/div[2]/mat-form-field"));
    private final GUITextBox summDeposit = new GUITextBox(Locator.create(".//div[5]/div[2]/input[@type='text']"));


    //Вывод
    private final GUIButton targetAccountWithdrawal = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-withdrawal/div/div[1]/div/div/div[1]/div/div[2]/div[2]/mat-form-field"));
    private final GUIButton paySystemWithdrawal = new GUIButton(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-withdrawal/div/div[1]/div/div/div[1]/div/div[3]/div[2]/mat-form-field"));
    final private GUIButton walletWithdrawal = new GUIButton(Locator.create(".//div/div[4]/div[2]/mat-form-field"));
    private final GUITextBox summWithdrawal = new GUITextBox(Locator.create("/html/body/app-root/app-pages/main/app-operations/section/div/app-operations-withdrawal/div/div[1]/div/div/div[1]/div/div[5]/div[2]/input"));


    // (tp) 1 - пополнение; 2 - вывод; 3 - перевод;
    private void setTypeOperation(int tp) throws InterruptedException {
        Thread.sleep(1000);
        typeOperation.click();
        Thread.sleep(1000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//div/mat-option["+tp+"]"));
        a.click();
    }


    private void setPaySystemDeposit(String sys) throws InterruptedException {
        paySystemDeposit.click();
        Thread.sleep(3000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//span[contains(text(), '"+sys+"')]"));
        a.click();

    }


    private void setPayCurrencyDeposit(String cr) throws InterruptedException {
        payCurrencyDeposit.click();
        Thread.sleep(3000);
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+cr+"')]/.."));
        a.click();
    }

    private void setTargetAccountDeposit(String acc){
        targetAccountDeposit.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+acc+"')]/.."));
        a.click();
    }

    private void setTargetAccountWithdrawal(String acc){
        targetAccountWithdrawal.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option/span[contains(text(), '"+acc+"')]/.."));
        a.click();
    }

    private void setPaySystemWithdrawal(String sys){
        paySystemWithdrawal.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//span[contains(text(), '"+sys+"')]"));
        a.click();
    }

    private void setWalletWithdrawal(String wall){
        walletWithdrawal.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//span[@class='mat-option-text']/div/span[contains(text(),'"+wall+"')]"));
        a.click();
    }

    public void createWithdrawalInvoice(int operation, String account, String system, String wallet, String summ) throws InterruptedException {
        setTypeOperation(operation);
        setTargetAccountWithdrawal(account);
        setPaySystemWithdrawal(system);
        setWalletWithdrawal(wallet);
        summWithdrawal.setValue(summ);
        createInvoiceButton.click();

    }

    public void createDepositInvoice(int operation, String system, String currency, String account, String summ) throws InterruptedException {
        setTypeOperation(operation);
        setPaySystemDeposit(system);
        setPayCurrencyDeposit(currency);
        setTargetAccountDeposit(account);
        summDeposit.setValue(summ);
        createInvoiceButton.click();
    }

}
