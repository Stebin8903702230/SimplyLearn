package com.Select_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoQA {

	static WebDriver driver;
	static JavascriptExecutor js;
			
			public static void launchBrowser() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://demoqa.com/select-menu");
				driver.manage().window().maximize();
			}
			
			public static void select_click() throws InterruptedException {
				  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			      // identify element
			      WebElement l=driver.findElement(By.xpath("//*[text()='Old Style Select Menu']"));
			      // Javascript executor
			      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
			      Thread.sleep(800);
					
			      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				WebElement find_dropdown = driver.findElement(By.id("oldSelectMenu"));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				find_dropdown.click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				System.out.println("sd");
				
				
				find_dropdown.sendKeys(Keys.ARROW_DOWN , Keys.ENTER);
				
				Thread.sleep(2000);
//				WebElement find_Select= driver.findElement(By.xpath("//div[@class=' css-1hwfws3'][3]"));
//				find_Select.click();
//				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				find_Select.sendKeys(Keys.DOWN,Keys.ENTER);
//				WebElement select_dropdown = find_dropdown.findElement(By.xpath("//select[@class='select select-initialized']"));
				System.out.println("done");
				
			}
			
			public static void main(String[] args) throws InterruptedException {
				launchBrowser();
				select_click();
				driver.close();
			}
			
}