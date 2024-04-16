package com.cucumber.PageObjects;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminCreditsListPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on the Institution tab 
	By institution = By.xpath("//a[normalize-space()='Institutions']");
	//  Click on Credits list 
	By creditslist= By.xpath("//a[text()='Credits List ']");
	// Click on the pages and Verify forward and backward navigations
	//By nexbutton = By.xpath("//li[@class='pagination-next']//a[1]");
  	//By previous = By.xpath("//span[@aria-disabled='true']");
    // Click on the pages
	//By pages= By.xpath("//span[normalize-space()='2']");
	// signOut
		By logout = By.xpath("//a[text()='Signout']");

	
	
  	public AdminCreditsListPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

//	public void ClickOnlogin() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(login), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(login).click();
//		Thread.sleep(3000);
//	}
	public void ClickOninstitutionstab() throws InterruptedException {
		WebElement institutions = testbase.waitForElement(Constants.driver.findElement(institution), TIMEOUT_WAIT,
				POOLING_WAIT);
		institutions.click();
		Thread.sleep(3000);
	}
	public void ClickonCreditslist () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(creditslist), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(creditslist).click();
		Thread.sleep(2000);
	}
	
//	public void Clickpages  () throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(pages), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(pages).click();
//		Thread.sleep(3000);
//		Navigation n=driver.navigate();
//		n.back();
//		Thread.sleep(4000);
		
	}
		  