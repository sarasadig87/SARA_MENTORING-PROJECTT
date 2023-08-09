package com.mentoringtests.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TryThisTestingWebsiteDropDownmenu {
	public WebDriver driver;
	public Select select;
	
	@Test
	public void dropDownmenu() {
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Sara");
		driver.findElement(By.cssSelector("input#lname")).sendKeys("Mahgoub");
		driver.findElement(By.cssSelector("label[for= male]+br+input")).click();
		select= new Select(driver.findElement(By.xpath("//select[@name= 'option']")));
		select.selectByVisibleText("Option 2");
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
