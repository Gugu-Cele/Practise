package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class InventoryformPage {
    WebDriver driver;

    @FindBy(id = "Inventoryform-heading")
    WebElement InventoryformPageTitle_id;
    @FindBy(id = "device-type-dropdown")
    WebElement deviceTypeDropdown_id;
    @FindBy(id = "deviceType")
    WebElement deviceTypeSelect_id;
    @FindBy(id = "brand-dropdown")
    WebElement brandDropdown_id;
    @FindBy(id = "brand")
    WebElement brandSelect_id;
    @FindBy(id = "storage")
    WebElement storageSelect_id;
    @FindBy(id = "color-Dropdown")
    WebElement colorDropdown_id;
    @FindBy(id = "color")
    WebElement colorSelect_id;
    @FindBy(id = "ClearQuantityField")
    WebElement ClearQuantityField_id;
    @FindBy(id = "Quantity")
    WebElement quantityField_id;
    @FindBy(id = "address")
    WebElement address_id;
    @FindBy(id = "step1-pricing-summary")
    WebElement pricingSummary_id;
    @FindBy(id = "current-price-header")
    WebElement currentPrice_id;
    @FindBy(id = "unit-price-value")
    WebElement unitPrice_id;
    @FindBy(id = "quantity-label")
    WebElement quantityLabel_id;
    @FindBy(id = "subtotal-label")
    WebElement subtotalLabel_id;
    @FindBy(id = "pricing-note")
    WebElement pricingNote_id;
    @FindBy(id = "next-button")
    WebElement nextButton_id;


    public InventoryformPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyInventoryformPageIsDisplayed() {
        InventoryformPageTitle_id.isDisplayed();
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

    public void ClickColorDropdown(String color) {
        colorSelect_id.click();
    }

    public void selectColor(String color) {
        colorSelect_id.click();
    }

    public void clearQuantity() {
        ClearQuantityField_id.clear();
    }

    public void enterQuantity(String quantity) {
        quantityField_id.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        address_id.sendKeys(address);
    }

    public void verifyPricingSummaryIsDisplayed() {
        pricingSummary_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(pricingSummary_id));
    }

    public void verifyCurrentPriceIsDisplayed() {
        currentPrice_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(currentPrice_id));
    }

    public void verifyUnitPriceIsDisplayed() {
        unitPrice_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(unitPrice_id));
    }

    public void verifyQuantityLabelIsDisplayed() {
        quantityLabel_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(quantityLabel_id));
    }

    public void verifySubtotalLabelIsDisplayed() {
        subtotalLabel_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(subtotalLabel_id));
    }

    public void verifyPricingNoteIsDisplayed() {
        pricingNote_id.isDisplayed();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(pricingNote_id));
    }

    public void clickNextButton() {
        nextButton_id.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(nextButton_id));
    }
}





