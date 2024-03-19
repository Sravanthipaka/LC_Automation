package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class OrgSalesReceiptsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Click on the Reports 
	By reports = By.xpath("//a[text()='Reports ']/..");

	//Click on the Receipts option
	By option = By.xpath("//a[text()='Receipts ']");

	//Click on the Overall Organization Receipts
	By radio = By.xpath("//label[text()=' Institution Wise Receipts ']/input");

	//Click on the InstitutionWise Receipts
	By button =By.xpath("//option[text()='Select Institution']/..");

	//Select the Institution Name from dropdown
	//By dropdown = By.xpath("//a[normalize-space()='Edit']");




	public OrgSalesReceiptsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickontheReports() throws InterruptedException {
		WebElement institutions = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(institutions).build().perform();
		Thread.sleep(1000);

	}
	public void ClickontheReceiptsoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(option), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(option).click();
		Thread.sleep(10000);

	}

	public void ClickontheOverallOrganizationReceipts() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(radio), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(radio).click();
		Thread.sleep(5000);

		//		WebElement e1 = driver.findElement(By.xpath("//label[text()=' Institution Wise Receipts ']/input"));
		//		Actions act2=new Actions(driver);
		//		act2.moveToElement(e1).click().build().perform();
		//		Thread.sleep(30000);
		//		

	}

	public void ClickontheInstitutionWiseReceiptsandSelecttheInstitutionNamefromdropdown() throws InterruptedException {
		//		testbase.waitForElement(Constants.driver.findElement(button), TIMEOUT_WAIT,POOLING_WAIT);
		//		Constants.driver.findElement(button).click();
		//		Thread.sleep(3000);

		WebElement ins = driver.findElement(By.xpath("//option[text()='Select Institution']/.."));
		ins.click();
		Select ss = new Select(ins);
		//		ss.selectByValue("302");
		ss.selectByVisibleText(" Amarendra University");
	}
}