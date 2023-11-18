package com.Nykaa_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch02 {

	static WebDriver driver;
	public static  WebDriver getDriver (String Browser_Name) {
		try {
		if (Browser_Name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (Browser_Name.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Invalid browser name.");
		}
		} catch (Exception e) {
			System.out.println("Browser getting error");
		}
		return driver;
	}
	public static void main(String[] args) {
		BrowserLaunch02 BL = new BrowserLaunch02();
		BL.getDriver("Browser_Name");
	}
}
