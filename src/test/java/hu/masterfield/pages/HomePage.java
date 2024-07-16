package hu.masterfield.pages;

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
}