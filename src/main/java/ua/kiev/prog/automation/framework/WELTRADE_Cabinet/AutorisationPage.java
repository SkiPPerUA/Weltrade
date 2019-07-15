package ua.kiev.prog.automation.framework.WELTRADE_Cabinet;

import ua.kiev.prog.automation.framework.base.Locator;
import ua.kiev.prog.automation.framework.base.PageObject;
import ua.kiev.prog.automation.framework.base.widget.GUIButton;
import ua.kiev.prog.automation.framework.base.widget.GUITextBox;

public class AutorisationPage extends PageObject {
    @Override
    protected Locator readyLocator() {
        return Locator.create("/html/body/app-root/app-authorization/div/section/app-default-authorization/section/div/div/div[1]/div/div[1]/div/form/div/button");
    }

    GUITextBox login = new GUITextBox(Locator.create(".//input[@formcontrolname = 'email']"));
    GUITextBox password = new GUITextBox(Locator.create(".//input[@formcontrolname = 'password']"));

    GUIButton loginButton = new GUIButton(Locator.create("/html/body/app-root/app-authorization/div/section/app-default-authorization/section/div/div/div[1]/div/div[1]/div/form/div/button"));


    final public void loginInCabinet(String name, String password){

        login.setValue(name);
        this.password.setValue(password);
        loginButton.click();
    }

}
