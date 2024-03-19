package com.cucumber.PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class OrgSalesViewUserListPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 300;
	private final int POOLING_WAIT = 80000;

	// Click on View userlist
	By userlist = By.xpath("(//*[@class='sub-icon'])[3]");
//	By userlist = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/app-header/nav/div/ul/li[3]/a");
	// Enter the institution name
	By instname = By.xpath("//input[@placeholder='Institution Name']");
	// Click on Impersonate option
	By impersonate = By.xpath("//i[@title='Impersonate']");



	public OrgSalesViewUserListPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickOnViewUserList() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(userlist), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(userlist).click();
		Thread.sleep(2000);
	}
	
	public void EntertheinstitutionName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(instname), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(instname).sendKeys("Testing courses");
		Thread.sleep(2000);
	}
	
	public void Clickonimpersonateoption  () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(impersonate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(impersonate).click();
		Thread.sleep(3000);
	}	
}