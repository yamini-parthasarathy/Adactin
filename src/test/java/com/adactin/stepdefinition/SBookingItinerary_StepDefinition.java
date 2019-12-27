package com.adactin.stepdefinition;

import com.adactin.base.BaseClass;
import com.adactin.helper.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SBookingItinerary_StepDefinition extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^user selects all itinerary$")
	public void user_selects_all_itinerary() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getBi().getItinerary1());
		Thread.sleep(2000);
	}

	@When("^user clicks cancel selected options$")
	public void user_clicks_cancel_selected_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getBi().getCancelSelected());
		Thread.sleep(2000);
		alertDis();
		Thread.sleep(2000);
	}

	@Then("^user clicks and logs out of the webpage$")
	public void user_clicks_and_logs_out_of_the_webpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getBi().getLogout());
	}

}