package com.Select_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleMultipleDropdown {
	
	static WebDriver driver;
	static JavascriptExecutor js;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	}
	
	public static void Single_Dropdown() {
		WebElement AllSearch_Dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(AllSearch_Dropdown);
		s.selectByValue("search-alias=mobile-apps");
	}
	
	public static void Singledropdown() {
		
		driver.navigate().to("https://demoqa.com/select-menu");
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		
		WebElement SingleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));
		Select SSD = new Select(SingleSelectDropdown);
		
		SSD.selectByIndex(3);
		
//		SSD.selectByValue("Purple");
//		SSD.selectByVisibleText("Black");
		System.out.println(SSD.isMultiple());
	}
	
	
	public static void Multiple_Dropdown() throws InterruptedException {
		
		WebElement l=driver.findElement(By.xpath("//*[text()='Multiselect drop down']"));
	      // Javascript executor
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

	      
		WebElement MultipleSelectDropdown = driver.findElement(By.xpath("//div[text()='Select...']"));
		MultipleSelectDropdown.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(MultipleSelectDropdown));
		
		WebElement Click_Black = driver.findElement(By.xpath("//div[text()='Black']"));
		Click_Black.click();
		
		WebElement Click_Blue = driver.findElement(By.xpath("//div[text()='Blue']"));
		Click_Blue.click();
		
		WebElement Click_Green = driver.findElement(By.xpath("//div[text()='Green']"));
		Click_Green.click();
		
		WebElement Click_Red = driver.findElement(By.xpath("//div[text()='Red']"));
		Click_Red.click();
		
		Thread.sleep(5000);
		
//		Select MSD = new Select(MultipleSelectDropdown);
//		MSD.selectByIndex(1);
//		MSD.selectByValue("Black");
//		MSD.selectByVisibleText("Red");
//		System.out.println(MSD.isMultiple());
//		MSD.selectByValue("Green");
//		MSD.deselectByIndex(1);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
//		Single_Dropdown();
//		Singledropdown();
		Multiple_Dropdown();
		
	}
}
