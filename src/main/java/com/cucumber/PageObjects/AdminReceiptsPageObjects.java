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

public class AdminReceiptsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Reports
	By reports = By.xpath("//a[normalize-space()='Reports']");
	// Click on Receipts
	By receipts = By.xpath("//a[text()='Receipts ']");
	// Click on Next button
	By nextbutton = By.xpath("//a[text()=' Next ']");

	public AdminReceiptsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clickOnReports() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void clickonReceipts() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(receipts), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(receipts).click();
		Thread.sleep(3000);
	}

	public void clickonnextbutton() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("scroll(0,250);");
		Thread.sleep(2000);
		for (int i = 0; i < 8; i++) {
			Thread.sleep(1000);
			if ((Constants.driver.findElement(nextbutton)).isDisplayed()) {
				Thread.sleep(1000);
				Actions action = new Actions(Constants.driver);
				WebElement element = Constants.driver.findElement(nextbutton);
				if (i != 8) {
					action.moveToElement(element);
					action.moveToElement(element).perform();
					testbase.safeActionsClick(element, TIMEOUT_WAIT, POOLING_WAIT);
				}
			} 
		}

	}
}