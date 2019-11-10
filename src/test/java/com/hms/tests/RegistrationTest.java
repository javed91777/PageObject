package com.hms.tests;

import org.junit.Before;
import org.junit.Test;
import com.hms.pages.BasePage;

public class RegistrationTest {
	BasePage basePage;
	
	
	@Test
	public void TC_01_validateEmergenvyRegistration() {
		basePage.getLoginPage().login();
		basePage.getHomePage().navigateToEmergencyRegistrationPage();
		basePage.getEmergencyRegistrationPage().registration_emergency();
	}
	
	@Before
	public void launchDriver() {
		basePage = new BasePage();
		basePage.getBrowserType().launchDriver("FF");
	}
}
