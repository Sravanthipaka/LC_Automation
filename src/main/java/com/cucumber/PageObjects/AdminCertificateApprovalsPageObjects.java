package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminCertificateApprovalsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on Certificates dropdown
	By certificates= By.xpath("//a[normalize-space()='Certificates']");

	//select the Approvals
	By approvals= By.xpath("//a[normalize-space()='Approvals']");
	
	//click on BulkApproval
    By bulk= By.xpath("//label[normalize-space()='Bulk Approval']//input[@name='sh']");
 
    //click on OK button
    //By ok=By.xpath("(//*[@type='button'])[2]");
    
    //click on SingleApproval
    By single= By.xpath("//label[normalize-space()='Single Approval']//input[@name='sh']");
	
    		
    		public AdminCertificateApprovalsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonCertificatesdropdown() throws InterruptedException {
		WebElement certificate = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(certificate).build().perform();
		Thread.sleep(3000);

	}
	public void selecttheApprovals() throws InterruptedException {
		WebElement approval = testbase.waitForElement(Constants.driver.findElement(approvals), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(approvals).click();
		Thread.sleep(3000);

	}
	
	public void clickonBulkApproval() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(bulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);
	}	
 
/*	public void clicktonOK() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(2000);
	}	*/

	public void clickonSingleApproval() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(single), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(single).click();
		Thread.sleep(2000);
	}	
}