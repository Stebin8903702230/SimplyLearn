package com.FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
		static Actions a;
		static WebDriver driver;
		public static void launch_Browser(String Browsername) {
			if (Browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");			
			}
			else if (Browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.amazon.com/");	
			}
			else if (Browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.amazon.com/");	
			}
			else if (Browsername.equalsIgnoreCase("gecko")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");	
			}
		}
		
		public static void Search_Mobiles(WebElement find_search_box, WebElement Element_To_Search ) {

			find_search_box.click();
			find_search_box.sendKeys("Mobiles");
			Element_To_Search.click();
		}
		
			
		
		public static void main(String[] args) {
			
			launch_Browser("chrome");
			
			
			a = new Actions(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement find_search_box = driver.findElement(By.id("twotabsearchtextbox"));
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOf(find_search_box));

			WebElement find_Search_Submit_btn = driver.findElement(By.id("nav-search-submit-button"));
			Search_Mobiles(find_search_box, find_Search_Submit_btn);
			
			driver.quit();
		}
}
