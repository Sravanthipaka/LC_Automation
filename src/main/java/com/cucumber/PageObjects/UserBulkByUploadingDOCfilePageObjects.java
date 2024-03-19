package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserBulkByUploadingDOCfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click certificates tab then click on the generate bulk option
	By certificates = By.xpath("//a[text()='Certificates ']");
	By bulk = By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[2]/a");

	// Click certificate type dropdown and select certificate type
	By certificatetype = By.xpath("//option[text()='Degree']");

	//upload the DOC file
	//By upload = By.id("fileInput");
	By checkbox = By.xpath("//input[@type='checkbox']");
	By next = By.xpath("//input[@value='Next']");



	public UserBulkByUploadingDOCfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}  

	public void clickcertificatestabthenclickonthegeneratebulkoption() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");

	}

	public void Clickcertificatetypedropdownandselectcertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificatetype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificatetype).click();
		Thread.sleep(2000);

	}
	public void uploadtheDOCfile() throws InterruptedException {
		//	testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		//	Constants.driver.findElement(upload).click();
		driver.findElement(By.id("fileInput")).sendKeys("D:\\LC_Automation Practice\\DWSample1-DOC 1.doc");
		Thread.sleep(2000);
		Constants.driver.findElement(checkbox).click();
		Constants.driver.findElement(next).click();
		Thread.sleep(3000);
	}

}




