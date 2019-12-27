package com.adactin.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
		public static WebDriver driver;
		
		//1.Browser Launch

		public static WebDriver BrowserLaunch(String browsername) {

			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\ChromeDriver.exe");
				driver = new ChromeDriver();
			}else if(browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\Driver\\GeckoDriver.exe");
				driver = new FirefoxDriver();
			}else if(browsername.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else {
				System.out.println("Invalid Browser Name");
			}
			
			driver.manage().window().maximize();
			return driver;
		}

		//2.Get URL
		public static void getUrl(String url) {
			driver.get(url);
		}

		//3.DropDown
		public static void dropDown(WebElement element, String option, String value) {
			
			Select s = new Select(element);
			try {
				if (option.equals("index")) {
					s.selectByIndex(Integer.parseInt(value));
				} else if (option.equals("value")) {
					s.selectByValue(value);
				} else if (option.equals("text")) {
					s.selectByVisibleText(value);
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		
		//4.Sendkeys
		public static void inputOnElement(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		//5.ScrollDown
		public static void scrollDown(WebElement element){
						
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		}
		
		//6.ScrollUp
		public static void scrollUp(){
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-1000)");
			
		}
		
		//7.Alert
		public static void alertOk(WebElement element) throws Exception{
			
			element.click();
			Thread.sleep(2000);
				
			Alert alert = driver.switchTo().alert();
			alert.accept();
			Thread.sleep(2000);
			
			}
		
		public static void alertDis() throws Exception{
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
		}
		
		public static void alerttext(WebElement element) throws Exception{
			
			element.click();
			Thread.sleep(2000);
			
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Aarthy");
			alert.accept();
			
		}
		
		//8.Robot 
		public static void robot() throws Exception {
		       
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		}
		
		//9.Actions
		public static void actionsrc(WebElement element,WebElement source,WebElement target){
			
		Actions ac=new Actions(driver);
		if(ac.contextClick(element).equals(true)) {
			ac.contextClick(element).build().perform();
	    	}else if(ac.doubleClick(element).equals(true)) {
	    		ac.doubleClick(element).build().perform();
	    	}else if(ac.dragAndDrop(source, target).equals(true)) {
	    		ac.dragAndDrop(source, target).build().perform();
	    	}else if(ac.moveToElement(target).equals(true)) {
	    		ac.moveToElement(target).build().perform();
	    	}else {
	    		System.out.println("Invalid action performed");
	    	}
		}
		
		//10.Frames
		public static void iframes(WebElement element,WebElement element1,WebElement element2) throws Exception{
			
			element.click();
			Thread.sleep(2000);
			
			driver.switchTo().frame(element1);
			element2.sendKeys("Aarthy");
		}
		
		//11.NavigateTo
		public static void navigateTo(WebElement url) {
			driver.navigate().to("url");
		}
		
		//12.NavigateBack
		public static void navigateBack() {
			driver.navigate().back();
			}

		//13.NavigateForward
		public static void navigateForward() {
			driver.navigate().forward();
		}

		//14.NavigateRefresh
		public static void navigateRefresh() {
			driver.navigate().refresh();
		}
		
		//15.Click
		public static void clickOnElement(WebElement element) {
			element.click();
		}

		//16.Clear
		public static void clearTheElement(WebElement element) {
			element.clear();
		}
		
		//17.quit
		public static void driverQuit() {
			driver.quit();	
		}
		
		//18.isEnabled
		public static void isEnabled(WebElement element) {
			if(element.isEnabled()) {
				System.out.println("Element is editable");
			}
		}
		
		//19.isDisplayed
		public static void isDisplayed(WebElement element) {
			if(element.isDisplayed()) {
				System.out.println("Element is displayed");
			}
		}
		
		//20.isSelected Condition
		public static void isSelected(WebElement element) {
			if(element.isSelected()) {
				System.out.println("Element is selected");
			}
		}
		
		//21.Screenshot 
		public static void takeScreenshot(String id) throws IOException {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			
			File destFile= new File(System.getProperty("usr.dir")+"\\Screenshot\\test.png");
			FileUtils.copyFile(sourcefile, destFile);
		}

		//22.windows handling
		
		public static void winHandle(String element, String element1) {
			
			Set<String> allID=driver.getWindowHandles();
			for(String id:allID){
				System.out.println(id);
				getTitle(element,id);
				
				for(String id1:allID) {
					if(driver.switchTo().window(id1).getTitle().equals(element1)) {
						break;
					}
				}
			
		    }
		}
		//23.wait
		
		public static void wait(WebElement element,Boolean option) {
			
			if(option.equals(1)) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}else if(option.equals(2)) {
				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOf(element));
			}else {
				System.out.println("Invalid option");
			}
		}

		
		//24. get options/getText
          
		public static void getOptions(WebElement element) {
			Select s=new Select(element);
			List<WebElement> options=s.getOptions();
			for(WebElement WebElement:options) {
				System.out.println(WebElement.getText());
			}
		}
		
		//25.get attribute
        
		public static void getAttribute(WebElement element) {
			
			element.getAttribute("value");
		}
		
		//26.browser close
		
		public static void browserClose() {
			
			driver.close();
		}
		//27.get title
		
		public static void getTitle(String element, String id) {
		
			element=driver.switchTo().window(id).getTitle();
		
		}
		
		//28.radio button
		
		//29.check box
		
}
