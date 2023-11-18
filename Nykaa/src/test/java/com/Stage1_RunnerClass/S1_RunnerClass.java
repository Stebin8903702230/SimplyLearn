package com.Stage1_RunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Stage1_BaseClass.S1_BaseClass;

public class S1_RunnerClass extends S1_BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		S1_RunnerClass S1 = new S1_RunnerClass();
		S1.getDriver("chrome");
		S1.getUrl("https://www.nykaa.com/");
		System.out.println("Browser Launched");
		
		WebElement get_signIn_btn = getDriver().findElement(By.xpath("//button[text()='Sign in']"));
		S1.Click(get_signIn_btn);
		
		WebElement SignMobile_btn = getDriver().findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		S1.Click(SignMobile_btn);
		
		S1.Wait_ImplicitWait();
		
		WebElement MbInputBox = getDriver().findElement(By.name("emailMobile"));
		S1.Click(MbInputBox);
		S1.sendKeys(MbInputBox, "8903702230");
		
		WebElement ProceedBtn = getDriver().findElement(By.id("submitVerification"));
		S1.Click(ProceedBtn);
		
		WebElement otpField = getDriver().findElement(By.id("otpField"));
		S1.Click(otpField);
		
		Thread.sleep(10000);
		
		WebElement verifyBtn = getDriver().findElement(By.xpath("//button[text()='verify']"));
		S1.Click(verifyBtn);
		
		Thread.sleep(2000);
		S1.Quit();

	}

	
}
