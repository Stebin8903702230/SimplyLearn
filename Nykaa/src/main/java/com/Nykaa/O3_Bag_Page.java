package com.Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class O3_Bag_Page {
	
	WebDriver driver;
		public O3_Bag_Page() {
			PageFactory.initElements(driver, this);
		}
	
//		WebElement bag_btn = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
		@FindBy(xpath = "//div[@class='css-0 e1ewpqpu1']")
		WebElement bag_btn;
		
		@FindBy(xpath = ("//iframe[@class='css-acpm4k']"))
		WebElement find_iframe ;
		
		@FindBy(xpath = "//span[@class='css-1aowomc ehes2bo0']//img[@class='css-g7xef ek8d9s80']")
		WebElement find_qty_arrow_elmt;
		
		@FindBy(xpath = "//div[@label='3']//div[@class='css-bfwsku']")
		WebElement find_Select_3_btn;
		
		@FindBy(xpath = "//span[text()='Proceed']")
		WebElement find_proceed_btn;
		
		public static void main(String[] args) {
			O3_Bag_Page ref = new O3_Bag_Page();
			ref.bag_btn.click();
			
		}
}
