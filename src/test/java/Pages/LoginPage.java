package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    static WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle_id;
    @FindBy(id="signup-toggle")
    WebElement SignUpButton_id;

    @FindBy(id = "login-email")
    WebElement emailField_id;
    @FindBy(id = "login-password")
    WebElement passwordField_id;
    @FindBy(id = "login-submit")
    WebElement submitButton_id;


    public LoginPage(WebDriver driver) {this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginPageTitle_id));
        loginPageTitle_id.isDisplayed();
    }

    public void clickSignUpToggle() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(SignUpButton_id));
        SignUpButton_id.click();
    }



    public void enterEmailAddress(String email) {
        //emailField_id.sendKeys(email);
      new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(emailField_id));
      emailField_id.clear();
        emailField_id.sendKeys(email);

    }
public void enterPassword(String password) {
        //passwordField_id.sendKeys(password);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(passwordField_id));
        passwordField_id.clear();
        passwordField_id.sendKeys(password);
    }
    public void clickSubmitButton() {
        submitButton_id.click();
    }
}


