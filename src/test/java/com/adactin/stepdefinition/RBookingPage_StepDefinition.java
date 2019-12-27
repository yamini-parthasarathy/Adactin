package com.adactin.stepdefinition;

import com.adactin.base.BaseClass;
import com.adactin.helper.PageObjectManager;
import cucumber.api.java.en.Given;

public class RBookingPage_StepDefinition extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^user clicks get itinerary$")
	public void user_clicks_get_itinerary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getBp().getItinerary());
		Thread.sleep(6000);
	}

}
