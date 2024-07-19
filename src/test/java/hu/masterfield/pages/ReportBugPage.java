package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportBugPage extends BasePage {

    public ReportBugPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"instabugForm\"]/h3")
    static WebElement reportBugResult;

    public void reportBugPageLoaded() {
        isLoaded(reportBugResult);
    }
}