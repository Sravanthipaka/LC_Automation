package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminBacktotopbuttonPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Click on the Back to top button
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");
	
	//Click on the Back to top button
	By top = By.xpath("//*[@id='back-to-top']");

	
   public AdminBacktotopbuttonPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
   
   public void scrollthebar() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

		Thread.sleep(3000);

	}

	public void Clickonthebacktotop() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(top), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(top).click();
		Thread.sleep(2000);

	}
}