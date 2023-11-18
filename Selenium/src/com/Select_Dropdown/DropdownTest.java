package com.Select_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	static WebDriver driver;
	static JavascriptExecutor js;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	public static void Single_Dropdown() {
		WebElement AllSearch_Dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(AllSearch_Dropdown);
		s.selectByValue("search-alias=mobile-apps");
		}
	
		public static void Multiple_Dropdown() {
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement MultipleSelectDropdown = driver.findElement(By.xpath("//select[@name='cars']"));
				
		Select MSD = new Select(MultipleSelectDropdown);
		System.out.println(MSD.isMultiple());
		MSD.selectByIndex(2);
		MSD.selectByValue("volvo");
		MSD.selectByVisibleText("Opel");
		
//		List<WebElement> allSelectedOptions = MSD.getAllSelectedOptions();
//			for (WebElement printallSelectedOptions : allSelectedOptions) {
//			System.out.println(printallSelectedOptions);
//			}
		
//		WebElement firstSelectedOption = MSD.getFirstSelectedOption();
//		for (WebElement printfirstSelectedOption : firstSelectedOption) {
//			System.out.println(printfirstSelectedOption);
//			}
				
		List<WebElement> options = MSD.getOptions();
			for (WebElement option : options) {
				System.out.println(option.getAttribute("value"));
			}
		MSD.deselectByIndex(0);
		driver.close();
	}
		
	public static void main(String[] args) {
		launchBrowser();
		Single_Dropdown();
		Multiple_Dropdown();
	}

}
