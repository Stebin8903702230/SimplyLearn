package com.Project_TestNG;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends BaseMethods{
	
	public PageObjectManager() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElements WebElements() {
		WebElements WebElemnts = new WebElements();
		return WebElemnts;
	}
}
