package hu.masterfield.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TripPlanPage extends BasePage {

    public TripPlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[@class='noprint']")
    static WebElement resultTitle;

    public static void assertSuggestedItineraries() {
        wait.until(ExpectedConditions.presenceOfElementLocated((By) resultTitle));
        String resultText = resultTitle.getText();
        Assertions.assertEquals("Suggested itineraries", resultText);
    }
}