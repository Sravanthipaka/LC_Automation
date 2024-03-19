package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class OrgSalesViewInstitutionsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click the institutions option
	By instition = By.xpath("//a[normalize-space()='Institutions']");

	//click the view institutions
	By view = By.xpath("//a[normalize-space()='View Institutions']");

	//click the create institution 
	By create = By.xpath("//button[@type='button']");

	//Enter the Institution Name
	By name =By.xpath("//input[@placeholder='Instistution Name']");

	//click the Back the Click the edit option
	By edit = By.xpath("//a[normalize-space()='Edit']");

	//click the Back the credits option
	By credits = By.xpath("//a[@class='btn btn-sm btn-primary'][normalize-space()='Credits']");

	//click back and Rate Contracts
	By ratecontracts= By.xpath("//a[normalize-space()='Rate Contracts']");


	public OrgSalesViewInstitutionsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheinstitutionsoption() throws InterruptedException {
		WebElement institutions = testbase.waitForElement(Constants.driver.findElement(instition), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(institutions).build().perform();
		Thread.sleep(3000);

	}
	public void clicktheviewinstitutions() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(view), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(view).click();
		Thread.sleep(3000);

	}

	public void clickthecreateinstitution () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(create), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(create).click();
		Thread.sleep(3000);
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

	public void EntertheInstitutionName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("AnuInstitution");
		Thread.sleep(3000);

	}

	public void clicktheBacktheClicktheeditoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(edit), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(edit).click();
		Thread.sleep(3000);
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

	public void clicktheBackthecreditsoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(credits), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(credits).click();
		Thread.sleep(3000);
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

	public void clickbackandRateContracts() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ratecontracts), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(ratecontracts).click();
		Thread.sleep(3000);
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

}


