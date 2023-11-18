package com.Nykaa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFn_POM {
	
		
		
		@FindBy(xpath = "//button[text()='Sign in']")
		private WebElement SignIn_btn;
		
		public WebElement get_signIn_btn() {
			
			return SignIn_btn;
			
		}
		
//		WebElement SignMobile_btn = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		@FindBy(xpath="//button[text()='Sign in with Mobile / Email']")
		private WebElement SignMobile_btn;

		public WebElement getSignIn_btn() {
			return SignIn_btn;
		}

		public WebElement getSignMobile_btn() {
			return SignMobile_btn;
		}
		
			
	//	public WebElement SignMobile_btn() {
	//		return SignIn_btn;
		
		
		
}
