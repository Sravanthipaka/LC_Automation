package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserBulkWithoutSelectingCertificatetype {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on the Certificates tab then click on the generate bulk option
	By certificates = By.xpath("//a[text()='Certificates ']");
	By bulk = By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[2]/a");

	// upload the original certificate
	//By upload = By.id("fileInput");
	By ok = By.xpath("//button[text()='Ok']");



	public UserBulkWithoutSelectingCertificatetype(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}  

	public void ClickontheCertificatestabthenclickonthegeneratebulkoption() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");

	}

	public void uploadtheoriginalcertificate() throws InterruptedException {
		
		driver.findElement(By.id("datafile")).sendKeys("D:\\For Automation Purpose\\Document (17).pdf");
     	Thread.sleep(2000);
		Constants.driver.findElement(ok).click();

	}

	
}

