package com.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class O2_Product_Page {
	
	WebElement find_mombaby_elmt;
	WebElement find_Baby_Powder_elmt;
	WebDriver driver;
	
		public O2_Product_Page(WebElement find_mombaby_elmt, WebElement find_Baby_Powder_elmt) {
			find_mombaby_elmt = driver.findElement(By.xpath("//a[text()='mom & baby']"));

		
			find_Baby_Powder_elmt = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
			
		}
		
		public O2_Product_Page() {
			WebElement Find_AllProducts = driver.findElement(By.xpath("//div[text()='All Products']"));
			Find_AllProducts.click();
		}
		
		
		public static void main(String[] args) {
			
		}
}
