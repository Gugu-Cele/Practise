package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WelcomePage {
    WebDriver driver;

    @FindBy(id = "practice-heading")
    WebElement welcomePageTitle_id;
    @FindBy(id = "tab-btn-web")
    WebElement WelcomePageTitle_id;


    public WelcomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomePageIsDisplayed() {
       // welcomePageTitle_id.isDisplayed()
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomePageTitle_id));
        WelcomePageTitle_id.isDisplayed();
    }

    public void clickWebTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomePageTitle_id));
        WelcomePageTitle_id.click();
    }
}



