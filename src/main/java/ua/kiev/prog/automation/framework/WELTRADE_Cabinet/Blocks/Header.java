package ua.kiev.prog.automation.framework.WELTRADE_Cabinet.Blocks;

import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

public class Header extends BlockObject {

    public Header() {
        super(Locator.create(".//a[1]/img[@alt='logo']"));
    }

    final public GUILink userInfo = new GUILink(Locator.create(".//div[@class='user-info-profile']"));
    final public GUILink userSettings = new GUILink(Locator.create(".//li/a[@routerlink='/settings']"));


    final public GUILink trader = new GUILink(Locator.create(".//li/a[@routerlink='/trader/']"));
    final public GUILink traderControl = new GUILink(Locator.create(".//li/a[@routerlink='/trader/control']"));


    final public GUILink cashier = new GUILink(Locator.create("/html/body/app-root/app-pages/header/app-header/app-main-nav-menu/nav[1]/div/div/ul/li[2]/a"));
    final public GUILink cashierFinOperation = new GUILink(Locator.create(".//li/a[@routerlink='/cashbox/operations']"));
    final public GUILink cashierHistory = new GUILink(Locator.create(".//li/a[@routerlink='/cashbox/history']"));


    final public GUILink partner = new GUILink(Locator.create("/html/body/app-root/app-pages/header/app-header/app-main-nav-menu/nav[1]/div/div/ul/li[3]/a"));
    final public GUILink partnerTerms = new GUILink(Locator.create(".//li/a[@routerlink='/partner/terms']"));

    final public GUILink language = new GUILink(Locator.create(".//div[@class='select-lang ng-star-inserted']"));
    final public GUILink languageEng = new GUILink(this.getLocator().createChild("//*[@id='en']"));
    final public GUILink languageThai = new GUILink(this.getLocator().createChild("//*[@id='th']"));
    final public GUILink languageRus = new GUILink(this.getLocator().createChild("//*[@id='ru']"));
    final public GUILink languageInd = new GUILink(this.getLocator().createChild("//*[@id='id']"));
    final public GUILink languageEsp = new GUILink(this.getLocator().createChild("//*[@id='es']"));
    final public GUILink languageVn = new GUILink(this.getLocator().createChild("//*[@id='vi']"));
    final public GUILink languageLao = new GUILink(this.getLocator().createChild("//*[@id='lo']"));
    final public GUILink languageMs = new GUILink(this.getLocator().createChild("//*[@id='ms']"));
    final public GUILink languageCn = new GUILink(this.getLocator().createChild("//*[@id='zh']"));

    public String getNameLangauge(int x){
        String [] allNameLanguages = {"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"};
        return allNameLanguages[x];
    }

    public void getAllLanguages(int i){

        this.language.click();
        GUILink [] all = {this.languageEng,this.languageThai,this.languageRus,this.languageInd,this.languageEsp,this.languageVn,this.languageLao,this.languageMs,this.languageCn};
        all[i].click();

    }
}
