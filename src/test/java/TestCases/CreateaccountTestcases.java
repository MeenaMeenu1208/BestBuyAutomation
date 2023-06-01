package TestCases;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import BaseClass.BaseClass;
import Pages.CreateAccountPages;


public class CreateaccountTestcases extends BaseClass{
	
	@Test(dataProvider = "dataReader")
	public void CreateaccNegativeTestcases(String fname,String lname, String eml, String pw, String repw, String ph) throws Exception {
		CreateAccountPages page = new CreateAccountPages();
		page.createAcc(fname, lname, eml, pw, repw, ph );
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Best Buy | Official Online Store | Shop Now & Save");
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
            XSSFSheet sheet = workbook.getSheet("Sheet1");
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
	