package com.subbu.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./res/features", glue = "com.subbu.steps", plugin = {
		"pretty", "json:target/cucumber-jvm-reports/cucumber.json" }, monochrome = true, publish = false, stepNotifications = true, dryRun = false)
public class TestRunner {

}
