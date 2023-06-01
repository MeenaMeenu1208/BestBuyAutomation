package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;

public class SearchandAdditemPage extends BaseClass {
	
	@FindBy(id = "gh-search-input")
	WebElement searchTextBox;
	@FindBy(xpath = "//button [contains(@aria-label,'submit search')]")
	WebElement searchButton;
	@FindBy(xpath = "//img [contains(@class,'plp-nav-image max-h-full max-w-full')]")
	WebElement AirPods;

	@FindBy(xpath = "//img [contains(@alt,'Apple - AirPods Pro (2nd generation) - White - Front_Zoom')]")
	WebElement AppleAirpod;
	@FindBy(xpath = "//button[contains(@style,'padding:0 8px')]")
	WebElement AddtocartButton;
	@FindBy(xpath = "//a [contains(@class,'c-button c-button-secondary c-button-sm c-button-block ')]")
	WebElement GoToCartButton;
	@FindBy(id = "quantity-1e66ivxorgpv2-3wr1urbcqa1nf]")
	WebElement prodQuantity;
	@FindBy(xpath = "//button [contains(@class,'btn btn-lg btn-block btn-primary')]")
	WebElement checkoutButton;
	@FindBy(xpath = "//button [contains(text(),'Continue as Guest')]")
	WebElement ContinueasGuestbtn;
	
	
	
	
	
	
	public SearchandAdditemPage() {
		PageFactory.initElements(driver, this);
	}

	public void Searchitem(String searchTextBox) throws InterruptedException {
		typeText(this.searchTextBox, searchTextBox);
		Thread.sleep(1000);
		clickElement(searchButton);
		Thread.sleep(2000);
		
	
	

}
	public void AddItem() throws Exception {
		clickElement(AirPods);
		Thread.sleep(2000);
	}
	public void ClickItem() throws Exception {
		clickElement(AppleAirpod);
		Thread.sleep(2000);
		clickElement(AddtocartButton);
		Thread.sleep(2000);
		//driver.switchTo().frame("tag-sandbox");
		
		String MainWindow=driver.getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                    Thread.sleep(4000);              			
                    			
                                 
			// Closing the Child Window.
                        driver.close();		
            }			
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
        }
		//System.out.println("The total number of iframes are" + iframeElements.size());
        clickElement(prodQuantity);
		Select select = new Select(prodQuantity);
		select.selectByIndex(2);
		Thread.sleep(1000);
		clickElement(checkoutButton);
		Thread.sleep(1000);
		clickElement(ContinueasGuestbtn);

		
		
	}
	
}