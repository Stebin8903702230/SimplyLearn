package ChromeLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeLaunch {

	public void edge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Public\\Jdk\\Selenium\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
	public static void main (String[] args ) {
		edgeLaunch BL = new edgeLaunch();
		BL.edge();
	}
}
