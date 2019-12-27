package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	
public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"check_all\"]")
	private WebElement itinerary1;
	
	@FindBy(xpath="//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")
	private WebElement cancelSelected;

	@FindBy(xpath="//*[@id=\"logout\"]")
	private WebElement logout;
	
	
	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getItinerary1() {
		return itinerary1;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public BookedItinerary(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

}