package ChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
		public void chrome() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		}
		
		public static void main (String[] args ) {
			LaunchBrowser LB = new LaunchBrowser();
			LB.chrome();
		}
}
