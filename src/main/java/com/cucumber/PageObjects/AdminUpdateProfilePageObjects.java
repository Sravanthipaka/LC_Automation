package com.cucumber.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class AdminUpdateProfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click on the Settings tab
	By setting = By.xpath("//a[text()='Settings ']");
	// click on the update profile 
	By update =By.xpath("//a[text()='Update Profile ']");
	// Then Clear on the first name and Enter on the first name 
	By first = By.xpath("//input[@placeholder=' First Name']");
	By first1 = By.xpath("//input[@placeholder=' First Name']");
	// Clear on the Last Name and Enter on the Last Name 
	By last = By.xpath("//input[@placeholder=' Last Name']");
	By last1 = By.xpath("//input[@placeholder=' Last Name']");
	// Clear on Email Id and Enter on Email Id 
	By email = By.xpath("//input[@placeholder='Email Id']");
	By email1 = By.xpath("//input[@placeholder='Email Id']");
	// Clear on Mobile Number and Enter on Mobile Number 
	By mobile = By.xpath("//input[@name='mobilenumber']");
	By mobile1 = By.xpath("//input[@name='mobilenumber']");
	// Click on the Submit and Click on ok 
	By submit = By.xpath("//input[@value='Submit']");
	By button = By.xpath("//button[normalize-space()='Ok']");



	public AdminUpdateProfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheSettingstab() throws InterruptedException {
		WebElement prof = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(prof).build().perform();
		Thread.sleep(3000);

	}

	public void clickontheupdateprofile() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(update).click();
		Thread.sleep(3000);
	}

	public void clearonthefirstnameandenteronfirstname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(first), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(first).clear();
		Constants.driver.findElement(first).sendKeys("Anusha");
		Thread.sleep(2000);
	}

	public void clearonthelastnameandenteronlaststname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(last), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(last).clear();
		Constants.driver.findElement(last).sendKeys("Admin");
		Thread.sleep(2000);
	}

	public void clearontheemailidandenteronemailid() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).clear();
		Constants.driver.findElement(email).sendKeys("anusha.g@sapphirus.in");
		Thread.sleep(2000);

	}

	public void clearonthemobilenumberandenteronmobilenumber() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).clear();
		Constants.driver.findElement(mobile).sendKeys("9912908023");
		Thread.sleep(2000);

	}

	public void clickonthesubmitandclickonok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Constants.driver.findElement(button).click();
		Thread.sleep(3000);

	}

}