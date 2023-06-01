package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class CreateAccountPages extends BaseClass{
	@FindBy(xpath = "//span [contains(text(),'Account')]")
	WebElement createAccountMenuBtn;
	@FindBy(xpath = "//a [contains(text(),'Create Account')]")
	WebElement createAccoundButton;
	@FindBy(id = "firstName")
	WebElement fristName;
	@FindBy(id = "lastName")
	WebElement lastName;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "fld-p1")
	WebElement passWord;
	@FindBy(id = "reenterPassword")
	WebElement confirmPassword;
	@FindBy(id = "phone")
	WebElement phoneNumber;
	@FindBy(xpath = "//button [contains(text(),'Create an Account')]")
	WebElement createAccountSubmitButton;
	@FindBy(xpath = "//p [contains(text(),'Please enter your first name.')]")
	WebElement invalidfnameErrmsg;
	
	public CreateAccountPages() {
		PageFactory.initElements(driver, this);
	}

	public void createAcc(String fristName,String lastName, String email, String passWord, String confirmPassword, String phoneNumber) throws InterruptedException {
		clickElement(createAccountMenuBtn);
		Thread.sleep(2000);
		clickElement(createAccoundButton);
		Thread.sleep(2000);
		typeText(this.fristName, fristName);
		Thread.sleep(1000);
		typeText(this.lastName, lastName);
		Thread.sleep(1000);
		typeText(this.email, email);
		Thread.sleep(1000);
		typeText(this.passWord, passWord);
		Thread.sleep(1000);
		typeText(this.confirmPassword, confirmPassword);
		Thread.sleep(1000);
		typeText(this.phoneNumber, phoneNumber);
		Thread.sleep(3000);
		createAccountSubmitButton.click();
	}

}