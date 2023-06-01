package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	
public static WebDriver driver;
	
	
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			File file = new File("E:\\Meena\\Workspace\\workspace\\AUT5\\src\\test\\java\\SeleniumLearning\\configure.properties");
			FileInputStream ip = new FileInputStream(file);
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	//Launching browser
	public static void browserLaunch(String name) {

		switch (name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("No valid options given choosing the default browser");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	//launching URL
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	// Check for element availability
		public static boolean waitforme(WebElement element) {
			boolean flag = false;

			try {

				WebDriverWait wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.visibilityOf(element));
				//test.log(Status.PASS, id + "is available");
				flag = true;
			} catch (Exception e) {
				System.out
						.println("Error occured while waiting for the element :" + "with exception " + e.getMessage());
				//test.log(Status.FAIL, id + "is not available");

			}
			return flag;
		}
		
		// Click a Web Element

		public void clickElement(WebElement element) {
			try {

				if (waitforme(element)) {
					element.click();
					//test.log(Status.PASS, id + "is clicked ");
				}
			} catch (Exception e) {
				System.out.println("Error in clicking the webelement :" + e.getMessage());
				//test.log(Status.FAIL, "Failed to click the element :" + id);
			}

		}
		//Send keys to the textbox
		public void typeText(WebElement element,String txt) {
			try {

				if (waitforme(element)) {
					element.sendKeys(txt);
					//test.log(Status.PASS, id + "is clicked ");
				}
			} catch (Exception e) {
				System.out.println("Error in Typing the webelement :" + e.getMessage());
				//test.log(Status.FAIL, "Failed to click the element :" + id);
			}

		}
		
		/*public String[][] getExcelData(String fileName, String sheetName) throws IOException {
	        String[][] data = null;
	        try {
	        	File f  =new File(fileName);
	            FileInputStream fis = new FileInputStream(f);
	            XSSFWorkbook workbook = new XSSFWorkbook(fis);
	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            XSSFRow row = sheet.getRow(0);
	            int noOfRows = sheet.getPhysicalNumberOfRows();
	            int noOfCols = row.getLastCellNum();
	            XSSFCell cell;
	            data = new String[noOfRows - 1][noOfCols];
	 
	            for (int i = 1; i < noOfRows; i++) {
	                for (int j = 0; j < noOfCols; j++) {
	                    row = sheet.getRow(i);
	                    cell = row.getCell(j);
	                    data[i - 1][j] = cell.getStringCellValue();
	                }
	            }
	        } catch (Exception e) {
	            System.out.println("The exception is: " + e.getMessage());
	        }
	        return data;
	    }*/
	}

		



