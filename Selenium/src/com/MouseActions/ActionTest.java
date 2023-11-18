package com.MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	static WebDriver driver;
	static Actions a;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		System.out.println("Browser Launched");
	}
	
	public static void mouse_Click() throws InterruptedException {
		WebElement Best_Sellers_btn = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		a = new Actions(driver);
		
		a.click(Best_Sellers_btn).build().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Mouse action = Click done");
	}
	
	public static void mouse_DoubleClick() {
		WebElement Todays_deal_btn = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
		a.doubleClick(Todays_deal_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Mouse action = Double Click done");
		driver.navigate().back();
	}
	
	public static void mouse_RightClick() {
		WebElement Best_Sellers_btn = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		a.contextClick(Best_Sellers_btn).build().perform();
		System.out.println("Mouse action = RightClick done");
	}
	
	public static void mouse_Hover() {
		WebElement SignIn_btn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(SignIn_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Mouse action = Mouse Hover");
	}
	
	public static void mouse_Drag_and_Drop() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(2000);
		WebElement Drag_Element = driver.findElement(By.id("draggable"));
		WebElement To_Drop_Element = driver.findElement(By.id("droppable"));
		a.dragAndDrop(Drag_Element, To_Drop_Element).build().perform();
		Thread.sleep(3000);
		System.out.println("Mouse action = Element Drag and Drop");
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		mouse_Click();
		mouse_DoubleClick();
		mouse_RightClick();
		mouse_Hover();
		mouse_Drag_and_Drop();
		driver.quit();
	}
}
