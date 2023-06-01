package TestCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class BrokenLinkTestcase extends BaseClass{

@Test	
public void BrokenLinksTestcase ()  throws Exception {
		
		HttpURLConnection httpConn = null;
		try {

		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
		driver.manage().window().maximize();
		  String url = "https://www.bestbuy.com";
	      URL link = new URL(url);
	      httpConn = (HttpURLConnection) link.openConnection();
	      httpConn.connect();
	      int code = httpConn.getResponseCode();
	      if(code >= 400)
	      {
	        System.out.println(url+ "  :" + "Broken Link: ");
	      }
	      else
	      {
	        System.out.println(url + "  :" + "Valid Link: ");
	      }    
	  
	      System.out.println();
	    driver.quit();   
	
	}catch (UnknownHostException e) {
		httpConn.disconnect();
	}
}

}
