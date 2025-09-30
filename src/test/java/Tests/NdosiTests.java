package Tests;

import Pages.WelcomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class NdosiTests extends Base {
    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void verifyLoginPageIsDisplayedTests() {
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
    public void enterEmailAddressTests() {
        loginPage.enterEmailAddress(" makes@gmail.com            ");

    }
    @Test(dependsOnMethods = "enterEmailAddressTests")
     public void enterPasswordTests(){
        loginPage.enterPassword(" ");
}
    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickSubmitButtonTests(){
        loginPage.clickSubmitButton();
    }
    @Test(dependsOnMethods = "clickSubmitButtonTests")
    public void verifyWelcomePageIsDisplayedTests(){
        welcomePage.verifyWelcomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWelcomePageIsDisplayedTests")
    public void clickWebTabTests(){
        welcomePage.clickWebTab();
    }

    @Test(dependsOnMethods = "clickWebTabTests")
    public void verifyInventoryCardTests(){
        welcomePage.verifyInventoryCard();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

