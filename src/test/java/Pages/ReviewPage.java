package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage {
    WebDriver driver;

@FindBy(id= "inventory-review-step")
    WebElement inventoryReview_id;


public ReviewPage(WebDriver driver){this.driver= driver;}

    }

