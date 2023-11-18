package com.Nykaa;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class O1_Login_Page {
	static Actions mouseAct;
	static Robot keyBrd;
	static WebDriver driver;
	static WebDriverWait wait;
	static JavascriptExecutor js;
	
	public static void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		System.out.println("Browser Launched");
	}
	
	@SuppressWarnings("deprecation")
	public static void Login() {
		
//		WebElement SignIn_btn = driver.findElement(By.xpath("//button[text()='Sign in']"));
//		SignIn_btn.click();
		WebElement SignMobile_btn = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		SignMobile_btn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement MbInputBox = driver.findElement(By.name("emailMobile"));
		MbInputBox.click();
		MbInputBox.sendKeys("8903702230");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ProceedBtn = driver.findElement(By.id("submitVerification"));
		ProceedBtn.click();
		
		WebElement otpField = driver.findElement(By.id("otpField"));
		otpField.click();
	}
	
	public static void Threadsleep() throws InterruptedException {
		Thread.sleep(15000);
		WebElement verifyBtn = driver.findElement(By.xpath("//button[text()='verify']"));
		verifyBtn.click();
		
	}
	
//	public WebElement get_signIn_btn() {
//		@FindBy(xpath = "//button[text()='Sign in']") WebElement SignIn_btn;
//		return SignIn_btn;
//		
//	}
	public O1_Login_Page() {
//		WebElement SignIn_btn = driver.findElement(By.xpath("//button[text() = 'Sign in']"));
//		WebElement SignIn_box = driver.findElement(By.xpath("//button[text() = 'Sign in with Mobile / Email']"));
//		WebElement Enter_mailId_mobile = driver.findElement(By.xpath("//input[@placeholder='Enter Email ID or Phone Number']"));
		PageFactory.initElements(driver, this);
	
//	@FindBy(xpath ="//a[text()='mom & baby']")
//	WebElement find_mombaby_elmtElement;
//	
//	@FindBy(xpath = "//button[text() = 'Sign in']")
//	WebElement SignIn_btn;
//		
//	@FindBy(xpath = "//button[text() = 'Sign in with Mobile / Email']")
//	WebElement SignIn_box;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter Email ID or Phone Number']")
//	WebElement Enter_mailId_mobile;
	}
	
	public static void main(String[] args) throws InterruptedException {
		launch_Browser();
		Login();
		Threadsleep();
		driver.quit();
	}
}
