package com.Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	static WebDriver driver;

	// Selection of Browser			
	public void chrome() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//	}
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.nykaa.com/");
}

	public static void main(String[] args) {
		BrowserLaunch BL = new BrowserLaunch();
		BL.chrome();
//		getDriver("Chrome");
		driver.close();
		
	}
	
	
	
}
