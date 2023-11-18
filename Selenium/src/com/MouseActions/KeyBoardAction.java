package com.MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction {
	
	static WebDriver driver;
	static Robot k;
			public static void launch_Browser() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				System.out.println("Browser Launched");
			}
			
			public static void name() {
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement input_Search = driver.findElement(By.id("APjFqb"));
				input_Search.click();
				input_Search.sendKeys("STEBIN");
				
				WebElement Search_btn = driver.findElement(By.className("gNO89b"));
				Search_btn.click();	
			}

			public static void namebyKeyb() {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement input_Search = driver.findElement(By.id("APjFqb"));
				input_Search.click();
				k.keyPress(KeyEvent.VK_S);
				k.keyRelease(KeyEvent.VK_S);
				k.keyPress(KeyEvent.VK_T);
				k.keyRelease(KeyEvent.VK_T);
				k.keyPress(KeyEvent.VK_E);
				k.keyRelease(KeyEvent.VK_E);
				k.keyPress(KeyEvent.VK_B);
				k.keyRelease(KeyEvent.VK_B);
				k.keyPress(KeyEvent.VK_I);
				k.keyRelease(KeyEvent.VK_I);
				k.keyPress(KeyEvent.VK_N);
				k.keyRelease(KeyEvent.VK_N);
				k.keyPress(KeyEvent.VK_SPACE);
				k.keyRelease(KeyEvent.VK_SPACE);
				k.keyPress(KeyEvent.VK_G);
				k.keyRelease(KeyEvent.VK_G);
				
				WebElement Search_btn = driver.findElement(By.className("gNO89b"));
				Search_btn.click();	
			}
			
			public static void main(String[] args) throws AWTException {
				launch_Browser();
				k = new Robot();
//				name();
				namebyKeyb();
			}
}
