package com.Select_Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class test {
	
	static WebDriver driver;
	static JavascriptExecutor js;
			
			public static void launchBrowser() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
				driver.manage().window().maximize();
			}
			
			public static void select_click() throws InterruptedException {
				  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			      // identify element
			      WebElement l=driver.findElement(By.xpath("//*[text()='Multiselect with label']"));
			      // Javascript executor
			      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
			      Thread.sleep(800);
					
			      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//				WebElement single_click = driver.findElement(By.xpath("//div[@id='select-wrapper-326570']"));
				WebElement find_dropdown = driver.findElement(By.xpath("//div[@class='form-outline']"));
				WebElement select_dropdown = find_dropdown.findElement(By.xpath("//select[@class='select select-initialized']"));
				System.out.println("done");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				WebDriverWait wait = new WebDriverWait();
			
				Actions a = new Actions(driver);
				a.click(select_dropdown).build().perform();
				
				select_dropdown.click();
				select_dropdown.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
				
//				Select s = new Select(select_dropdown);
//				List<WebElement> options = s.getOptions();
//				for (option : options) {
//					System.out.println(s.getAllSelectedOptions());
//				}
				
//				s.selectByVisibleText("Two");
//				System.out.println("ok");
//				s.selectByVisibleText("Green");
//				s.selectByVisibleText("Blue");
//				System.out.println("ok");
//				WebElement Colour_g = driver.findElement(By.xpath("//div[text()='Blue']"));
//				Colour_g.click();
//				Colour_g.isSelected();
//				
				
			
				System.out.println("done");
				}
			
			public static void main(String[] args) throws InterruptedException {
				launchBrowser();
				select_click();
			}
	
	
}
