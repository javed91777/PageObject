package com.hms.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://selenium4testing.com/hms");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Emergency Registration")).click();
		
		Select patientCategory = new Select(driver.findElement(By.name("PATIENT_CAT")));
		patientCategory.selectByVisibleText("Self");
		
		Select title = new Select(driver.findElement(By.name("TITLE")));
		title.selectByVisibleText("Mr.");
		
		driver.findElement(By.name("PNT_NAME")).sendKeys("Javeed");
		driver.findElement(By.name("AGE")).sendKeys("29");
		
		Select gender = new Select(driver.findElement(By.name("SEX")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
