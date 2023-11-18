package ChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetExplorer {
			
	public void IE() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	public static void main (String[] args ) {
		internetExplorer LB = new internetExplorer();
		LB.IE();
	}

}
