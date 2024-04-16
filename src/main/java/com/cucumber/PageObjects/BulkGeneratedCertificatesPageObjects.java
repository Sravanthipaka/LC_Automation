package com.cucumber.PageObjects;

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

public class BulkGeneratedCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on the Reports tab 
	By rept = By.xpath("//a[text()='Reports ']");
	// Click on Bulk Generated Certificates
	By bgc= By.xpath("//a[text()='BulkGenerated Certificates ']");
	// Click on the particular Reference id
	By refid= By.xpath("//a[normalize-space()='9151']");



	public BulkGeneratedCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickontheReportstab () throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(rept), TIMEOUT_WAIT, POOLING_WAIT);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Reports ']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);	
	}

	public void ClickonBulkGeneratedCertificates () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(bgc), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(bgc).click();
		Thread.sleep(4000);
	}

	public void ClickontheparticularReferenceid () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(refid), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(refid).click();
		Thread.sleep(4000);
	}
}
