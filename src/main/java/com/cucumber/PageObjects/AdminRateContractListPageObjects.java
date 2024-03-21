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

public class AdminRateContractListPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Institution tab 
	By institution = By.xpath("//a[normalize-space()='Institutions']");
	//  Click on RateContract option
	By ratecontract= By.xpath("//a[text()='Rate Contracts List ']");
	// Click on download icon 
	By download= By.xpath("//*[@title='Rate Contract Document']");
	// Click on Prepaid radio button 
	By prepaid= By.xpath("//input[@value='PrePaid']");
	// Click on Postpaid Radio button
	By postpaid= By.xpath("//input[@value='PostPaid']");
//	// Click on pages
//	By pages1= By.xpath("//span[normalize-space()='2']");




	public AdminRateContractListPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	
	public void ClickonInstitutiontab () throws InterruptedException {
		WebElement inst = testbase.waitForElement(Constants.driver.findElement(institution), TIMEOUT_WAIT,POOLING_WAIT);
		Actions act=new Actions(driver);
		act.moveToElement(inst).build().perform();
		Thread.sleep(3000);


	}
	public void ClickonRateContractoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ratecontract), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ratecontract).click();
		Thread.sleep(4000);

	}
	public void Clickondownloadicon  () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(download), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(download).click();
		Thread.sleep(2000);
		Navigation n=driver.navigate();
		n.back();
		Thread.sleep(4000);
	}

	public void ClickonPrepaidradiobutton  () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(prepaid), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(prepaid).click();
		Thread.sleep(4000);
	}

	public void ClickonPostpaidRadiobutton  () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(postpaid), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(postpaid).click();
		Thread.sleep(3000);
	}

//	public void Clickonpages  () throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(pages1), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(pages1).click();
//		Thread.sleep(3000);
//		Navigation n=driver.navigate();
//		n.back();
//		Thread.sleep(4000);
//	}
}