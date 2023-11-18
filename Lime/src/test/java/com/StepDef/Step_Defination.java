package com.StepDef;

import com.BaseClassMethods.BaseClass;
import com.Pom.Login_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defination extends BaseClass{
	
	@Given("User launch the browser {string}")
	public void user_launch_the_browser(String string) {
		getDriver(string);
	}

	@When("User launch the url {string}")
	public void user_launch_the_url(String string) {
		getUrl(string);
	}

	@When("User clicks on shop men")
	public void user_clicks_on_shop_men() throws InterruptedException {
		Login_Page Lp = new Login_Page(getDriver());
		Thread.sleep(5000);
		Lp.getLogin().click();
	}

	@Then("User User close the browser")
	public void user_user_close_the_browser() {
		Quit();
	}
}
