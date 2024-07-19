package hu.masterfield.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Accept']")
    WebElement privacyPolicyElement;

    @FindBy(tagName = "h2")
    WebElement currentLanguageElement;

    @FindBy(xpath = "//span[@title='english']")
    WebElement englishFlag;

    @FindBy(xpath = "//span[@title='magyar']")
    WebElement hungarianFlag;

    @FindBy(xpath = "//*[@id=\"panel-inner\"]/p/span[1]/a/span[2]")
    WebElement reportBug;

    @FindBy(xpath = "//input[@placeholder='From']")
    WebElement fromField;

    @FindBy(className = "planner-to")
    WebElement toField;

    @FindBy(xpath = "//input[@value='Plan']")
    WebElement planButton;

    public void clickOnEnglishFlag() {
        englishFlag.click();
    }

    public void clickOnHungarianFlag() {
        hungarianFlag.click();
    }

    public String getCurrentLanguageName() {
        return currentLanguageElement.getText();
    }

    public boolean isCurrentLanguageSetToEnglish() {
        return getCurrentLanguageName().equals("Trip Planner");
    }

    public void clickOnPrivacyPolicy() {
        privacyPolicyElement.click();
    }

    public void iClickReportBug() {
        reportBug.click();
        new ReportBugPage(driver);
    }

    public void fillFromField(String departure) {
        fromField.sendKeys(departure + Keys.TAB);
    }

    public void fillToField(String destination) {
        toField.sendKeys(destination + Keys.TAB);
    }

    public TripPlanPage plan(String departure, String destination) {
        fromField.sendKeys(departure + Keys.TAB);
        toField.sendKeys(destination + Keys.TAB);
        planButton.click();
        return new TripPlanPage(driver);
    }

}
