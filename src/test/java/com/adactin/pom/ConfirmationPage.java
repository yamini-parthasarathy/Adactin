package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"radiobutton_0\"]")
	private WebElement select;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	private WebElement continue1;
	
	public ConfirmationPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinue1() {
		return continue1;
	}

}
