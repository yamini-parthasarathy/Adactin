package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
					glue = "com\\adactin\\stepdefinition",
					plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumber_report.html","html:Report",
							"json:Report/cucumber.json",
							"pretty"},
					monochrome=true,
					dryRun = false,
					strict =true)
					//tags="@login","~@confidential")
public class Runner{
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Exception {
		String browsername=FileReaderManager.getInstance().getCrInstance().browserName();
		driver=BaseClass.BrowserLaunch(browsername);
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}