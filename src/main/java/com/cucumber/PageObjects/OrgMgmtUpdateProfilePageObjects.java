package com.cucumber.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class OrgMgmtUpdateProfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;
	// click the Settings option
	By setting = By.xpath("//a[text()='Settings ']");
	// click the update profile 
	By update =By.xpath("//a[text()='Update Profile ']");
	// clear on First Name 
	By first = By.xpath("//input[@placeholder=' First Name']");
	// enter on First Name 
	By first1 = By.xpath("//input[@placeholder=' First Name']");
	// clear on Last Name 
	By last = By.xpath("//input[@placeholder=' Last Name']");
	// enter on Last Name
	By last1 = By.xpath("//input[@placeholder=' Last Name']");
	// clear on Email id 
	By email = By.xpath("//input[@placeholder='Email Id']");
	// enter on Email id 
	By email1 = By.xpath("//input[@placeholder='Email Id']");
	// clear on mobile number 
	By mobile = By.xpath("//input[@name='mobilenumber']");
	// enter on mobile number 
	By mobile1 = By.xpath("//input[@name='mobilenumber']");
	//click on submit 
	By submit = By.xpath("//input[@value='Submit']");
	//Click on the Ok option
	By ok = By.xpath("//button[normalize-space()='Ok']");
	//click as sign out
	By log1 = By.xpath("//a[text()='Signout']");
	public OrgMgmtUpdateProfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clicktheSettingsoption() throws InterruptedException {
		WebElement prof = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(prof).build().perform();
		Thread.sleep(3000);

	}

	public void clicktheupdateprofile() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(update).click();
		Thread.sleep(3000);
	}

	public void clearthefirstname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(first), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(first).clear();
		Thread.sleep(2000);
	}

	public void enterthefirstname() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(first1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(first1).sendKeys("sankarprasad");
		Thread.sleep(2000);


	}
	public void clearthelastname() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(last), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(last).clear();;
		Thread.sleep(3000);
	}
	public void enterthelaststname() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(last1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(last1).sendKeys("prasad");
		Thread.sleep(3000);

	}

	public void cleartheemailid() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).clear();
		Thread.sleep(2000);
	}
	
	public void entertheemailid() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(email1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email1).sendKeys("mamatha@gmail.com");
		Thread.sleep(2000);

	}

	public void clearthemobilenumber() throws InterruptedException, Exception {
		testbase.waitForElement(Constants.driver.findElement(email1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).clear();
		Thread.sleep(2000);

	}

	public void enterthemobilenumber() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mobile1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile1).sendKeys("9823801292");
		Thread.sleep(3000);

	}
	
	public void clickthesubmitbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(4000);

	}
	
	public void clickontheokoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(4000);

	}
	
	public void clickasSignout() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(log1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(log1).click();
		Thread.sleep(5000);
	}
}