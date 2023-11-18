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

public class GoIbo {
	static Actions a;
	static WebDriver driver;
	public static void launch_Browser(String Browsername) {
		if (Browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gad_source=1&gclid=Cj0KCQiAmNeqBhD4ARIsADsYfTc4UyN0_scH5GqcHAQDU-oS7uzQJbzngskFq_mhQeMEWdsG-iHeYOMaAmUNEALw_wcB");			
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
	
		public static void main(String[] args) {
		
		launch_Browser("chrome");
		
		
		a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement From_TextBox = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[1]/div[1]/div/div[1]/p"));
		WebElement To_TextBox = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[1]/div[2]/div/div/p"));
		WebElement SearchFlight_btn = driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
		
		From_TextBox.click();
		From_TextBox.sendKeys("Chennai");
		To_TextBox.click();
		To_TextBox.sendKeys("Madurai");
		SearchFlight_btn.click();
		driver.quit();
	}
}

