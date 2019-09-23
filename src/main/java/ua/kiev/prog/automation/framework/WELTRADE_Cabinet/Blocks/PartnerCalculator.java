package ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.Session;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;

public class PartnerCalculator extends BlockObject {

    public PartnerCalculator() {
        super(Locator.create("/html/body/app-root/app-pages/main/app-terms/section/div/div/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div"));
    }

    private GUIButton typeProgramm = new GUIButton(Locator.create("//*[@id='mat-select-0']"));
    private GUIButton statusProgramm = new GUIButton(Locator.create("//*[@id='mat-select-1']"));
    private GUIButton accountProgramm = new GUIButton(Locator.create("//*[@id='mat-select-2']"));
    private GUIButton toolsProgramm = new GUIButton(Locator.create("//*[@id='mat-select-4']"));

    public final GUIButton calculateButton = new GUIButton(Locator.create(".//div[2]/div/button[contains(class,terms-btn)]"));

    public void setTypeProgramm(int type){
        typeProgramm.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option[@role='option']/span[contains(text(),"+type+")]"));
        a.click();
    }

    public void setStatusProgramm(String status){
        statusProgramm.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option[@role='option']/span/span[contains(text(),'"+status+"')]"));
        a.click();
    }

    public void setAccountProgramm(String acc){
        accountProgramm.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option[@role='option']/span[contains(text(),'"+acc+"')]"));
        a.click();
    }

    public void setToolsProgramm(String tool){
        toolsProgramm.click();
        WebElement a = Session.get().driver().findElement(By.xpath(".//mat-option[@role='option']/span/span[contains(text(),'"+tool+"')]"));
        a.click();
    }


}
