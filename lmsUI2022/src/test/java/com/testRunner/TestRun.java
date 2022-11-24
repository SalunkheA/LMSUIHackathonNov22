package com.testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions
(
		features= {"src/test/resources/Features"},
		glue = "com_lms_stepDefinitions",
		dryRun = false,
		monochrome =true,
		plugin = {"pretty", "html:test-output.html"}
		
		)
public class TestRun {

}