package com.Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RoughWork {
				static Actions mouseAct;
				static Robot keyBrd;
				static WebDriver driver;
				static WebDriverWait wait;
				static JavascriptExecutor js;

// Open Web Browser			
				public static void launch_Browser() {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.nykaa.com/");
					System.out.println("Browser Launched");
				}
				
// Menu: Mom & Baby
				public static void mom_Baby_menu () throws InterruptedException {
					Thread.sleep(3000);
					WebElement find_mombaby_elmt = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']"));
					mouseAct.moveToElement(find_mombaby_elmt).build().perform();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					Thread.sleep(1000);
					System.out.println("Menu: Mom & Baby");
//Sub-menu: Baby powder
					WebElement find_Baby_Powder_elmt = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
					mouseAct.moveToElement(find_Baby_Powder_elmt).build().perform();
					
					mouseAct.click(find_Baby_Powder_elmt).build().perform();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					System.out.println("Sub-menu: Baby powder");
				}
				
//Window: switch to tab2
				public static void SwitchToTab2() {
					String First_Tab_id = driver.getWindowHandle();
					
					Set<String> AllTabId = driver.getWindowHandles();				
						
						for(String Second_Tab_ID: AllTabId) {
							if(!First_Tab_id.equals(Second_Tab_ID)) {
								driver.switchTo().window(Second_Tab_ID);
							}
						}
					System.out.println("Switched to Tab2");
				}
				
//Scroll to products
				public static void scroll() throws InterruptedException {
					Thread.sleep(800);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					WebElement Find_AllProducts = driver.findElement(By.xpath("//div[text()='All Products']"));
					js.executeScript("arguments[0].scrollIntoView(true);", Find_AllProducts);			
					Thread.sleep(800);	
					System.out.println("Scroll to All Products");
				}

// Selecting first product
				public static void ProductSelect() {
					WebElement find_first_Product = driver.findElement(By.className("css-1rd7vky"));
					mouseAct.click(find_first_Product).build().perform();
					System.out.println("Selected first product");
				}
				
// Switch to Tab3				
				public static void SwitchToTab3() {
					String Second_Tab_ID = driver.getWindowHandle();
					System.out.println(Second_Tab_ID);
					
					Set<String> AllTabId = driver.getWindowHandles();				
						
						for(String Third_Tab: AllTabId) {
							if(!Second_Tab_ID.equals(Third_Tab)) {
								driver.switchTo().window(Third_Tab);
							}
						}
					System.out.println("Switched to Tab3");
				}
				
// Customize product
				public static void Weight_Dropdown() {
					WebElement find_Dropdown_arrow_elemt = driver.findElement(By.className("css-2t5nwu"));
					find_Dropdown_arrow_elemt.click();
					
					Select selct = new Select(find_Dropdown_arrow_elemt);
					selct.selectByValue("0");
					
					find_Dropdown_arrow_elemt.click();
					js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView(true);", find_Dropdown_arrow_elemt);	
					System.out.println("Product customized to 100g");
				}
				
// Add to Bag
				public static void addTo_Bag() {
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					WebElement find_Add_to_bag = driver.findElement(By.xpath("//div[@Class='css-vp18r8']"));
					
					mouseAct.click(find_Add_to_bag).build().perform();
					System.out.println("Added to bag");
				}
				
// Bag- Product Quantity
				public static void Bag() throws InterruptedException {
					WebElement bag_btn = driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']"));
					bag_btn.click();
					
					WebElement find_iframe = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
					driver.switchTo().frame(find_iframe);
					
					WebElement find_qty_arrow_elmt = driver.findElement(By.xpath("//span[@class='css-1aowomc ehes2bo0']//img[@class='css-g7xef ek8d9s80']"));
					find_qty_arrow_elmt.click();
					
					WebElement find_Select_3_btn = driver.findElement(By.xpath("//div[@label='3']//div[@class='css-bfwsku']"));
					find_Select_3_btn.click();
					
					WebElement find_proceed_btn = driver.findElement(By.xpath("//span[text()='Proceed']"));
					wait.until(ExpectedConditions.elementToBeClickable(find_proceed_btn));
					find_proceed_btn.click();
					System.out.println("Select product qty to 3");
				}
				
// Guest login (entry)
				public static void guest_Login() throws InterruptedException {
					WebElement find_Guest_btn = driver.findElement(By.xpath("//button[text()='Continue as guest']"));
					find_Guest_btn.click();
					
					WebElement find_pincode_box = driver.findElement(By.xpath("//input[@placeholder='Pincode']"));
					find_pincode_box.click();
					find_pincode_box.sendKeys("629173");
					
					WebElement Find_Address_box = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
					Find_Address_box.click();
					Thread.sleep(1000);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					Find_Address_box.sendKeys("20/20 South Side");
					
					WebElement find_Address_box2= driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"));
					find_Address_box2.click();
					find_Address_box2.sendKeys("Fountain View, Green Street.");
					System.out.println("Guest login (Entry)");					
				}
				
// Guest Contact details - (entry)
				public static void contactAddress() throws InterruptedException {
					
					WebElement find_contact = driver.findElement(By.xpath("//p[text()='Contact']"));
					js.executeScript("arguments[0].scrollIntoView(true);", find_contact);
					Thread.sleep(200);
					
					WebElement find_name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
					find_name.click();
					find_name.sendKeys("Stebin");
					
					WebElement find_phone_box = driver.findElement(By.xpath("//input[@placeholder='Phone']"));
					find_phone_box.click();
					find_phone_box.sendKeys("8903702230");
					
					Thread.sleep(500);
									
					WebElement find_email_box = driver.findElement(By.xpath("//input[@placeholder='Email ID']"));
					js.executeScript("window.scrollBy(0,500)");			// Scroll down
					Thread.sleep(1000);
					mouseAct.click(find_email_box).sendKeys(find_email_box, "stebinji@gmail.com").build().perform();
										
					Thread.sleep(2000);
					WebElement find_ShipAddress_btn = driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']"));
					wait.until(ExpectedConditions.elementToBeClickable(find_ShipAddress_btn));
					find_ShipAddress_btn.click();
					System.out.println("Guest contact details (Entry)");
				}

// Bill Payment
				public static void bill_Payment() throws InterruptedException {
					WebElement find_Mastercard = driver.findElement(By.xpath("//p[text()='Visa, Mastercard, Rupay & more']"));
					find_Mastercard.click();
					
					WebElement find_cardNo_box = driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
					find_cardNo_box.click();
					find_cardNo_box.sendKeys("2223000048410010");
					
					WebElement find_year = driver.findElement(By.xpath("//input[@placeholder='Expiry (MM/YY)']"));
					find_year.click();
					find_year.sendKeys("0926");
					
					WebElement find_CVV = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
					find_CVV.click();
					find_CVV.sendKeys("123");
					
					WebElement find_Pay_btn = driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']"));
					find_Pay_btn.click();
					Thread.sleep(9000);
					System.out.println("Payment done");
				}
				
// Screenshot
					public static void Screenshot() throws IOException, InterruptedException {
						TakesScreenshot ts = (TakesScreenshot)driver;
						File src = ts.getScreenshotAs(OutputType.FILE);
						File dest = new File("C:\\Users\\Public\\Jdk\\Selenium\\screenshots\\PayFail02.png");
						FileHandler.copy(src, dest);
						System.out.println("Screenshot done");
					}
					
// Remove selected product from Bag
					public static void remove_from_Bag() throws InterruptedException {
						WebElement close_btn = driver.findElement(By.xpath("//button[@class='css-1iwzqhf emgaj5l0']"));
						close_btn.click();
						
						WebElement Bag_Dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span[2]/img"));
						Bag_Dropdown.click();
						
						WebElement Bag_Edit_btn = driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']"));
						Bag_Edit_btn.click();
						
						WebElement Bag_Remove_btn = driver.findElement(By.xpath("//div[@data-test-id='product-remove']//span[@class='css-175whwo ehes2bo0']"));
						Bag_Remove_btn.click();
						
						Thread.sleep(2000);
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						WebElement Yes_btn = driver.findElement(By.xpath("//button[text()='Yes']"));
						Yes_btn.click();
						System.out.println("Remove selected product from bag");
				}
				
// Main Method				
				public static void main(String[] args) throws InterruptedException, IOException, AWTException {
					launch_Browser();
					mouseAct = new Actions(driver);
					keyBrd = new Robot();
					wait = new WebDriverWait(driver,30);
					js = (JavascriptExecutor) driver;
					
					mom_Baby_menu();
					SwitchToTab2();
					scroll();
					ProductSelect();
					
					SwitchToTab3();
					Weight_Dropdown();
					addTo_Bag();
					Bag();
					guest_Login();
					contactAddress();
					bill_Payment();
					Screenshot();
					remove_from_Bag();
//					driver.close();
				}
}


