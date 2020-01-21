package com.parallel.stepdefinition1;

import org.openqa.selenium.WebDriver;

import com.parallel.base.BaseClass;
import com.parallel.helper.FileReaderManager;
import com.parallel.runner.RunnerTest2;

import cucumber.api.java.en.Given;

public class Test2 extends BaseClass{
	
	public static WebDriver driver=RunnerTest2.driver;
	
	@Given("^user launch google application url$")
	public void user_launch_google_application_url() throws Throwable {
		String url1=FileReaderManager.getInstance().getCrInstance().getUrl1();
	    getUrl(url1);   
	    
	    Thread.sleep(4000);
	    
	    /*String url1=FileReaderManager.getInstance().getCrInstance().getUrl1();
	    getUrl(url1);*/

	}
	
}