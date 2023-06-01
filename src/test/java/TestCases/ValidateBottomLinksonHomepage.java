package TestCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class ValidateBottomLinksonHomepage extends BaseClass {

	@Test
public void BrokenLinksTestcase () throws Exception {
		BaseClass bc = new BaseClass();
		HttpURLConnection httpConn = null;
		try {
			bc.start();
		List <WebElement>links =  driver.findElements(By.tagName("a"));
	    System.out.println("Total Link Size: " + links.size());
	    for(int i = 0; i < links.size(); i++)
	    {
	    	
	      WebElement element = links.get(i);     
	      String url = element.getAttribute("href");
	      URL link = new URL(url);
	      httpConn = (HttpURLConnection) link.openConnection();
	      httpConn.connect();
	      int code = httpConn.getResponseCode();
	      if(code >= 400)
	      {
	        System.out.println("Broken Link: " + url);
	      }
	      else
	      {
	        System.out.println("Valid Link: " + url);
	      }    
	    }
	    
	    System.out.println(driver.getTitle());
	    driver.quit();   
	
	}catch (UnknownHostException e) {
		httpConn.disconnect();
	}
}
}
