package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoStepDef {

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
	
	@Given("^User need to be on demo site page$")
	public void user_need_to_be_on_demo_site_page() throws Throwable {
		getDriver().get("http://demo.automationtesting.in/Register.html");
	}

	@When("^User enters first name$")
	public void user_enters_first_name() throws Throwable {
		getDriver().findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tom");
		Thread.sleep(1000);
	}

	@When("^User enters last name$")
	public void user_enters_last_name() throws Throwable {
		getDriver().findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jerry");
		Thread.sleep(1000);
	}

}
