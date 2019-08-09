package com.basic.ParametrizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false, 
		features= {"src/test/resources/com/basic/parametrizationFF/"},
		glue= {"com/basic/ParametrizationSD/"},	
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
		}		
	)
public class RunParametrizationTest {

}
