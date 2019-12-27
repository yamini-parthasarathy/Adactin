package com.adactin.stepdefinition;

import com.adactin.base.BaseClass;
import com.adactin.helper.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class KConfirmationPage_StepDefinition extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^Select radio button option$")
	public void select_radio_button_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getCp().getSelect());
		Thread.sleep(2000);
	}

	@When("^click continue$")
	public void click_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getCp().getContinue1());
		Thread.sleep(2000);
		
	}



}
