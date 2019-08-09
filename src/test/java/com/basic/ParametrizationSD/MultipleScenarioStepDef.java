package com.basic.ParametrizationSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleScenarioStepDef {

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
	public void user_need_to_be_on_Facebook_login_page() throws InterruptedException{
		Thread.sleep(2000);
		getDriver().get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws InterruptedException{
		getDriver().findElement(By.id("u_0_l")).sendKeys(username);
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String username) {
		String firstName = getDriver().findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals(username, firstName);
	}
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) {
		getDriver().findElement(By.id("u_0_n")).sendKeys(surName);		
	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() {
		String mobile = getDriver().findElement(By.id("u_0_q")).getAttribute("value");
		Assert.assertEquals("", mobile);		
	}
	
	@Then("^Close browser$")
	public void close_browser() {
		getDriver().close();
	}
	
}
