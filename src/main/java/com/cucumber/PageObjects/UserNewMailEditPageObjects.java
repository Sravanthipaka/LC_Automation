package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserNewMailEditPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on Reports dropdown
	By reports= By.xpath("//a[normalize-space()='Reports']");

	//select the Generated Certificates 
	By GeneratedCertfs= By.xpath("//a[normalize-space()='Generated Certificates']");

	//click on Edit Icon and enter student email
	By icon= By.xpath("//tbody/tr[1]/td[7]/span[1]");
	By mail= By.xpath("//input[@placeholder='Enter new email']");

	//enter new mail
	By enter= By.xpath("(//*[@class='text-center'])[3]");

	//click on save
	By save= By.xpath("//*[@id='example']/tbody/tr[1]/td[7]/button[1]");


	public UserNewMailEditPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonReportsdropdown() throws InterruptedException {
		WebElement report = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(report).build().perform();
		Thread.sleep(3000);

	}
	public void selecttheGeneratedCertificates () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(GeneratedCertfs), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(GeneratedCertfs).click();
		Thread.sleep(3000);

	}

	public void clickonEditIconandclearstudentemail() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(icon), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(icon).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).clear();
		//Thread.sleep(2000);
	}	

	public void enternewemail() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).sendKeys("anusha.g@sapphirus.in");
		Thread.sleep(2000);
	}

	public void clickonsave() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(save), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(save).click();
		Thread.sleep(2000);
	}	


}