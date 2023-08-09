package com.mentoringtests.qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TutorilasNinjaSearchValidproduct {
	public WebDriver driver;
	public SoftAssert softassert;
	
	@Test
	public void tnSearchWithvalidProduct() throws Exception {
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//input[@name= 'search']")).sendKeys("HP");
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
		softassert= new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
		driver.findElement(By.xpath("//span[@class= 'hidden-xs hidden-sm hidden-md'][text()= 'Add to Cart']")).click();
		driver.findElement(By.cssSelector("button#button-cart")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//ul[@class= 'breadcrumb']/following-sibling::div[1]")).isDisplayed());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class= 'btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for= input-email]+input")).sendKeys("sarakhalifa491@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label[for= input-password]+input")).sendKeys("Saraselenium@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-payment-address")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-shipping-address")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-shipping-method")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name= 'agree']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-payment-method")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#button-confirm")).click();
		
		
		
		
		

	
	
	
	softassert.assertAll();
	}

}
