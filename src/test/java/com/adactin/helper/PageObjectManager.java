package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookedItinerary;
import com.adactin.pom.BookingPage;
import com.adactin.pom.ConfirmationPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.PaymentPage;
import com.adactin.pom.SearchHotel;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private LoginPage lp;
	private SearchHotel sh;
	private ConfirmationPage cp;
	private PaymentPage pp;
	private BookingPage bp;
	private BookedItinerary bi;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}
	public ConfirmationPage getCp() {
		cp=new ConfirmationPage(driver);
		return cp;
	}
	public PaymentPage getPp() {
		pp=new PaymentPage(driver);
		return pp;
	}
	public BookingPage getBp() {
		bp=new BookingPage(driver);
		return bp;
	}
	public BookedItinerary getBi() {
		bi=new BookedItinerary(driver);
		return bi;
	}

}