package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click Internal Printing option
	By certificates = By.xpath("//a[normalize-space()='Certificates']");
	By internalprinting = By.xpath("//a[text()='Internal Printing ']");

	// Click certificate type dropdown
	By certificatetype = By.xpath("//option[text()='BSC']");

	// Click as upload invalid CSV file
	//By file = By.xpath("//input[@type='file']");


	public UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}

	public void ClickInternalPrintingoption() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(internalprinting).click();
		Thread.sleep(2000);

	}

	public void Clickcertificatetypedropdown() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificatetype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificatetype).click();
		Thread.sleep(3000);

	}

	public void ClickasuploadinvalidCSVfile() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(upload).sendKeys("D:\\intercsv 1.csv");
//	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\For Automation Purpose\\intercsv 3.csv");
		
//		JavascriptExecutor jse1=(JavascriptExecutor) driver;
//        WebElement Action=driver.findElement(By.xpath("//th[normalize-space()='Action']"));
//        jse1.executeScript("arguments[0].scrollIntoView();",Action);
//		Thread.sleep(2000);

	}
}

