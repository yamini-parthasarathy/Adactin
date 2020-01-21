package com.parallel.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.parallel.base.BaseClass;
import com.parallel.helper.FileReaderManager;
import com.parallel.runner.RunnerTest1;

import cucumber.api.java.en.Given;

public class Test1 extends BaseClass {
	
	public static WebDriver driver=RunnerTest1.driver;
	
	@Given("^user launch google application url$")
	public void user_launch_google_application_url() throws Throwable {
		String url=FileReaderManager.getInstance().getCrInstance().getUrl();
	    getUrl(url);
	    
	    Thread.sleep(4000);
	    
	    /*String url1=FileReaderManager.getInstance().getCrInstance().getUrl1();
	    getUrl(url1);*/
	}
	
		
}
