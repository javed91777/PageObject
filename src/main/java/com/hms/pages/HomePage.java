package com.hms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToEmergencyRegistrationPage() {
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Emergency Registration")).click();
	}
	
	
}