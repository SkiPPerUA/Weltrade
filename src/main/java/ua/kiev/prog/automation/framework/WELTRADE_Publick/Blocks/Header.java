package ua.kiev.prog.automation.framework.WELTRADE_Publick.Blocks;


import ua.kiev.prog.automation.framework.WELTRADE_Publick.MainPage;
;
import ua.kiev.prog.automation.framework.WELTRADE_Publick.SupportPage;
import ua.kiev.prog.automation.framework.base.BlockObject;
import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.widget.GUILink;

import java.lang.reflect.Array;

public class Header extends BlockObject {

    public Header() {
        super(Locator.create("/html/body/header/div[1]/div/div/div[1]/a/img"));
    }

    final public GUILink support = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/div/a[2]"));
    final public GUILink logo = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[1]/a"));
    final public GUILink registration = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/a[1]"));
    final public GUILink login = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/a[2]"));
    final public GUILink banner = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[2]"));



    final public GUILink company = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/span"));
    final public GUILink about_company = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[1]/a/span"));
    final public GUILink history_company = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[2]/a/span"));
    final public GUILink awards_company = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[3]/a/span"));
    final public GUILink legal_information = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[4]/a/span"));
    final public GUILink news = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[5]/a/span"));
    final public GUILink support_company = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[1]/div/ul/li[6]/a/span"));

    final public GUILink trading = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[2]/span"));
    final public GUILink trading_tools = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[2]/div/ul/li[2]/a"));


    final public GUILink autotrading = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[3]/span"));
    final public GUILink partner = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[4]/span"));
    final public GUILink promotions = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[5]/span"));


    final public GUILink instruments = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[6]/span"));
    final public GUILink tradingCalculator = new GUILink(this.getLocator().createChild("/html/body/header/div[2]/div/nav/ul/li[6]/div/ul/li[1]/a"));
    final public GUILink onlineQuotes = new GUILink(Locator.create("/html/body/header/div[2]/div/nav/ul/li[6]/div/ul/li[6]/a"));

    final public GUILink languages = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div"));
    final public GUILink languageEng = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='en']/a/span[2]"));
    final public GUILink languageThai = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='th']/a/span[2]"));
    final public GUILink languageRus = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='ru']/a/span[2]"));
    final public GUILink languageInd = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='id']/a/span[2]"));
    final public GUILink languageEsp = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='es']/a/span[2]"));
    final public GUILink languageVn = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='vi']/a/span[2]"));
    final public GUILink languageLao = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='lo']/a/span[2]"));
    final public GUILink languageMs = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='ms']/a/span[2]"));
    final public GUILink languageCn = new GUILink(this.getLocator().createChild("/html/body/header/div[1]/div/div/div[3]/div[2]/noindex/div/div/ul/li[@name='cn']/a/span[2]"));



    public GUILink[] getAllCompanySector(){

        GUILink [] all = {this.about_company, this.history_company, this.awards_company, this.legal_information, this.news, this.support_company};
        return all;

    }

    public String getNameLangauge(int x){
        String [] allNameLanguages = {"Eng","Thai","Rus","Indon","Esp","Vn","Lao","Ms","CN"};
        return allNameLanguages[x];
    }

    public void getAllLanguages(int i){

        this.languages.click();
        GUILink [] all = {this.languageEng, this.languageThai, this.languageRus, this.languageInd, this.languageEsp, this. languageVn, this.languageLao, this.languageMs, this.languageCn};
        all[i].click();

    }


    public void moveOnElement(GUILink link){
        link.moveCursorToElement();


    }


    public SupportPage getSupport_company (){
        this.support_company.click();
        SupportPage supportPage = new SupportPage();
        supportPage.confirmPage();
        return supportPage;
    }

    public SupportPage getSupport (){
        this.support.click();
        SupportPage supportPage = new SupportPage();
        supportPage.confirmPage();
        return supportPage;
    }

    public MainPage getLogo (){
        this.logo.click();
        MainPage mainPage = new MainPage();
        mainPage.confirmPage();
        return mainPage;
    }
}
