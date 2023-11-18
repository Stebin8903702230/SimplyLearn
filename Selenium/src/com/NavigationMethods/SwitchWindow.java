package com.NavigationMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow {
	static Actions mouseAct;
	static WebDriver driver;
	static WebDriverWait wait;
	static JavascriptExecutor js;

	
	
	public static void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.nykaa.com/");
		driver.get("https://www.nykaa.com/himalaya-baby-care-baby-powder/p/6023?productId=6023&pps=1&skuId=4791");
		System.out.println("Browser Launched");
	}
	
	public static void mom_Baby_menu () throws InterruptedException {
		
		WebElement find_mombaby_elmt = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']"));
		mouseAct.moveToElement(find_mombaby_elmt).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(5000);

		System.out.println("ok");
		WebElement find_Baby_Powder_elmt = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
		mouseAct.moveToElement(find_Baby_Powder_elmt).build().perform();
		
		mouseAct.click(find_Baby_Powder_elmt).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("sub menu");
		
		WebElement bag_btn = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
		bag_btn.click();
	}
	
	public static void SwitchToTab2() {
		String First_Tab_id = driver.getWindowHandle();
		System.out.println(First_Tab_id);
		
		Set<String> AllTabId = driver.getWindowHandles();				
			for(String tabs: AllTabId) {
				System.out.println(tabs);
			}
			
			for(String Second_Tab_ID: AllTabId) {
				if(!First_Tab_id.equals(Second_Tab_ID)) {
					driver.switchTo().window(Second_Tab_ID);
				}
			}
	}
	
}
