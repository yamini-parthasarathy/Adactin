package com.adactin.stepdefinition;

import com.adactin.base.BaseClass;
import com.adactin.helper.PageObjectManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentPage_StepDefinition extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^user enter FirstName$")
	public void user_enter_FirstName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getPp().getFirstname(),"Aarthy");
		Thread.sleep(2000);
		
	}

	@When("^user enter LastName$")
	public void user_enter_LastName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getPp().getLastname(),"Rajeev");
		Thread.sleep(2000);
	}

	@And("^user enter BillingAddress$")
	public void user_enter_BillingAddress() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getPp().getBillingadd(),"Adyar");
		Thread.sleep(2000);
	}

	@And("^user enter CcNo$")
	public void user_enter_CcNo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getPp().getCcno(),"9867543265174823");
		Thread.sleep(2000);
	}

	@And("^user enter CcType$")
	public void user_enter_CcType() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getPp().getCctype(),"text","American Express");
		Thread.sleep(2000);
	}

	@And("^user enter ExpiryMonth$")
	public void user_enter_ExpiryMonth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getPp().getExpirymonth(),"text","January");
		Thread.sleep(2000);
	}

	@And("^user enter ExpiryYear$")
	public void user_enter_ExpiryYear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getPp().getExpiryyear(),"text","2020");
		Thread.sleep(2000);
	}

	@And("^user enter CvvNo$")
	public void user_enter_CvvNo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputOnElement(pom.getPp().getCvvno(),"234");
		Thread.sleep(2000);
	}

	@Then("^user clicks BookNow$")
	public void user_clicks_BookNow() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getPp().getBooknow());

		Thread.sleep(8000);
	}

}