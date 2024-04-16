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

public class UserChangePasswordPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click the Settings tab
	By setting = By.xpath("//a[text()='Settings ']");
	// Click the change password 
	By pass = By.xpath("//a[text()='Change Password ']");
	// Enter the Current password 
	By pass1 = By.xpath("//input[@name='currentPassword']");
	// Enter the New password 
	By pass2= By.xpath("//input[@name='npassword']");
	// Re-enter the New password
	By pass3= By.xpath("//input[@name='ncpassword']");
	// Click the Update button and click the ok button
	By button= By.xpath("//input[@value='Update']");
	By ok= By.xpath("//button[text()='Ok']");


	public UserChangePasswordPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonSettingstab() throws InterruptedException {
		WebElement set1 = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(set1).build().perform();
		Thread.sleep(3000);

	}

	public void clickthechangepassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass).click();
		Thread.sleep(2000);
	}

	public void enterthecurrentpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass1).sendKeys("Admin@123");
		Thread.sleep(2000);


	}
	public void enterthenewpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass2).sendKeys("Admin@1");
		Thread.sleep(3000);
	}
	public void Reenterthenewpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass3), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass3).sendKeys("Admin@1");
		Thread.sleep(3000);

	}

	public void clicktheupdatebuttonandclicktheokbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(button), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(button).click();
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(3000);

	}

}