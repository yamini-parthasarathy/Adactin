package com.adactin.stepdefinition;

import com.adactin.base.BaseClass;
import com.adactin.helper.PageObjectManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JSearch_StepDefinition extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^user enter Location$")
	public void user_enter_Location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getSh().getLocation(),"text","Sydney");
		Thread.sleep(1000);
	}

	@When("^user enter Hotel$")
	public void user_enter_Hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getSh().getHotel(),"text","Hotel Creek");
		Thread.sleep(1000);
	}

	@And("^user enter RoomType$")
	public void user_enter_RoomType() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getSh().getRoomType(),"text","Standard");
		Thread.sleep(1000);
	}

	@And("^user enter NoOfRooms$")
	public void user_enter_NoOfRooms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dropDown(pom.getSh().getNoofrooms(),"text","1 - One");
		Thread.sleep(1000);
	}

	@Then("^user clicks search$")
	public void user_clicks_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clickOnElement(pom.getSh().getSearch());
		
		Thread.sleep(1000);
	}
	
}