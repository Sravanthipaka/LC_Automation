package com.cucumber.PageObjects;

import java.time.Duration;
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

public class AdminRegistrationPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on the Registration tab
	By reg = By.xpath("//a[text()='Registration ']");
	// enter the firstname
	By fstne = By.xpath("//input[@id='firstname']");
	// enter the lastname
	By lstne = By.xpath("//input[@id='lastname']");
	// enter the emailid
	By emlid = By.xpath("//input[@id='Emailid']");
	// enter the mobile number
	By mblno = By.xpath("//input[@id='mobilenumber']");
	// enter username
	By userne = By.xpath("//input[@id='UserName']");
	// enter pwd
	By pwd = By.xpath("//input[@id='Password']");
	// click on Register and ok button
	By rgstr = By.xpath("//input[@value='Register']");
	By oK = By.xpath("//button[text()='Ok']");

	public AdminRegistrationPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickontheRegistrationtab() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(reg), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(reg).click();
		Thread.sleep(4000);
	}

	public void enterthefirstname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(fstne), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(fstne).sendKeys("Vamshi");
		Thread.sleep(2000);
	}

	public void enterthelastname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(lstne), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(lstne).sendKeys("Krishna");
		Thread.sleep(2000);
	}

	public void entertheemailid() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(emlid), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(emlid).sendKeys("vamshikrishna@gmail.com");
		Thread.sleep(2000);
	}

	public void enterthemobilenumber() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(mblno), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mblno).sendKeys("8686887925");
		Thread.sleep(4000);
	}

	public void enterusername() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(userne), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(userne).sendKeys("Vamshi");
		Thread.sleep(2000);
	}

	public void enterpwd() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(pwd), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pwd).sendKeys("User@1");
		Thread.sleep(2000);
	}

	public void clickonRegisterandokbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(rgstr), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(rgstr).click();
		Constants.driver.findElement(oK).click();
	}
}