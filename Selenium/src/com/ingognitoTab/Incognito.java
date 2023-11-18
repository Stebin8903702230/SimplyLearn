package com.ingognitoTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {
			
				public static void launchBrowser() {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
					ChromeOptions ch = new ChromeOptions();
					ch.addArguments("Incognito");
					ch.addArguments("start-maximized");
					WebDriver driver = new ChromeDriver(ch);
					driver.get("https://www.google.com/");
				}
				
				public static void main(String[] args) {
					launchBrowser();
				}
}
