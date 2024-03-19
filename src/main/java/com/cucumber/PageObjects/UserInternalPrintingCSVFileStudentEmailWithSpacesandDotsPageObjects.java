package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click the Internal Printing option
	By certificate = By.xpath("//a[normalize-space()='Certificates']");
	By internal = By.xpath("//a[text()='Internal Printing ']");

	// Click the certificate type dropdown
	By type = By.xpath("//option[text()='BSC']");

	// Click by upload the invalid CSV File
	//By file = By.xpath("//input[@type='file']");


	public UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}

	public void ClicktheInternalPrintingoption() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(internal).click();
		Thread.sleep(2000);

	}

	public void Clickthecertificatetypedropdown() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(type), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(type).click();
		Thread.sleep(3000);

	}

	public void ClickbyuploadtheinvalidCSVFile() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(upload).sendKeys("D:\\intercsv 1.csv");
//	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\For Automation Purpose\\intercsv 2.csv");
		
//		JavascriptExecutor jse1=(JavascriptExecutor) driver;
//        WebElement Action=driver.findElement(By.xpath("//th[normalize-space()='Action']"));
//        jse1.executeScript("arguments[0].scrollIntoView();",Action);
//		Thread.sleep(2000);

	}
}

