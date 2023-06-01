package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Utils;


public class BaseClass extends Utils{
	//prerequisite
		@BeforeMethod
		public void start() throws Exception {
			
			browserLaunch(getpropvalue("browser"));
			launchUrl(getpropvalue("url"));
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("https://www.bestbuy.com/"+"\n");
			driver.findElement(By.xpath("//h3")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//h4 [contains(text(),'United States')]")).click();
		}
		
	
			
		@AfterMethod
		public void close() {
		driver.quit();
		}
		

		
	}


