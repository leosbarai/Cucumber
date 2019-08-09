package com.basic.sharedataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShareDataStepDef1 {
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass shared) {
		driver = shared.setup();
	}	

	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String username) {
		String firstName = driver.findElement(By.id("u_0_l")).getAttribute("value");
		Assert.assertEquals(username, firstName);
	}
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) {
		driver.findElement(By.id("u_0_n")).sendKeys(surName);		
	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() {
		String mobile = driver.findElement(By.id("u_0_q")).getAttribute("value");
		Assert.assertEquals("", mobile);		
	}
	
}
