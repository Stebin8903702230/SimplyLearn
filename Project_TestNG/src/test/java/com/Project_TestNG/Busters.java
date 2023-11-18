package com.Project_TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Busters extends BaseMethods{

		PageObjectManager pom= new PageObjectManager();
		
		@BeforeSuite
		private void browserLaunch() {
			launch_Browser("chrome");
		}
		
		@BeforeTest
		private void Url() {
			launch_Url("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gad_source=1&gclid=CjwKCAiA9dGqBhAqEiwAmRpTCwkT7n_RUzSX409hHYKlarAitPcpICTwSuGg7Th-fGdX4VWxKYGgxRoCzxkQAvD_BwE");
		}
		
		@Test
		private void InputFromPlace() {
			staticWait(800);
			clickOneWebelement(pom.WebElements().getClose_Popup());
			staticWait(300);
			clickOneWebelement(pom.WebElements().getFrom());
			staticWait(200);
			inputValues(pom.WebElements().getInputFromValue(), "Chennai");
			clickOneWebelement(pom.WebElements().getDropdownValue());
			staticWait(1000);
		}
		
		@Test         // (retryAnalyzer = Retry.class)
		private void InputToPlace() {
			inputValues(pom.WebElements().getInputToValue(), "Madurai");
			clickOneWebelement(pom.WebElements().getDropDownValueTo());
			staticWait(800);
			clickOneWebelement(pom.WebElements().getSearchFlight_btn());
			staticWait(800);
		}
		
		@Test
		private void PickDate() {
		clickOneWebelement(pom.WebElements().getPickDate());
		clickOneWebelement(pom.WebElements().getDoneDate());
		staticWait(200);
		clickOneWebelement(pom.WebElements().getDoneBtn());
		staticWait(1000);
		clickOneWebelement(pom.WebElements().getSearchFlight_btn());
		driver.navigate().refresh();
		staticWait(5000);
		clickOneWebelement(pom.WebElements().getClosePopup());
		}
		
		@AfterSuite
		private void ExitBrowser() {
			staticWait(1000);
			Quit();
		}
}
