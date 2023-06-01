package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.PaymentPage;

public class paymentmoduleTestCases extends BaseClass {

	@Test(dataProvider = "dataReader")
	public void paymentTestcase(String cardNum,String exMonth, String exYear,String cvvcode, String fstname, String lstname, String Addres, String cty,String stat, String zip) throws Exception {
		PaymentPage page = new PaymentPage();
		page.ContinueasGuest();
		System.out.println(driver.getTitle());
		page.paymentInfo(cardNum,exMonth, exYear, cvvcode, fstname, lstname, Addres,  cty, stat, zip);
	}
	@DataProvider(name = "dataReader")
    public Object[][] excelDataProvider() throws IOException {
		File fileName =new File("E:\\\\Meena\\\\Workspace\\\\workspace\\\\BestBuy\\\\excelFiles\\\\loginData.xlsx");
        Object[][] arrObj = getExcelData("E:\\Meena\\Workspace\\workspace\\BestBuy\\excelFiles\\loginData.xlsx","Details");
        
        return arrObj;
        }
 
    
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        try {
        	File f =new File("E:\\\\Meena\\\\Workspace\\\\workspace\\\\BestBuy\\\\excelFiles\\\\loginData.xlsx");
            FileInputStream fis = new FileInputStream(f);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("Sheet4");
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
    }
}
