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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class OrgMgmtViewInstitutionsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Institutions
	By institution = By.xpath("//a[normalize-space()='Institutions']");
	// Click on View Institutions
	By view = By.xpath("//a[normalize-space()='View Institutions']");
	// click on create new institution button
	By button = By.xpath("//button[@type='button']");
	// click on back button
	//By back = By.xpath("(https://stage.learningchain.in/view-institutions");
	// enter the institution name
	By institutionname = By.xpath("//*[@name='Inst_Name']");
	// click on Edit button
	By edit = By.xpath("//tbody/tr[1]/td[4]/a[1]");
	// click on back button
	//By button1 = By.xpath("(https://stage.learningchain.in/view-institutions");
	// click on Credits button
	By credits = By.xpath("//tbody/tr[1]/td[4]/a[2]");
	// click on back button
	//By button2 = By.xpath("(https://stage.learningchain.in/view-institutions");
	//click on Rate Contracts button
	By ratecontract = By.xpath("//tbody/tr[1]/td[4]/a[3]");
	//Click on Sign out
	By sign= By.xpath("//*[@class='menu'])[6]");


	public OrgMgmtViewInstitutionsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clickOnInstitutions() throws InterruptedException {
		WebElement inst = testbase.waitForElement(Constants.driver.findElement(institution), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(inst).build().perform();
		Thread.sleep(2000);

	}

	public void clickOnviewinstitutions() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(view), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(view).click();
		Thread.sleep(5000);
	}
	public void clickoncreateinstitutionbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(button), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(button).click();
		Thread.sleep(4000);
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

	public void entertheinstitutionName() throws InterruptedException {
		Constants.driver.findElement(institutionname).sendKeys("Testing courses");
		Thread.sleep(2000);
	}

	public void clickoneditbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(edit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(edit).click();
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);
	}


	public void clickoncreditsbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(credits), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(credits).click();
		Navigation n=driver.navigate();
		Thread.sleep(2000);
		n.back();
		Thread.sleep(2000);

	}

	public void clickbackandratecontracts() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ratecontract), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ratecontract).click();
		Thread.sleep(4000);

	}


}
