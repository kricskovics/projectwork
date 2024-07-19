package hu.masterfield.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripPlanPage extends BasePage {

    public TripPlanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[@class='noprint']")
    WebElement resultTitle;

    public void assertSuggestedItineraries() {
        isLoaded(resultTitle);
        String resultText = resultTitle.getText();
        Assertions.assertEquals("Suggested itineraries", resultText);
    }
}