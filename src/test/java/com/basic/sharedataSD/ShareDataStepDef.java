package com.basic.sharedataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ShareDataStepDef {

	WebDriver driver;
	
	public ShareDataStepDef(SharedClass shared) {
		driver = shared.setup();
	}	
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws InterruptedException{
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws InterruptedException{
		driver.findElement(By.id("u_0_l")).sendKeys(username);
	}
		
}
