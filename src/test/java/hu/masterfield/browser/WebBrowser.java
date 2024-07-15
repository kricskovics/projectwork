package hu.masterfield.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebBrowser {

    public static WebDriver createDriver(WebBrowserType type) {
        WebDriver driver = null;
        FirefoxOptions ffOptions = null;
        ChromeOptions chromeOptions = null;
        EdgeOptions edgeOptions = null;

        switch (type) {
            case ChromeSM:
                chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"
                        , "disable-logging"});
                chromeOptions.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
            case FirefoxSM:
                driver = new FirefoxDriver();
                break;
            default:
                break;
        }
        Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
        String webBrowserName = capabilities.getBrowserName();
        String webBrowserVersion = capabilities.getBrowserVersion();
        System.out.printf("Browser is: " + webBrowserName + "  " + webBrowserVersion);
        return driver;
    }
}