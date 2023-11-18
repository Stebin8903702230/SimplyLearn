package com.Nykaa_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Implements{
	
	WebDriver driver;
		
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement SignIn_btn;
	
	
	@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
	private WebElement SignMobile_btn;

	
	public Login_Implements(WebDriver driver2) {
		driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	public WebElement getSignMobile_btn() {
		return SignMobile_btn;
	}
}
