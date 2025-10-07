package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SignupPage signupPage = PageFactory.initElements(driver, SignupPage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    WelcomePage welcomePage = PageFactory.initElements(driver, WelcomePage.class);
    InventoryformPage inventoryformPage = PageFactory.initElements(driver, InventoryformPage.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();
}