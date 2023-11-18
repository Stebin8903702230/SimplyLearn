package com.NavigationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationMethods {

		static WebDriver driver;
		
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
		
		public static void navigationMethods() throws InterruptedException  {
			
			driver.navigate().to("https://www.amazon.in/");
			String title = driver.getTitle();				
			System.out.println(title);
			String currentUrl = driver.getCurrentUrl();			
			System.out.println(currentUrl);
			Thread.sleep(2000);
			
			driver.navigate().back();
			String currentUrl1 = driver.getCurrentUrl();
			System.out.println(currentUrl1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			Thread.sleep(2000);
						
			driver.navigate().forward();
			String currentUrl2 = driver.getCurrentUrl();
			System.out.println(currentUrl2);
			String title2 = driver.getTitle();
			System.out.println(title2);
			Thread.sleep(2000);
						
			driver.navigate().refresh();
			String currentUrl3 = driver.getCurrentUrl();
			System.out.println(currentUrl3);
			Thread.sleep(2000);
			
			driver.close();
			 
		}
		
		
		public static void main (String[] args ) throws InterruptedException  {
			launchBrowser();
			navigationMethods();
		}
}
