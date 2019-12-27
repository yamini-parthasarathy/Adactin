package com.adactin.stepdefinition;


import com.adactin.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks extends BaseClass{
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Scenario Name"+scenario.getName());

	}
	
	@After
	public void afterScenario(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			String id = scenario.getId();
			System.out.println("Scenario id is"+id);
			takeScreenshot(id);
			
		}
		System.out.println("     Status: "+scenario.getStatus());
	}
	
	@Before("@searchhotel2")
	public void beforeLastScenario(Scenario scenario) {
		System.out.println("================This will execute before searchHotel2 ================");
		System.out.println("Scenario Name    "+scenario.getName());
	}
}