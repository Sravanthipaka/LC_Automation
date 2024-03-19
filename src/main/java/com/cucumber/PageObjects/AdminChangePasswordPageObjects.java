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

public class AdminChangePasswordPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click the Settings options
	By setting = By.xpath("//a[text()='Settings ']");
	// Click the change password field
	By pass = By.xpath("//a[text()='Change Password ']");
	// Enter the Current password field.
	By pass1 = By.xpath("//input[@name='currentPassword']");
	// Enter the New password field.
	By pass2= By.xpath("//input[@name='npassword']");
	// Re-enter the New password
	By pass3= By.xpath("//input[@name='ncpassword']");
    // Click the Update button and click the ok
	By button= By.xpath("//input[@value='Update']");
	By ok= By.xpath("//button[text()='Ok']");
	//click sign out page
	By signout= By.xpath("//a[text()='Signout']");
	
	
	
public AdminChangePasswordPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

//	public void ClickOnlogin() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(login), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(login).click();
//		Thread.sleep(3000);
//	}
	public void clicktheSettingsoptions() throws InterruptedException {
		WebElement set1 = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(set1).build().perform();
		Thread.sleep(3000);

	}

	public void clickthechangepasswordfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass).click();
		Thread.sleep(2000);
	}

	public void enterthecurrentpasswordfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass1).sendKeys("Admin@1");
		Thread.sleep(2000);


	}
   public void enterthenewpasswordfield() throws InterruptedException {
	   testbase.waitForElement(Constants.driver.findElement(pass2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass2).sendKeys("Admin@123");
		Thread.sleep(3000);
   }
	public void Reenterthenewpasswordfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(pass3), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(pass3).sendKeys("Admin@123");
		Thread.sleep(3000);
		
	}

	public void clicktheupdatebuttonandclicktheok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(button), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(button).click();
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(3000);
		
	}

	public void clicksignoutpage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(2000);
	}
}

