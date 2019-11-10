package com.hms.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserType {

	public WebDriver driver;
	

	public void launchDriver(String browserName) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public enum Browser{
		FF, IE,CHROME;
	}

}
