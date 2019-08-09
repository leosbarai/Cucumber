package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false, //true mostra os passos que ainda não foram implementados
		features= {"src/test/resources/com/basic/multiplescenarioFF/"},
		glue= {"com/basic/multiplescenarioSD/"},	
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
		}		
	)
public class RunMyMultipleScenarioTest {

}
