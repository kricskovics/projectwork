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
    static WebElement privacyPolicyElement;

    @FindBy(tagName = "h2")
    static WebElement currentLanguageElement;

    @FindBy(xpath = "//span[@title='english']")
    static WebElement englishFlag;

    @FindBy(xpath = "//span[@title='magyar']")
    static WebElement hungarianFlag;

    @FindBy(xpath = "//*[@id=\"panel-inner\"]/p/span[1]/a/span[2]")
    static WebElement reportBug;

    @FindBy(xpath = "//input[@placeholder='From']")
    static WebElement fromField;

    @FindBy(className = "planner-to")
    static WebElement toField;

    @FindBy(xpath = "//input[@value='Plan']")
    static WebElement planButton;

    public static void clickOnEnglishFlag() {
        englishFlag.click();
    }

    public static void clickOnHungarianFlag() {
        hungarianFlag.click();
    }

    public static String getCurrentLanguageName() {
        return currentLanguageElement.getText();
    }

    public static boolean isCurrentLanguageSetToEnglish() {
        return getCurrentLanguageName().equals("Trip Planner");
    }

    public static void clickOnPrivacyPolicy() {
        privacyPolicyElement.click();
    }

    public static void iClickReportBug() {
        reportBug.click();
        new ReportBugPage(driver);
    }

    public static void fillFromField(String departure) {
        fromField.sendKeys(departure + Keys.TAB);
    }

    public static void fillToField(String destination) {
        toField.sendKeys(destination + Keys.TAB);
    }

    public static void clickOnPlanButton() {
        planButton.click();
    }

}
