package ua.kiev.prog.automation.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Session
{
    private WebDriver _driver;

    private static Session _instance;

    private Session () { /* Empty */}

    public static Session get ()
    {
        if (_instance == null)
            _instance = new Session();

        return _instance;
    }

    public WebDriver driver ()
    {
        if (this._driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/mac/chromedriver");
            this._driver = new ChromeDriver();
        }
        return this._driver;
    }

    public WebDriver driverInvis ()
    {
        if (this._driver == null) {
            //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
            //this._driver = new ChromeDriver();
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            try {
                this._driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub/"), cap);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return this._driver;
    }

    public void close ()
    {
        if (this._driver != null) {
            this._driver.quit();
            this._driver = null;
        }
    }
}
