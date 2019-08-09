package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstStepDef {

	static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			driver = new ChromeDriver(chromeOptions);
		}
		return driver;
	}
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		getDriver().get("https://www.facebook.com/");
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name() {
		getDriver().findElement(By.id("u_0_l")).sendKeys("Leonardo");
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() {
		String firstName = getDriver().findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals("Leonardo", firstName);
	}
	
	@Then("^Close browser$")
	public void close_browser() {
		getDriver().quit();
		driver = null;
	}
	
	
}
