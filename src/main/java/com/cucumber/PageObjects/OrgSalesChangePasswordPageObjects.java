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

public class OrgSalesChangePasswordPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Settings option
	By setting = By.xpath("//a[text()='Settings ']");
	// Click on change password
	By password = By.xpath("//a[text()='Change Password ']");
	// Enter Current password
	By password1 = By.xpath("//input[@name='currentPassword']");
	// Enter New password
	By password2= By.xpath("//input[@name='npassword']");
	// Re-enter New password
	By password3= By.xpath("//input[@name='ncpassword']");
	// Click on Update and click on ok
	By update= By.xpath("//input[@value='Update']");
	By ok= By.xpath("//button[text()='Ok']");
	//click sign out
	By sign= By.xpath("//a[text()='Signout']");



	public OrgSalesChangePasswordPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clickOnSettingsoption() throws InterruptedException {
		WebElement set = testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(set).build().perform();
		Thread.sleep(3000);

	}

	public void clickOnchangepassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(password), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password).click();
		Thread.sleep(2000);
	}

	public void entercurrentpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(password1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password1).sendKeys("Global12$");
		Thread.sleep(2000);
		
	}
	
	public void enternewpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(password2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password2).sendKeys("Global12@");
		Thread.sleep(3000);
	}
	
	public void Reenternewpassword() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(password3), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password3).sendKeys("Global12@");;
		Thread.sleep(3000);

	}

	public void clickonupdateandclickonok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(update).click();
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(3000);

	}

	public void clicksignout() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(sign), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(sign).click();
		Thread.sleep(2000);
	}
}

