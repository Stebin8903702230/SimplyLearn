package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTypesMethods {

		static WebDriver driver;
		static JavascriptExecutor js;
		
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
//			driver.manage().window().maximize();
		}
		
		public static void simple_Alert() throws InterruptedException {
			WebElement Simple_Alert_btn = driver.findElement(By.id("alertButton"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(Simple_Alert_btn));
			Simple_Alert_btn.click();
			
			Alert Simple_alert = driver.switchTo().alert();
			Thread.sleep(2000);
			Simple_alert.accept();
			System.out.println("Simple alert accept(OK)");
		}
		
		public static void confirmAlert() throws InterruptedException {
			WebElement Confirm_Alert_btn = driver.findElement(By.id("confirmButton"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			Confirm_Alert_btn.click();
			Alert Confirm_alert = driver.switchTo().alert();
			Thread.sleep(100);
			Confirm_alert.dismiss();
			System.out.println("Confirm alert dismiss(cancel)");
		}
		
		public static void main(String[] args) throws InterruptedException {
			launchBrowser();
			simple_Alert();
			confirmAlert();
			driver.quit();
		}
}
