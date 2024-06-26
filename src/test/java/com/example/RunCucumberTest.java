package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		// tags = "@LoginValidCredentials or @DirectoryTabIsSearchButtonDisplayed",
		features = "src/test/resources/features",
        glue = { "com.example" }
		// plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
		// 		"html:target/cucumber-reports/cucumberreport.html", 
		// 		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		// monochrome = true
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}