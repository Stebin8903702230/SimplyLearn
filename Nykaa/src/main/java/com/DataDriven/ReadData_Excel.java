package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadData_Excel {

	FileInputStream fis;
	XSSFWorkbook workbook;
	static WebDriver driver;
	
// Read Data from Excel
		public void  read_Data() throws IOException {
			File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\Excel\\DataDrivenTest.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("ManualInputSheet");
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			System.out.println(cell);
		}
		/*
// Input Data to Excel
		public void  input_Data() throws IOException {
			File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\Excel\\DataDrivenTest.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			
			XSSFSheet newsheet = workbook.createSheet("JavaGnSheet");
					
			XSSFRow row2 = newsheet.createRow(0);
			XSSFCell cell2 = row2.createCell(0);
			cell2.setCellValue("Username");
			
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);
			workbook.close();
			System.out.println("Generated");
		}
		
//Collecting  ExcelData to WebBrowser through Selenium		
		public void  Excel_To_WebData() throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("Browser Launched");
			File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\Excel\\DataDrivenTest.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);	
			
			XSSFSheet sheet = workbook.getSheet("ManualInputSheet");
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			
			driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			XSSFRow row2 = sheet.getRow(0);
			XSSFCell cell2 = row.getCell(0);
			driver.findElement(By.id("pass")).sendKeys(cell2.getStringCellValue());
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.findElement(By.name("login")).click();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
// Collecting Data from WebBrowser to Excel
		public void  WebData_To_Excel() throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println("Browser Launched");
			
			String Webtitle = driver.getTitle();
			String currentUrl = driver.getCurrentUrl();
			
			File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\Excel\\DataDrivenTest.xlsx");
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);	
			System.out.println("Ok");
			XSSFSheet newsheet = workbook.createSheet("JavaGnSheet2");
			
			XSSFRow row2 = newsheet.createRow(0);
			XSSFCell cell2 = row2.createCell(0);
			cell2.setCellValue(Webtitle);
			
			XSSFRow row3 = newsheet.getRow(0);
			XSSFCell cell3 = row3.createCell(1);
			cell3.setCellValue(currentUrl);
			
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);
			workbook.close();
			System.out.println("Generated");
			driver.quit();
		}
		
// Read Multiple Data from Excel
				public void  read_MultipleData() throws IOException {
					File file = new File("C:\\Users\\Public\\Jdk\\Nykaa\\Excel\\DataDrivenTest.xlsx");
					fis = new FileInputStream(file);
					workbook = new XSSFWorkbook(fis);
					XSSFSheet sheet = workbook.getSheet("ManualInputSheet");

					int row = sheet.getLastRowNum();
					int cell = sheet.getRow(row).getLastCellNum();
					System.out.println(cell);
					
					for (int r = 0; r<=row; r++) {
						XSSFRow row2 = sheet.getRow(r);
						for (int c= 0; c<cell; c++) {
							XSSFCell cell2 = row2.getCell(c);
							
							switch (cell2.getCellType()) {
							case STRING: System.out.print(cell2.getStringCellValue());
							break;
							case NUMERIC: System.out.print(cell2.getNumericCellValue());
							break;
							}
							System.out.print("\t\t");
						}
						System.out.println("\t\t");
					}
				}				*/
		public static void main (String [] args) throws IOException {
			
			ReadData_Excel Excel = new ReadData_Excel();
			Excel.read_Data();
//			Excel.input_Data();
//			Excel.Excel_To_WebData();
//			Excel.read_MultipleData();
//			Excel.WebData_To_Excel();
			
		}
	
}
