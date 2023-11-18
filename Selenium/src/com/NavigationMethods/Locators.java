package com.NavigationMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	

	static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	public static void locators() {
		WebElement Username = driver.findElement(By.id("email"));
		Username.click();
		
		WebElement Password_entry = driver.findElement(By.name("pass"));
		Password_entry.click();
		
		List<WebElement> all_inputs = driver.findElements(By.className("_6lux"));
		all_inputs.clear();
		
		WebElement Forgotten_password = driver.findElement(By.linkText("Forgotten password?"));
		Forgotten_password.click();

	}
	
	public static void main(String[] args) {
		launchBrowser();
		locators();
	}
	
	
}
