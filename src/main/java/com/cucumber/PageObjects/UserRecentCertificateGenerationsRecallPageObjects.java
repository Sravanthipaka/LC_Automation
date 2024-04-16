package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserRecentCertificateGenerationsRecallPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//scroll down page
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	//click Recall icon in Recent Certificate Generations
	By icon = By.xpath("(//*[@title='Recall'])[1]");
	By ok = By.xpath("//button[normalize-space()='Ok']");


	public UserRecentCertificateGenerationsRecallPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void scrolltheverticalbar() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}
	public void clickRecalliconinRecentCertificateGenerations() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(icon), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(icon).click();
		Thread.sleep(3000);
		Constants.driver.findElement(ok).click();
	

	}

}