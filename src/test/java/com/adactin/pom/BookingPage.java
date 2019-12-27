package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"my_itinerary\"]")
	private WebElement itinerary;

	public BookingPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

}
