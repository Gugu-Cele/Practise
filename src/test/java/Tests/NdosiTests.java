package Tests;

import Pages.LoginPage;
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
        loginPage.enterEmailAddress(" celegugu@gmail.com            ");

    }

    @Test(dependsOnMethods = "verifyLoginPageIsDisplayedTests")
    public void enterPasswordTests() {
        loginPage.enterPassword(" Gtc@910117");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickSubmitButtonTests() {
        loginPage.clickSubmitButton();
    }

   @Test(dependsOnMethods = "clickSubmitButtonTests")
    public void verifyWelcomePageIsDisplayedTests(){
       welcomePage.verifyWelcomePageIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWelcomePageIsDisplayedTests")
    public void clickWebTabTests() {
        welcomePage.clickWebTab();
    }

    @Test(dependsOnMethods = "clickWebTabTests")
    public void verifyInventoryCardTests() {
        inventoryformPage.verifyInventoryFormPageIsDisplayed();
    }

   @Test(dependsOnMethods = "verifyInventoryCardTests")
    public void clickDeviceTypeDropDownTests() {
        inventoryformPage.ClickDeviceTypeDropdown("Phone");
    }

   @Test(dependsOnMethods = "clickDeviceTypeDropDownTests")
    public void selectDeviceTypeTests() {
        inventoryformPage.selectDeviceType("phone");
    }

    @Test(dependsOnMethods = "selectDeviceTypeTests")
    public void clickDeviceBrandDropDownTests() {
        inventoryformPage.ClickBrandDropdown("Samsung");
    }

   @Test(dependsOnMethods = "clickDeviceBrandDropDownTests")
    public void selectBrandTests() {
        inventoryformPage.selectBrand("samsung");
    }

    @Test(dependsOnMethods = "selectBrandTests")
    public void selectStorageTests() {
        inventoryformPage.selectStorage();
    }

    @Test(dependsOnMethods = "selectStorageTests")
    public void clickColorDropDownTests() {
        inventoryformPage.ClickColorDropdown("");
    }

    @Test(dependsOnMethods = "clickColorDropDownTests")
    public void selectColorTests() {
        inventoryformPage.selectColor("Black");
    }



    @Test(dependsOnMethods = "selectColorTests")
    public void enterQuantityTests() {
        inventoryformPage.enterQuantity("2");
    }

    @Test(dependsOnMethods = "enterQuantityTests")
    public void enterAddressTests() {
        inventoryformPage.enterAddress("22 Nts");
    }

    @Test(dependsOnMethods = "enterAddressTests")
    public void verifyPricingSummaryIsDisplayedTests() {
        inventoryformPage.verifyPricingSummaryIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyPricingSummaryIsDisplayedTests")
    public void verifyCurrentPriceIsDisplayedTests() {
        inventoryformPage.verifyCurrentPriceIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyCurrentPriceIsDisplayedTests")
    public void verifyUnitPriceIsDisplayedTests() {
        inventoryformPage.verifyUnitPriceIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyUnitPriceIsDisplayedTests")
    public void verifyQuantityLabelIsDisplayedTests() {
        inventoryformPage.verifyQuantityLabelIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyQuantityLabelIsDisplayedTests")
    public void verifySubtotalLabelIsDisplayedTests() {
        inventoryformPage.verifySubtotalLabelIsDisplayed();
    }

    @Test(dependsOnMethods = "verifySubtotalLabelIsDisplayedTests")
    public void verifyPricingNoteIsDisplayedTests() {
        inventoryformPage.verifyPricingNoteIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyPricingNoteIsDisplayedTests")
    public void clickNextButtonTests() {
        inventoryformPage.clickNextButton();
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}

