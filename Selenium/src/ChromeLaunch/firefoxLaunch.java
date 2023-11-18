package ChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLaunch {

		public void firefox() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\geckodriver.exe");
			WebDriver driver3 = new FirefoxDriver();
			driver3.get("https://www.google.com/");
		}
		
		public static void main (String[] args ) {
			firefoxLaunch dd = new firefoxLaunch();
			dd.firefox();
		}
}

