package com.Project;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	static Actions mouseAct;
	static Robot keyBrd;
	static WebDriver driver;
	static WebDriverWait wait;
	static JavascriptExecutor js;

//Open Web Browser			
	public static void launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		System.out.println("Browser Launched");
	}
	
//Menu: Mom & Baby
	public static void mom_Baby_menu (WebElement find_mombaby_elmt, WebElement find_Baby_Powder_elmt) {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(find_mombaby_elmt));
		mouseAct.moveToElement(find_mombaby_elmt).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Menu: Mom & Baby");
//Sub-menu: Baby powder
		mouseAct.moveToElement(find_Baby_Powder_elmt).build().perform();
		mouseAct.click(find_Baby_Powder_elmt).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Sub-menu: Baby powder");
	}
	
//Window: switch to tab2
	public static void SwitchToTab2(String First_Tab_id) {
	
		Set<String> AllTabId = driver.getWindowHandles();				
			
			for(String Second_Tab_ID: AllTabId) {
				if(!First_Tab_id.equals(Second_Tab_ID)) {
					driver.switchTo().window(Second_Tab_ID);
				}
			}
		System.out.println("Switched to Tab2");
	}
	
//Scroll to products
	public static void scroll(WebElement Find_AllProducts) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("arguments[0].scrollIntoView(true);", Find_AllProducts);			
		System.out.println("Scroll to All Products");
	}

//Selecting first product
	public static void ProductSelect(WebElement find_first_Product) {
		wait.until(ExpectedConditions.visibilityOf(find_first_Product));
		mouseAct.click(find_first_Product).build().perform();
		System.out.println("Selected first product");
	}
	
//Switch to Tab3				
	public static void SwitchToTab3(String Second_Tab_ID) {
		
		Set<String> AllTabId = driver.getWindowHandles();				
			
			for(String Third_Tab: AllTabId) {
				if(!Second_Tab_ID.equals(Third_Tab)) {
					driver.switchTo().window(Third_Tab);
				}
			}
		System.out.println("Switched to Tab3");
	}
	
//Customize product
	public static void Weight_Dropdown(WebElement find_Dropdown_arrow_elemt) {
		find_Dropdown_arrow_elemt.click();
		
		Select selct = new Select(find_Dropdown_arrow_elemt);
		selct.selectByValue("0");
		
		find_Dropdown_arrow_elemt.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", find_Dropdown_arrow_elemt);	
		System.out.println("Product customized to 100g");
	}
	
//Add to Bag
	public static void addTo_Bag(WebElement find_Add_to_bag) {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(find_Add_to_bag));
		mouseAct.click(find_Add_to_bag).build().perform();
		System.out.println("Added to bag");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
//Bag- Product Quantity
	public static void Bag(WebElement bag_btn, WebElement find_iframe, WebElement find_qty_arrow_elmt, WebElement find_Select_3_btn, WebElement find_proceed_btn) {
		wait.until(ExpectedConditions.visibilityOf(bag_btn));
		bag_btn.click();
//		mouseAct.moveToElement(bag_btn).build().perform();
//		mouseAct.click(bag_btn).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(find_iframe);
		find_qty_arrow_elmt.click();
		find_Select_3_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(find_proceed_btn));
		find_proceed_btn.click();
		System.out.println("Select product qty to 3");
	}
	
//Guest login (entry)
	public static void guest_Login(WebElement find_Guest_btn, WebElement find_pincode_box, WebElement Find_Address_box, WebElement find_Address_box2) {
		find_Guest_btn.click();
		
		find_pincode_box.click();
		find_pincode_box.sendKeys("629173");
		
		Find_Address_box.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Find_Address_box.sendKeys("20/20 South Side");
		
		find_Address_box2.click();
		find_Address_box2.sendKeys("Fountain View, Green Street.");
		System.out.println("Guest login (Entry)");					
	}
	
//Guest Contact details - (entry)
	public static void contactAddress(WebElement find_contact, WebElement find_name, WebElement find_phone_box, WebElement find_email_box, WebElement find_ShipAddress_btn) {
		
		js.executeScript("arguments[0].scrollIntoView(true);", find_contact);
		
		find_name.click();
		find_name.sendKeys("Stebin");
		
		find_phone_box.click();
		find_phone_box.sendKeys("8903702230");
		
		js.executeScript("window.scrollBy(0,500)");			// Scroll down
		mouseAct.click(find_email_box).sendKeys(find_email_box, "stebinji@gmail.com").build().perform();
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(find_ShipAddress_btn));
		find_ShipAddress_btn.click();
		System.out.println("Guest contact details (Entry)");
	}

//Bill Payment
	public static void bill_Payment(WebElement find_Mastercard, WebElement find_cardNo_box, WebElement find_year, WebElement find_CVV, WebElement find_Pay_btn) {
		find_Mastercard.click();
		
		find_cardNo_box.click();
		find_cardNo_box.sendKeys("2223000048410010");
		
		find_year.click();
		find_year.sendKeys("0926");
		
		find_CVV.click();
		find_CVV.sendKeys("123");
		
		find_Pay_btn.click();
		System.out.println("Payment done");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
//Screenshot
		public static void Screenshot() throws IOException, InterruptedException {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Public\\Jdk\\Selenium\\screenshots\\PayFail02.png");
			FileHandler.copy(src, dest);
			System.out.println("Screenshot done");
		}
		
//Remove selected product from Bag
		public static void remove_from_Bag(WebElement close_btn, WebElement Bag_Dropdown, WebElement Bag_Edit_btn, WebElement Bag_Remove_btn, WebElement Yes_btn) {
			close_btn.click();
			Bag_Dropdown.click();
			Bag_Edit_btn.click();
			Bag_Remove_btn.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Yes_btn.click();
			System.out.println("Remove selected product from bag");
	}
}
