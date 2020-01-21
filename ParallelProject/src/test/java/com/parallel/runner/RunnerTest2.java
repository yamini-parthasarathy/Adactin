package com.parallel.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.parallel.base.BaseClass;
import com.parallel.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\parallel\\feature1", 
					glue = "com\\parallel\\stepdefinition1",
					plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumber_report.html","html:Report",
							"json:Report/cucumber.json",
					//		"rerun:target/FailedScenario.txt",
							"pretty"},
					monochrome=true,
					dryRun=false,
					strict=false)

public class RunnerTest2 {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Exception {
		
		String browsername=FileReaderManager.getInstance().getCrInstance().browserName();
		driver = BaseClass.BrowserLaunch(browsername);
	}

/*	@AfterClass
	public static void tearDown() {
		driver.quit();
	}*/
}