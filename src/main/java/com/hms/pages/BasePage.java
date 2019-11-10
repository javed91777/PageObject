package com.hms.pages;

import com.hms.core.BrowserType;

public class BasePage {
	
	BrowserType browserType;
	LoginPage loginPage;
	HomePage homePage;
	EmergencyRegistrationPage emg_registrationPage;
	
	public LoginPage getLoginPage() {
		return loginPage!=null ? loginPage: new LoginPage(getBrowserType().getDriver());
	}
	
	public HomePage getHomePage() {
		return homePage!=null ? homePage: new HomePage(getBrowserType().getDriver());
	}
	
	public EmergencyRegistrationPage getEmergencyRegistrationPage() {
		return emg_registrationPage!=null ? emg_registrationPage: new EmergencyRegistrationPage(getBrowserType().getDriver());
	}
	
	public BrowserType getBrowserType() {
		return browserType!=null ? browserType:  new BrowserType();
	}

}
