package com.Stage2_BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Stage1_BaseClass.S1_BaseClass;

public class Login_01Implements extends S1_BaseClass implements Login_01Interface{
	
	public Login_01Implements() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = Xpath_SignIn_btn)
	private WebElement SignIn_btn;
	
	@FindBy(xpath=Xpath_SignMobile_btn)
	private WebElement SignMobile_btn;

	@FindBy(name=Xpath_MbInputBox)
	private WebElement MbInputBox;
	
	@FindBy(id= Xpath_ProceedBtn)
	private WebElement ProceedBtn;
	
	@FindBy(id =Xpath_otpField)
	private WebElement otpField;
	
	@FindBy(xpath = Xpath_verifyBtn)
	private WebElement verifyBtn;

	public WebElement getSignIn_btn() {
		return SignIn_btn;
	}

	public WebElement getSignMobile_btn() {
		return SignMobile_btn;
	}

	public WebElement getProceedBtn() {
		return ProceedBtn;
	}

	public WebElement getOtpField() {
		return otpField;
	}

	public WebElement getVerifyBtn() {
		return verifyBtn;
	}

	public WebElement getMbInputBox() {
		return MbInputBox;
	}
}
