package com.Base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	protected static WebDriver driver;
	
	  public static void click(WebElement element) {	
			element.click();

		}
		 
		 public static void clear(WebElement element) {	
				element.clear();
		 }
				
		 public static void typeData(WebElement element, String Value) {
			element.sendKeys(Value);

		}
		 ////////////////////////////
		 
		 public  static void waits(WebElement element) {	
		
		 WebDriverWait ww = new WebDriverWait(driver, 30);
		ww.until(ExpectedConditions.visibilityOf(element));
		 
		 }
	     
		 ///////////////
		 
		 
		 
			public static void urlLoader() throws Throwable {
				
				Thread.sleep(3000);
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();

			}
			
			
		 
	////////////////Drop Down Base//////////////////
			
	public static void select_string(WebElement element, String Value) {
	Select s = new Select(element);
	s.selectByValue(Value);
	}


	public static void select_index(WebElement element, int Value) {
	Select s = new Select(element);
	s.selectByIndex(Value);	
	}


	public static void select_text(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}


	public static void select_deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public static String select_FirstOption(WebElement element) {
		Select s = new Select(element);
		 s.getFirstSelectedOption();
	//	System.out.println(asd);
		return null;
	}

//////////	    Excel    COde   ///////////////////////
	public static String getExcelDataUrl(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//LoginTestData_Mohan2222.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
		return data;
	}



	public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 String data = row.getCell(colNum).getStringCellValue();
	 wb.close();
		return data;
	}


	public static int getExcelRandomRowNum(String sheetName) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Random rand = new Random();
	 int rowNum = rand.nextInt(sh.getLastRowNum());
	 return rowNum;
	}
	public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Data//testFile.xlsx");
		wb.write(fos);
		wb.close();
	}



	public static void setExcelDataUrl(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Data//testFile.xlsx");
		wb.write(fos);
		wb.close();
	}



	public static int getRowCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 int rowIndex = wb.getSheet(sheetName).getLastRowNum();
	 return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,String data) throws Throwable{
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet(sheetName);
	 Row row = sh.getRow(rowNum);
	 Cell cel = row.createCell(colNum);
	 cel.setCellValue(data);
	 FileOutputStream fos = new FileOutputStream(".//Data//testFile.xlsx");
		wb.write(fos);
		wb.close();

	}


	public static int getCellCount(String sheetName) throws Throwable {
		FileInputStream fis = new FileInputStream(".//Data//testFile.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row row = sh.getRow(0);
	int cell = row.getLastCellNum();
	return cell;
	}

	
	
	//////////////////////
	
	@BeforeSuite
	public void startUp() {
		
		
		System.setProperty("webdriver.chrome.driver", ".//Folder//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();

	}
	

	
}
