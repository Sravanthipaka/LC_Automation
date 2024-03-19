package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminVerificationURLObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click verification url
	By verification= By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[1]/div[2]/div/a");


	public AdminVerificationURLObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickverificationurl() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verification), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verification).click();
		Thread.sleep(3000);


	}

}