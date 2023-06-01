package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class SigninPages extends BaseClass{

	@FindBy(xpath = "//span [contains(text(),'Account')]")
	WebElement createAccountMenuBtn;
	@FindBy(xpath = "//a [contains(text(),'Sign In')]")
	WebElement SignInBtn;
	@FindBy(id = "fld-e")
	WebElement Semail;
	@FindBy(id = "fld-p1")
	WebElement Spassword;
	@FindBy(xpath = "//Button [contains(text(),'Sign In')]")
	WebElement SignInbutton;
	
	
	
	public SigninPages() {
		PageFactory.initElements(driver, this);
	}

	public void SigninAcc(String Semail,String Spassword) throws InterruptedException {
		clickElement(createAccountMenuBtn);
		Thread.sleep(2000);
		clickElement(SignInBtn);
		Thread.sleep(2000);
		typeText(this.Semail, Semail);
		typeText(this.Spassword, Spassword);
		SignInbutton.click();
	}

}
