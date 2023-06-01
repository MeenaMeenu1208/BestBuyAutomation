package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(id = "user.emailAddres")
	WebElement emailaddress;
	@FindBy(id = "user.phone")
	WebElement phnumber;
	@FindBy(xpath = "//button [contains(@class,'btn btn-lg btn-block btn-secondary')]")
	WebElement ContinueToPay;
	
	@FindBy(id = "number")
	WebElement cardNumber;
	@FindBy(id = "expMonth")
	WebElement expMonth;
	@FindBy(id = "expYear")
	WebElement expYear;
	@FindBy(id = "cvv")
	WebElement cvv;
	@FindBy(id = "save-to-profile")
	WebElement checkBox;
	@FindBy(id = "first-name")
	WebElement firstname;
	@FindBy(id = "last-name")
	WebElement lastname;
	@FindBy(id = "address-input")
	WebElement Address;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "postalCode")
	WebElement zipCode;
	@FindBy(xpath = "//button [contains(@class,'btn btn-lg btn-block btn-primary')]")
	WebElement PYOButton;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
public void ContinueasGuest() throws Exception {
		
		typeText(this.emailaddress, "meenameenu1313@gmail.com");
		Thread.sleep(1000);
		typeText(this.phnumber, "2025550137");
		Thread.sleep(1000);
		clickElement(ContinueToPay);
		Thread.sleep(2000);
	}

	public void paymentInfo(String cardNumber,String expMonth, String expYear,String cvv, String firstname, String lastname, String Address, String city,String state, String zipCode ) throws InterruptedException {
		
		typeText(this.cardNumber, cardNumber);
		typeText(this.expMonth, expMonth);
		typeText(this.expYear, expYear);
		typeText(this.cvv, cvv);
		typeText(this.firstname, firstname);
		typeText(this.lastname, lastname);
		typeText(this.Address, Address);
		typeText(this.city, city);
		
		typeText(this.zipCode, zipCode);
		PYOButton.click();
	}
}
