package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserInternalPrintingCSVFileWithSpacesandDotsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click on the internal printing option
	By mouseover = By.xpath("//a[normalize-space()='Certificates']");
	By option = By.xpath("//a[text()='Internal Printing ']");

	// click on the Certificate Type dropdown
	By dropdown = By.xpath("//option[text()='BSC']");

	// click and upload the invalid CSV File
	By upload = By.xpath("//input[@type='file']");


	public UserInternalPrintingCSVFileWithSpacesandDotsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}

	public void clickontheinternalprintingoption() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(mouseover), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(option).click();
		Thread.sleep(2000);

	}

	public void clickontheCertificateTypedropdown() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(dropdown), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown).click();
		Thread.sleep(3000);

	}

	public void clickanduploadtheinvalidCSVFile() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(upload).sendKeys("D:\\intercsv 1.csv");
//	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\For Automation Purpose\\intercsv 1.csv");
		
//		JavascriptExecutor jse1=(JavascriptExecutor) driver;
//        WebElement Action=driver.findElement(By.xpath("//th[normalize-space()='Action']"));
//        jse1.executeScript("arguments[0].scrollIntoView();",Action);
//		Thread.sleep(2000);

	}
}

