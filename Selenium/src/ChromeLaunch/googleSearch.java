package ChromeLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleSearch {

			static WebDriver driver;
			public static void launch_Browser() {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/"); 
			}
			
			public static void google_Search() throws InterruptedException {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement input_Search = driver.findElement(By.id("APjFqb"));
				input_Search.click();
				input_Search.sendKeys("java coding interview questions and answers");
				
				WebElement Search_btn = driver.findElement(By.className("gNO89b"));
				Search_btn.click();																			
/*OK			WebElement voice_Search_Btn = driver.findElement(By.className("goxjub"));
				voice_Search_Btn.click();		*/
			}
				
			public static void popUpWindows () {
// MouseAction														
				WebElement SignIn = driver.findElement(By.xpath("//a[@jsname='tf37qf']"));
				Actions a = new Actions(driver);
		//		a.moveToElement(SignIn).build().perform();
				System.out.println("Done");
		//		a.click(SignIn).build().perform();
				
				WebElement SignOut = driver.findElement(By.xpath("//button[text()='Stay signed out']"));
				a.moveToElement(SignOut).build().perform();
				a.click(SignOut).build().perform();													
		 
/*AlertOption		
				Alert alert = driver.switchTo().alert();
				alert.accept();
				System.out.println("OK");
				
				WebDriverWait wait = new WebDriverWait(driver, 30);
		//		wait.until(ExpectedConditions.visibilityOf(Alert_buttton));
				wait.until(ExpectedConditions.visibilityOf(Alert_SignIn));
				
		//		WebElement Alert_buttton = driver.findElement(By.xpath("//div[@class='hXhhq']"));
				WebElement Alert_SignIn = driver.findElement(By.xpath("//a[@jsname='tf37qf']"));
								
				Alert_SignIn.click();
							
		//		Alert_buttton.click();
		 							*/
			}
				
			public static void Main_WebPage_Xpath() {
				
//Original Browser		
				WebElement Input_Entry_btn = driver.findElement(By.xpath("//input[@placeholder='Search Google or type a URL']"));
				Input_Entry_btn.click();
				Input_Entry_btn.sendKeys("Stebin");
				
				WebElement voiceSearchButton = driver.findElement(By.id("voiceSearchButton"));
				voiceSearchButton.click();
			}
			
			public static void main(String[] args) throws InterruptedException {
				launch_Browser();
	//			google_Search();
				popUpWindows();
	//			Main_WebPage_Xpath();
				Thread.sleep(1000);
				driver.close();
			}
		}
