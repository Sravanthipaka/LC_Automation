package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminCertificateNamesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on Institutions dropdown
	By institutions= By.xpath("//a[normalize-space()='Institutions']");

	//select the Certificate Names 
	By CertName= By.xpath("//a[normalize-space()='Certificate Names']");

	//click on Edit button
	By edit= By.xpath("//a[@class='btn btn-sm btn-primary']");

	//clear the Certificate name
	//enter the Certificate name
	By clrTxt=By.xpath("//input[@id='CertificateName']");
	
	//enter the Certificate name
	By enter =By.xpath("//input[@id='CertificateName']");

	//Update the Certificate name
	By update= By.xpath("//input[@value='Add']");
	


	public AdminCertificateNamesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickbyInstitutiondropdown() throws InterruptedException {
		WebElement institution = testbase.waitForElement(Constants.driver.findElement(institutions), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(institution).build().perform();
		Thread.sleep(3000);

	}
	public void selectonCertificateNames() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertName), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(CertName).click();
		Thread.sleep(3000);

	}

	public void clickonEditbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(edit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(edit).click();
		Thread.sleep(2000);
	}	

	public void clearonCertificateName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(clrTxt), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(clrTxt).clear();
		Thread.sleep(2000);
	}	

	public void enterbyCertificateName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(enter), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(enter).sendKeys("Automation");
		Thread.sleep(2000);

	}

	public void UpdateofCertificateName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(update).click();
		Thread.sleep(2000);
	}	
}