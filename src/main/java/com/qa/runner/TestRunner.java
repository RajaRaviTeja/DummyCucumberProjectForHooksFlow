package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=true,
		strict=false,
		features={"src/main/java/com/qa/features/"},
		glue={"src/main/java/com/qa/stepdefinations/"},
		plugin={"pretty","html:test-output/cucumber.html"}
		
		
		)
public class TestRunner {

	
	
	
	
}
