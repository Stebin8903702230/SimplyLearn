package com.iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	static WebDriver driver;
	static JavascriptExecutor js;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
	}
	
	public static void elementInsideFrame() throws InterruptedException {
		WebElement frame_element = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame_element);
		Thread.sleep(2000);
		WebElement frame_text = driver.findElement(By.id("sampleHeading"));
		System.out.println(frame_text.getText());
		driver.switchTo().defaultContent();
	}
	
	public static void nested_Frame() throws InterruptedException {
	/*	js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");			// Scroll down
		Thread.sleep(2000);	
		
		WebElement NestedFrame_text = driver.findElement(By.xpath("//li[@id='item-3']"));
		System.out.println(NestedFrame_text.getText());
		NestedFrame_text.click();	*/
		
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("frame1");
		WebElement find_Parent_Element = driver.findElement(By.tagName("body"));
		System.out.println(find_Parent_Element.getText());
		
		WebElement Child_Frame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(Child_Frame);
		Thread.sleep(2000);
		WebElement Child_text = driver.findElement(By.tagName("p"));
		System.out.println(Child_text.getText());
			
	}
	
	public static void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		elementInsideFrame();
		nested_Frame();
		closeBrowser();
	}
	
	
	
}
