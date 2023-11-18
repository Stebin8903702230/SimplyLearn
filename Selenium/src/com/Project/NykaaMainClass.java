package com.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NykaaMainClass extends Nykaa {
				
			
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		launch_Browser();
		mouseAct = new Actions(driver);
		keyBrd = new Robot();
		wait = new WebDriverWait(driver,30);
		js = (JavascriptExecutor) driver;
		
//		WebElement find_mombaby_elmt = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']"));
		WebElement find_mombaby_elmt = driver.findElement(By.xpath("//a[text()='mom & baby']"));
		WebElement find_Baby_Powder_elmt = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
		mom_Baby_menu(find_mombaby_elmt, find_Baby_Powder_elmt);
		
		String First_Tab_id = driver.getWindowHandle();
		SwitchToTab2("First_Tab_id");
		
		WebElement Find_AllProducts = driver.findElement(By.xpath("//div[text()='All Products']"));
		scroll(Find_AllProducts);
		
		WebElement find_first_Product = driver.findElement(By.className("css-1rd7vky"));
		ProductSelect(find_first_Product);
		
		String Second_Tab_ID = driver.getWindowHandle();
		SwitchToTab3("Second_Tab_ID");
		
		WebElement find_Dropdown_arrow_elemt = driver.findElement(By.className("css-2t5nwu"));
		Weight_Dropdown(find_Dropdown_arrow_elemt);
		
		WebElement find_Add_to_bag = driver.findElement(By.xpath("//div[@Class='css-vp18r8']"));
		addTo_Bag(find_Add_to_bag);
		
//		WebElement bag_btn = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
//		WebElement bag_btn = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		WebElement bag_btn = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
		WebElement find_iframe = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		WebElement find_qty_arrow_elmt = driver.findElement(By.xpath("//span[@class='css-1aowomc ehes2bo0']//img[@class='css-g7xef ek8d9s80']"));
		WebElement find_Select_3_btn = driver.findElement(By.xpath("//div[@label='3']//div[@class='css-bfwsku']"));
		WebElement find_proceed_btn = driver.findElement(By.xpath("//span[text()='Proceed']"));
		Bag(bag_btn,find_iframe,find_qty_arrow_elmt,find_Select_3_btn, find_proceed_btn);
		
		WebElement find_Guest_btn = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
		WebElement find_pincode_box = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
		WebElement Find_Address_box = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		WebElement find_Address_box2= driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
		guest_Login(find_Guest_btn, find_pincode_box, Find_Address_box, find_Address_box2);
		
		WebElement find_contact = driver.findElement(By.xpath("//p[text()='Contact']"));
		WebElement find_name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		WebElement find_phone_box = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
		WebElement find_email_box = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
		WebElement find_ShipAddress_btn = driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
		contactAddress(find_contact, find_name, find_phone_box,find_email_box, find_ShipAddress_btn);
		
		WebElement find_Mastercard = driver.findElement(By.xpath("//p[text()='Visa, Mastercard, Rupay & more']"));
		WebElement find_cardNo_box = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
		WebElement find_year = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
		WebElement find_CVV = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		WebElement find_Pay_btn = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
		bill_Payment(find_Mastercard, find_cardNo_box, find_year, find_CVV, find_Pay_btn);
		
		Screenshot();
		
		WebElement close_btn = driver.findElement(By.xpath("//button[@class='css-1iwzqhf emgaj5l0']"));
		WebElement Bag_Dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span[2]/img"));
		WebElement Bag_Edit_btn = driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']"));
		WebElement Bag_Remove_btn = driver.findElement(By.xpath("//div[@data-test-id='product-remove']//span[@class='css-175whwo ehes2bo0']"));
		WebElement Yes_btn = driver.findElement(By.xpath("//button[text()='Yes']"));

		remove_from_Bag(close_btn, Bag_Dropdown, Bag_Edit_btn, Bag_Remove_btn, Yes_btn);
//		driver.close();
	}
}
