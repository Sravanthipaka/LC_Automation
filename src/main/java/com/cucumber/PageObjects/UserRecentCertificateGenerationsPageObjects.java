package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserRecentCertificateGenerationsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Scroll down the page
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	//Click on the Student name link
	By student = By.xpath("//a[normalize-space()='Kajal']");


	public UserRecentCertificateGenerationsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void scrolldownthepage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}
	
	public void clickthestudentnamelink() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(student), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(student).click();
		Thread.sleep(3000);

	}


}