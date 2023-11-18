package com.NavigationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethod {

		static WebDriver driver;
		static JavascriptExecutor js;
		
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
		
		public static void WebElementMeth () {
			driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
			WebElement Username = driver.findElement(By.name("firstname"));
			Username.click();
			Username.sendKeys("stebin");
			
			WebElement Lastname = driver.findElement(By.name("lastname"));
			Lastname.click();
			Lastname.sendKeys("G");
			
			WebElement Username2 = driver.findElement(By.name("firstname"));
			Username2.clear();
			
			WebElement DOB = driver.findElement(By.xpath("//div[text() = 'Date of birth']"));
//			DOB.isDisplayed();
			System.out.println(DOB.isDisplayed());
			System.out.println(DOB.getText());
			
			WebElement Password = driver.findElement(By.id("password_step_input"));
			Password.click();
		}
			
			public static void select() throws InterruptedException {
							
			WebElement DOBmonth = driver.findElement(By.id("month"));
			DOBmonth.click();
			Select s = new Select(DOBmonth);
			s.selectByIndex(4);
			
			Thread.sleep(3000);
			System.out.println(DOBmonth.isEnabled());
			System.out.println(DOBmonth.isSelected());
			System.out.println(DOBmonth.getText());
				
		}
			public static void WebElement() {
				driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
				org.openqa.selenium.WebElement SignUpElement = driver.findElement(By.name("websubmit"));
				String display = SignUpElement.getCssValue("display");
				String position = SignUpElement.getCssValue("position");
				String verticalalign = SignUpElement.getCssValue("vertical-align");
				
				System.out.println(display);
				System.out.println(position);
				System.out.println(verticalalign);
			}
		
		public static void main(String[] args) throws InterruptedException {
			launchBrowser();
			WebElement();
//			WebElementMeth();
//			select();
//			driver.quit();
		}
}
