package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WelcomePage {
    WebDriver driver;

    @FindBy(id = "practice-header")
    WebElement welcomePageTitle_id;
    @FindBy(id = "tab-btn-web")
    WebElement WelcomePageTitle_id;
    @FindBy(id = "inventory-card")
    WebElement inventoryCard_id;
    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown_id;
    @FindBy(id = "deviceType")
    WebElement deviceTypeSelect_id;
    @FindBy(id = "brandDropdown_id")
    WebElement brandDropdown_id;
    @FindBy(id = "brand")
    WebElement brandSelect_id;
    @FindBy(id = "storage-128GB")
    WebElement storageSelect_id;
    @FindBy(id = "colorDropdown_id")
    WebElement colorDropdown_id;
    @FindBy(id = "color-Black")
    WebElement colorSelect_id;
    @FindBy(id = "ClearQuantity")
    WebElement ClearQuantityField_id;
    @FindBy(id = "quantity")
    WebElement quantity_id;
    @FindBy(id = "address")
    WebElement address_id;
    @FindBy(id = "pricing-note")
    WebElement pricingNote_id;
    @FindBy(id = "current-price-header")
    WebElement currentPriceHeader_id;
    @FindBy(id = "unit-price-label")
    WebElement totalPrice_id;
    @FindBy(id = "quantity-label")
    WebElement quantityLabel_id;
    @FindBy(id = "subtotal-label")
    WebElement subtotalLabel_id;
    @FindBy(id = "pricing-note")
    WebElement pricingNoteLabel_id;
    @FindBy(id = "inventory-next-btn")
    WebElement inventoryNextButton_id;


    public void WelcomePade(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWelcomePageIsDisplayed() {
        welcomePageTitle_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomePageTitle_id));
        WelcomePageTitle_id.isDisplayed();
    }

    public void clickWebTab() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomePageTitle_id));
        WelcomePageTitle_id.click();
    }

    public void verifyInventoryCard() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(welcomePageTitle_id));
        inventoryCard_id.isDisplayed();
    }

    public void ClickDeviceTypeDropdown(String deviceType) {
        deviceTypeDropdown_id.click();
    }

    public void selectDeviceType(String deviceType) {
        deviceTypeSelect_id.sendKeys(deviceType);
    }

    public void ClickBrandDropdown(String brand) {
        brandDropdown_id.click();
    }

    public void selectBrand(String brand) {
        brandDropdown_id.sendKeys(brand);
    }

    public void selectStorage(String storage) {
        storageSelect_id.click();
    }

    public void selectColor(String color) {
        colorSelect_id.click();
    }

    public void clearQuantity() {
        ClearQuantityField_id.clear();
    }

    public void changeQuantity(String quantity) {
        quantity_id.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        address_id.sendKeys(address);
    }

    public void verifyPricingNoteIsDisplayed() {
        pricingNote_id.isDisplayed();
    }

    public void verifyCurrentPriceHeaderIsDisplayed() {
        currentPriceHeader_id.isDisplayed();
    }

    public void verifyTotalPriceIsDisplayed() {
        totalPrice_id.isDisplayed();
    }

    public void verifyQuantityLabelIsDisplayed() {
        quantityLabel_id.isDisplayed();
    }

    public void verifySubtotalLabelIsDisplayed() {
        subtotalLabel_id.click();
    }

    public void verifyPricingNoteLabelIsDisplayed() {
        pricingNoteLabel_id.isDisplayed();
    }

    public void clickInventoryNextButton() {
        inventoryNextButton_id.click();
    }
}
