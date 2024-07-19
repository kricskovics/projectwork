package hu.masterfield.steps;

import hu.masterfield.pages.HomePage;
import hu.masterfield.pages.ReportBugPage;
import hu.masterfield.pages.TripPlanPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BKKGoSteps {

    private final String ENGLISH_LANGUAGE = "English";
    private final String HUNGARIAN_LANGUAGE = "Hungarian";

    protected WebDriver driver;
    protected WebDriverWait wait;

    HomePage homePage;
    ReportBugPage reportBugPage;
    TripPlanPage tripPlanPage;

    @Before
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");

        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I open Budapest Go site")
    public void iOpenBKKWebsite() {
        driver.get("https://go.bkk.hu/");
        this.homePage = new HomePage(driver);
    }

    @And("I accept privacy policy")
    public void iAcceptPrivacyPolicy() {
        homePage.clickOnPrivacyPolicy();
    }

    @Given("language is set to {string}")
    public void languageIsSetToEnglish(String expectedLanguage) {
        if (homePage.isCurrentLanguageSetToEnglish()) {
            if (expectedLanguage.equals(HUNGARIAN_LANGUAGE)) {
                homePage.clickOnHungarianFlag();
            }
        } else {
            if (expectedLanguage.equals(ENGLISH_LANGUAGE)) {
                homePage.clickOnEnglishFlag();
            }
        }
    }

    @When("I select the {string} flag")
    public void iClickOnTheHungarianFlag(String flagName) throws Exception {
        if (flagName.equals(ENGLISH_LANGUAGE)) {
            homePage.clickOnEnglishFlag();
        } else if (flagName.equals(HUNGARIAN_LANGUAGE)) {
            homePage.clickOnHungarianFlag();
        } else {
            throw new Exception("Invalid language!");
        }
    }

    @Then("language is changed to {string}")
    public void languageIsChangedToHungarian(String newLanguage) {
        if (homePage.isCurrentLanguageSetToEnglish()) {
            Assertions.assertEquals(ENGLISH_LANGUAGE, newLanguage);
        } else {
            Assertions.assertEquals(HUNGARIAN_LANGUAGE, newLanguage);
        }
    }

    @When("I Start a Report a bug")
    public void IclickReportaBug() {
        homePage.iClickReportBug();
    }

    @Then("Report bug page opens")
    public void reportABugPageIsOpened() {
        reportBugPage.reportBugPageLoaded();
    }

    @When("I plan a trip from {string} to {string}")
    public void iPlanATripFromTo(String departure, String destination) {
        tripPlanPage = homePage.plan(departure, destination);
    }

    @Then("I should see some possible routes")
    public void assertSuggestedItineraries() {
        tripPlanPage.assertSuggestedItineraries();
    }
}
