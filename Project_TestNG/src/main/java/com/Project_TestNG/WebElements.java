package com.Project_TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebElements extends BaseMethods implements ElementInterface{
	
	public WebElements(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = Xpath_close_Popup)
	private WebElement close_Popup;
	
	@FindBy(xpath = Xpath_From)
	private WebElement From;
	
	@FindBy(xpath = Xpath_InputFromValue)
	private WebElement InputFromValue;
	
	@FindBy(xpath = Xpath_DropdownValue)
	private WebElement DropdownValue;
	
	@FindBy(xpath = Xpath_To)		//span[text()='To']
	private WebElement To;
	
	@FindBy(xpath = Xpath_InputToValue)
	private WebElement InputToValue;
	
	@FindBy(xpath = Xpath_DropDownValueTo)
	private WebElement DropDownValueTo;
	
	@FindBy(xpath = Xpath_PickDate )
	private WebElement PickDate;
	
	@FindBy(xpath = Xpath_DoneBtn )
	private WebElement DoneBtn;
	
	@FindBy(xpath = Xpath_ClosePopup)
	private WebElement ClosePopup;
	
	@FindBy(xpath = Xpath_DoneDate )
	private WebElement DoneDate;
	
	@FindBy(xpath = Xpath_SearchFlight_btn )
	private WebElement SearchFlight_btn;
	
	public WebElement getClose_Popup() {
		return close_Popup;
	}
	
	public WebElement getClosePopup() {
		return ClosePopup;
	}

	public WebElement getDoneBtn() {
		return DoneBtn;
	}

	public WebElement getPickDate() {
		return PickDate;
	}

	public WebElement getDoneDate() {
		return DoneDate;
	}

	public WebElement getDropDownValueTo() {
		return DropDownValueTo;
	}

	public void setDropDownValueTo(WebElement dropDownValueTo) {
		DropDownValueTo = dropDownValueTo;
	}

	public WebElement getDropdownValue() {
		return DropdownValue;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getInputToValue() {
		return InputToValue;
	}

	public WebElement getInputFromValue() {
		return InputFromValue;
	}

	public WebElement getFrom() {
		return From;
	}
	
	public WebElement getSearchFlight_btn() {
		return SearchFlight_btn;
	}

//	@FindBy(xpath = "/html/body/div/div[3]/div/div/div[1]/div[1]/div/div[1]/p" )				//=/html/body/div/div[3]/div/div/div[1]/div[1]/div/div[1]/p	 ////input[@type='text']
//	private WebElement From_TextBox;
//	
//	@FindBy(xpath = "/html/body/div/div[3]/div/div/div[1]/div[2]/div/div/p" )
//	private WebElement To_TextBox;
//	

	
//	public WebElement getFrom_TextBox() {
//		return From_TextBox;
//	}
//
//	public WebElement getTo_TextBox() {
//		return To_TextBox;
//	}
//
	
	
//	WebElement From_TextBox = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[1]/div[1]/div/div[1]/p"));
//	WebElement To_TextBox = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[1]/div[2]/div/div/p"));
//	WebElement SearchFlight_btn = driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
	
}
