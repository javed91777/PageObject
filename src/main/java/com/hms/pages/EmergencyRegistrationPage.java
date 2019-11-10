package com.hms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EmergencyRegistrationPage {
	
	WebDriver driver;
	
	public EmergencyRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registration_emergency() {
		
		Select patientCategory = new Select(driver.findElement(By.name("PATIENT_CAT")));
		patientCategory.selectByVisibleText("Self");
		
		Select title = new Select(driver.findElement(By.name("TITLE")));
		title.selectByVisibleText("Mr.");
		
		driver.findElement(By.name("PNT_NAME")).sendKeys("Javeed");
		driver.findElement(By.name("AGE")).sendKeys("29");
		
		Select gender = new Select(driver.findElement(By.name("SEX")));
		gender.selectByVisibleText("Male");
		
		//driver.findElement(By.name("submit")).click();
		
		driver.quit();
	}

}
