package com.Nykaa;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class MainMethod_BaseClass {

			static WebDriver driver;
			static JavascriptExecutor js;
			static Robot r;						//= new Robot();
			static WebDriverWait wait;			// = new WebDriverWait(driver, 30);
			static Select s;
			static Actions a = new Actions(driver);

			
			public WebDriver getDriver (String Browser_Name) {
				try {
				if (Browser_Name.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else if (Browser_Name.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
				else if (Browser_Name.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				else if (Browser_Name.equalsIgnoreCase("ie")) {
					WebDriverManager.iedriver().setup();
					driver = new ChromeDriver();
				}
				else {
					System.out.println("Invalid browser name.");
				}
				} catch (Exception e) {
					System.out.println("Browser getting error");
				}
				return driver;
			}
			
			public void getUrl(String url)	{
				try {
					driver.get(url);
				} catch (Exception e) {
					System.out.println("Invalid Url");
					}
			}
			
			public void getCurrentUrl() {
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
			}
			
			public void mouseHover(WebElement Element) {
				try {
					if (Element.isDisplayed()) {
						a.moveToElement(Element).build().perform();
					}
					else  {
						wait.until(ExpectedConditions.visibilityOf(Element));
					}
				} catch (Exception e) {
					System.out.println("Unable to find element.");
				}
			}
			
			public void Scroll_Into_View(WebElement Element) {
				js = (JavascriptExecutor) driver;
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Element);
			}
			
			public void sendKeys(WebElement Element, String StringValue) {
				try {
					if (Element.isEnabled()) {
						Element.clear();
					}else {
						wait.until(ExpectedConditions.visibilityOf(Element));
					}
				} catch (Exception e) {
					System.out.println("Unable to find element");
				}
				
				Element.sendKeys(StringValue);
			}
			
			public void getTitle() {
				String Title_name = driver.getTitle();
				System.out.println(Title_name);
			}
			
			public void dropDown(WebElement Element, String SelectOption, String Value) {
				s = new Select(Element);
				if (SelectOption.equalsIgnoreCase("value")) {
					s.selectByIndex(0);
				}
				else if (SelectOption.equalsIgnoreCase(Value))
				Element.click();
			}
			
			public void Click(WebElement Element) {
				Element.click();
			}
			
			public void navigate_To(String URL) {
				driver.navigate().to(URL);
			}
			
			public void navigate_Back() {
				driver.navigate().back();
			}
			
			public void navigate_Forword() {
				driver.navigate().forward();
			}
			
			public void navigate_Refresh() {
				driver.navigate().refresh();
			}
			
			public void getText(WebElement Element) {
				Element.getText();
			}
			
			public void getAttribute(WebElement Element, String AttributeValue) {
				Element.getAttribute(AttributeValue);
			}
			
			public void radio_Btn(WebElement Element, WebElement RadioBtn) {
				Element.click();
				RadioBtn.click();
			}
			
			public void CheckBox(WebElement CheckBox_Element) {
				CheckBox_Element.click();
			}
			
			public void getOptions(WebElement Element) {
				Element.click();
			}
			
			public void firstSelectedOptions(WebElement Element) {
				s = new Select(Element);
				s.getFirstSelectedOption();
			}
			
			public void ScreenShot(String ScreenShot_Name) throws IOException {
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\Public\\Jdk\\Nykaa\\src\\ScreenshotEvidance\\"+ScreenShot_Name+".png");
				FileUtils.copyFile(src, dest);
			}
			
			public void WindowHandle(String First_Tab_id) {
				First_Tab_id = driver.getWindowHandle();				
			}
			
//Switch to next tab			
			public void WindowHandles(String First_Tab_id) {
				First_Tab_id = driver.getWindowHandle();
				
				Set<String> AllTabId = driver.getWindowHandles();				
					
					for(String Second_Tab_ID: AllTabId) {
						if(!First_Tab_id.equals(Second_Tab_ID)) {
							driver.switchTo().window(Second_Tab_ID);
						}
					}
			}
			
			public void Alert(WebElement Alert_btn, String AcceptDismiss) {
				Alert_btn.click();
				Alert alert = driver.switchTo().alert();
				if (AcceptDismiss.equalsIgnoreCase("Accept")) {
				alert.accept();
				}
				if (AcceptDismiss.equalsIgnoreCase("Dismiss")){
				alert.dismiss();
				}
			}
			
			public void Close() {
				driver.close();
			}
			
			public void Quit() {
				driver.quit();
			}
			
			public void MouseClick(WebElement Element) {
				a.click(Element).build().perform();
			}
			
			public void Keyboard() throws AWTException {
				r = new Robot();
			}
			
			public void DragAndDrop(WebElement DragElement, WebElement DropElement) {
				a.dragAndDrop(DragElement, DropElement).build().perform();
			}
			
			public void I_frame_navigate(WebElement Element) {
				driver.switchTo().frame(Element);
			}
			
			public void Wait_VisibilityOfElement(WebElement Element) {
				wait.until(ExpectedConditions.visibilityOf(Element));
			}
			
			public void Wait_ElementToBeClickable(WebElement Element) {
				wait.until(ExpectedConditions.elementToBeClickable(Element));
			}
			
			public void element_isDisplayed(WebElement Element) {
				Element.isDisplayed();
			}
			
			public void element_isEnabled(WebElement Element) {
				Element.isEnabled();
			}
			
			public void element_isSelected(WebElement Element) {
				Element.isSelected();
			}
			
}