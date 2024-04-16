package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserWelcomeTextPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Read the text
	By text = By.xpath("//h3[@class='mb-1']");


	public UserWelcomeTextPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();

	}

	public void ClickReadthetext() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(text), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(text).click();
		Thread.sleep(3000);


	}
}

