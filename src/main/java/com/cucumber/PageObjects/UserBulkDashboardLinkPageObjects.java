package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserBulkDashboardLinkPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click the Certificate type
	By certificate = By.xpath("//a[text()='Certificates ']");

	// click on the Generate bulk option
	By bulk = By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[2]/a");

	//click on the dashboard link
	By dashboard = By.xpath("//a[text()='Dashboard ']");




	public UserBulkDashboardLinkPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}  

	public void clicktheCertificatetype() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(2000);
	}

	public void clickontheGeneratebulkoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(bulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);

	}
	
	public void clickonthedashboardlink() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(dashboard), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dashboard).click();
		Thread.sleep(4000);


	}

}




