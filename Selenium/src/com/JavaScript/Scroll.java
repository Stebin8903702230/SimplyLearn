package com.JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	static WebDriver driver;
	static JavascriptExecutor js;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	public static void Scrol() {
		
	js = (JavascriptExecutor) driver;
	
	js.executeScript("document.getElementById('twotabsearchtextbox').value = 'Electronics'");	// Input using Java Script
	System.out.println("Search Electronics");
//	js.executeScript("document.getElementById('nav-search-submit-button'.click()");
	}
	
	public static void move() throws InterruptedException {
		  driver.navigate().to("https://www.tutorialspoint.com/index.htm");
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // identify element
	      WebElement l=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
	      // Javascript executor
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
	      Thread.sleep(800);	
	
	js.executeScript("window.scrollBy(0,1000)");			// Scroll down
	Thread.sleep(3000);
	
	js.executeScript("window.scrollBy(0,-1000)");			// Scroll up
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(200, 0)");			// Scroll left
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(-200, 0)");			// Scroll right
	Thread.sleep(2000);
	
//	js.executeScript("arguments[0], scrollIntoView()");		// Scroll into view
//	Thread.sleep(2000);

	js.executeScript("window.scrollBy(0,350)");				// Scroll down
	
	driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		Scrol();
		move();
	}
}
