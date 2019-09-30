package ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks;

import org.openqa.selenium.By;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class Footer extends BlockObject {

    public Footer() {
        super(Locator.create("/html/body/footer/div[1]/div/div/div[1]/a"));
    }

    final public GUILink about_company = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[1]/li[1]/a"));
    final public GUILink awards_company = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[1]/li[2]/a"));
    final public GUILink open_account = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[1]/li[3]/a"));
    final public GUILink account_types = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[2]/li[1]/a"));
    final public GUILink deposit_withdrawal = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[2]/li[2]/a"));
    final public GUILink hot100 = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[1]/ul[2]/li[3]/a"));
    final public GUILink platforms = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[1]/li[1]/a"));
    final public GUILink noComissionDeposit = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[1]/li[2]/a"));
    final public GUILink cashPuzzle = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[1]/li[3]/a"));
    final public GUILink partnership = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[2]/li[1]/a"));
    final public GUILink demo_account = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[2]/li[2]/a"));
    final public GUILink support = new GUILink(this.getLocator().createChild("/html/body/footer/div[1]/div/nav/div[2]/ul[2]/li[3]/a"));


    final public GUILink legal_information = new GUILink(this.getLocator().createChild("/html/body/footer/div[2]/div/div/div/a[1]"));
    final public GUILink privacy_policy = new GUILink(this.getLocator().createChild("/html/body/footer/div[2]/div/div/div/a[2]"));
    final public GUILink risk_desclosure = new GUILink(this.getLocator().createChild("/html/body/footer/div[2]/div/div/div/a[3]"));
    final public GUILink aml_policy = new GUILink(this.getLocator().createChild("/html/body/footer/div[2]/div/div/div/a[4]"));


    final public GUILink facebook = new GUILink(Locator.create(".//a/img[@alt='facebook']"));
    final public GUILink youtube = new GUILink(Locator.create(".//a/img[@alt='youtube']"));


    final public String phone_number = this.driver().findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/p[1]")).getText();

    final public String emailCompany = this.driver().findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/a")).getText();

    final public String notFor = this.driver().findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/p[2]")).getText();

    final public String licence = this.driver().findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/p")).getText();

    final public String copyright = this.driver().findElement(By.xpath("/html/body/footer/div[2]/div/div/p")).getText();


}
