package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ILogin_StepDefinition extends BaseClass{
	
public static WebDriver driver=Runner.driver;
	
	PageObjectManager pom=new PageObjectManager(driver);

	
		@Given("^the user logs in the application$")
		public void the_user_logs_in_the_application() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User starts to login");
		}
		
		@And("^goes to the landing page$")
		public void goes_to_the_landing_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("User has logged in");
		}

		@When("^user enter application url$")
		public void user_enter_application_url() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String url=FileReaderManager.getInstance().getCrInstance().getUrl();
		    getUrl(url);
		}
		
		@When("^user enter \"([^\"]*)\" as username$")
		public void user_enter_as_username(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			inputOnElement(pom.getLp().getUserName(),arg1);
		}

		@When("^user enter \"([^\"]*)\" as password$")
		public void user_enter_as_password(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			inputOnElement(pom.getLp().getPassword(),arg1);
		}

		@Then("^user verify the username in the homepage$")
		public void user_verify_the_username_in_the_homepage() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			clickOnElement(pom.getLp().getLoginBtn());
			
			Thread.sleep(1000);
		}
				
}
