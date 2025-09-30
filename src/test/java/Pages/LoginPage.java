package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    static WebDriver driver;

    @FindBy(id = "login-heading")
    WebElement loginPageTitle_id;
    @FindBy(id = "login-email")
    WebElement emailField_id;
    @FindBy(id = "login-password")
    WebElement passwordField_id;
    @FindBy(id = "login-submit")
    WebElement submitButton_id;


    public LoginPage(WebDriver driver) {this.driver = driver;
    }

    public void verifyLoginPageIsDisplayed() {loginPageTitle_id.isDisplayed();
    }

    public void enterEmailAddress(String email) {emailField_id.sendKeys(email);
    }
public void enterPassword(String password) {passwordField_id.sendKeys(password);
    }
    public void clickSubmitButton() {loginPageTitle_id.click();
    }
}


