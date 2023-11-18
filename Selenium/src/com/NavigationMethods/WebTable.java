package com.NavigationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	static WebDriver driver;
	static JavascriptExecutor js;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
	}
	
	
	public static void read_SingleText_FromTable() {
		WebElement find_Yash_mailID = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]/td[3]"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", find_Yash_mailID );
		
		String textName = find_Yash_mailID.getText();
		System.out.println(textName);
		System.out.println();
	}
	
	public static void read_AllData_fromTable() {
		WebElement find_TableID = driver.findElement(By.id("simpletable"));
		String All_text = find_TableID.getText();
		System.out.println(All_text);
		System.out.println();
	}
	
	public static void read_SelectedRow_fromTable() {
		WebElement find_Eclair_Element = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/tr[3]"));
		js.executeScript("arguments[0].scrollIntoView(true);", find_Eclair_Element );
		
		String DataFromRow = find_Eclair_Element.getText();
		System.out.println(DataFromRow);
	}
	
	public static void main(String[] args) {
		launchBrowser();
		read_SingleText_FromTable();
		read_AllData_fromTable();
		read_SelectedRow_fromTable();
		driver.close();
	}
	
}
