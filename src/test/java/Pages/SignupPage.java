package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SignupPage {
    WebDriver driver;

    @FindBy(id = "registration-heading")
    WebElement signupPageTitle_id;
    @FindBy(id = "register-firstName")
    WebElement FirstnameField_id;
    @FindBy(id = "register-lastName")
    WebElement LastnameField_id;
    @FindBy(id = "register-email")
    WebElement EmailField_id;
    @FindBy(id = "register-password")
    WebElement PasswordField_id;
    @FindBy(id = "register-confirmPassword")
    WebElement ConfirmPasswordField_id;
    @FindBy(id = "register-submit")
    WebElement CreateAccountButton_id;
    @FindBy(id = "register-terms")
    WebElement TermsCheckbox_id;
    @FindBy(id = "login-toggle")
    WebElement LoginButton_id;









    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifySignupPageIsDisplayed() {
        signupPageTitle_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(signupPageTitle_id));
    }
    public void enterFirstName(String firstname) {
        FirstnameField_id.sendKeys(firstname);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(FirstnameField_id));
    }
    public void enterLastName(String lastname) {
        LastnameField_id.sendKeys(lastname);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(LastnameField_id));

    }
    public void enterEmail(String email) {
        EmailField_id.sendKeys(email);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(EmailField_id));

    }
    public void enterPassword(String password) {
        PasswordField_id.sendKeys(password);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(PasswordField_id));

    }
    public void enterConfirmPassword(String confirmpassword) {
        ConfirmPasswordField_id.sendKeys(confirmpassword);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(ConfirmPasswordField_id));

    }
    public void clickSignupButton() {
        CreateAccountButton_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(CreateAccountButton_id));

    }
    public void VerifyTermsCheckboxisDisplayed() {
        TermsCheckbox_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(TermsCheckbox_id));

    }

    public void clickLoginButton() {
        LoginButton_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(LoginButton_id));

    }


}
