package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.NavigatingMenusandValidatingTitlePages;

public class NavigatingMenusandValidatingTitleTestCases extends BaseClass {
	NavigatingMenusandValidatingTitlePages nmv = new NavigatingMenusandValidatingTitlePages();
	
	
	@Test
	public void pageNavigation() throws Exception {
		driver.findElement(By.xpath("//a [contains(text(),'Top Deals')]")).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(text(),'Deal of the Day')]")).click();
		Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(text(),'Totaltech Membership')]")).click();
		Assert.assertEquals("Best Buy Totaltech™ – Best Buy", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(text(),'Credit Cards')]")).click();
		Assert.assertEquals("Best Buy Credit Card: Rewards & Financing", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(text(),'Gift Cards')]")).click();
		Assert.assertEquals("Gifts Cards and E-Gift Cards - Best Buy", driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(text(),'Gift Ideas')]")).click();
		Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy", driver.getTitle());
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//span [contains(text(),'More')]"));
		ele.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a [contains(@class,'utility-menu-flyout-list-item')]")).click();
		Assert.assertEquals(driver.getTitle(), "Health & Wellness Solutions & Technology - Best Buy");
		
		
	}
	
   
}
