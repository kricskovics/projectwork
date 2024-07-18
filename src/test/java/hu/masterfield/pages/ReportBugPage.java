package hu.masterfield.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportBugPage extends BasePage {

    public ReportBugPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"panel-inner\"]/p/span[1]/a/span[2]")
    WebElement reportBug;

    @FindBy(xpath = "//*[@id=\"instabugForm\"]/h3")
    WebElement reportBugResult;

    public void iClickReportBug() {
        reportBug.click();
    }

    public void reportBugPageLoaded() {
        isLoaded(reportBugResult);
    }

    private void isLoaded(WebElement reportBugResult) {
    }
}