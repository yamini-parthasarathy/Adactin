package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement firstname;

	@FindBy(xpath="//*[@id=\"last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"address\"]")
	private WebElement billingadd;
	
	@FindBy(xpath="//*[@id=\"cc_num\"]")
	private WebElement ccno;
	
	@FindBy(xpath="//*[@id=\"cc_type\"]")
	private WebElement cctype;
	
	@FindBy(xpath="//*[@id=\"cc_exp_month\"]")
	private WebElement expirymonth;

	@FindBy(xpath="//*[@id=\"cc_exp_year\"]")
	private WebElement expiryyear;

	@FindBy(xpath="//*[@id=\"cc_cvv\"]")
	private WebElement cvvno;
	
	@FindBy(xpath="//*[@id=\"book_now\"]")
	private WebElement booknow;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingadd() {
		return billingadd;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	public PaymentPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	
	}

}