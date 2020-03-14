package com.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources"}, glue = {"com.stepdefenition"},monochrome = true, plugin = {"json:src\\test\\resources\\reports\\jsonout.json"})
	public class RunnerAdactin {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\reports\\jsonout.json");
		
	}
}


