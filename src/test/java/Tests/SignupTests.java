package Tests;

import Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SignupTests extends Base{



    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
    }

    @Test( dependsOnMethods = "clickLearningMaterialTests")
    public void clickSignupButtonTests(){
        loginPage.clickSignUpToggle();
    }


    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void verifySignupPageIsDisplayedTests() {
        signupPage.verifySignupPageIsDisplayed();

    }

    @Test(dependsOnMethods = "verifySignupPageIsDisplayedTests")
    public void enterFirstNameTests() {
        signupPage.enterFirstName("Gugu");
    }

    @Test(dependsOnMethods = "enterFirstNameTests")
    public void enterLastNameTests() {
        signupPage.enterLastName("Cele");
    }

    @Test(dependsOnMethods = "enterLastNameTests")
    public void enterEmailAddressTests() {
        signupPage.enterEmail("gtvhengani@gmail.com");
    }

    @Test(dependsOnMethods = "enterEmailAddressTests")
    public void enterPasswordTests() {
        signupPage.enterPassword("Gtc@910117");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void enterConfirmPasswordTests() {
        signupPage.enterConfirmPassword("Gtc@910117");

    }

    @Test(dependsOnMethods = "enterConfirmPasswordTests")
    public void clickCreateAccountTests() {
        signupPage.clickCreateAccountButton();
    }

    @Test(dependsOnMethods = "clickCreateAccountTests")
    public void VerifyTermsCheckboxesisDisplayedTests() {
        signupPage.VerifyTermsCheckBoxesisDisplayed();
    }

    @Test(dependsOnMethods = "VerifyTermsCheckboxesisDisplayedTests")
    public void clickLoginButtonTests() {
        signupPage.clickLoginButton();
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
