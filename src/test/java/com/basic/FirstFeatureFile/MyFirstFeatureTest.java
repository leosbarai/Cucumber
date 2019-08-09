package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false, //true mostra os passos que ainda não foram implementados
		features= {"src/test/resources/com/basic/FirstFeatureFileFF/"},
		glue= {"com/basic/FirstFeatureFile/"},	
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report3.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
		}		
	)
public class MyFirstFeatureTest {

}
