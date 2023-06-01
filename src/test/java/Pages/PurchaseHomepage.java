package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseHomepage {

	@FindBy(xpath = "//a [contains(text(),'Headphones')]")
	WebElement HeadPhones;
	@FindBy(id = "//img [contains(@class,'product-image')]")
	WebElement productImage;
	@FindBy(id = "/span [contains(@data-sku,'6505725')]")
	WebElement productColor;
	@FindBy(id = "//button[contains(@class,'c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button'")
	WebElement AddtocartButton;
	@FindBy(id = "//a[contains(@class,'c-button c-button-secondary c-button-sm c-button-block ')]")
	WebElement gotocartButton;
	
	@FindBy(xpath = "//button [contains(@class,'btn btn-lg btn-block btn-secondary')]")
	WebElement continueToPayInfoBTN;
	
}
