package ua.kiev.prog.automation.framework.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



abstract public class PageObject
{
    final protected WebDriver _driver;
    final protected Logger _logger = Logger.getLogger(this.getClass());

    public PageObject ()
    {
        this._driver = Session.get().driver();
    }

    public void confirmPage ()
    {
        _logger.debug("Confirm page");
        try {
            WebDriverWait wait = new WebDriverWait(this._driver, Timeouts.DEF_TIMEOUT_PAGE_OBJECT_WAIT);
            wait.until(d -> d.findElements(this.readyLocator().getWDLocator()).size() != 0);
        } catch (Throwable e) {
            throw new RuntimeException("I can not confirm that page is loaded. My name is " + this.getClass().getSimpleName());
        }
    }

    abstract protected Locator readyLocator();
}
