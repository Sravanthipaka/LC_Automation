package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserRecentCertificateGenerationsandVerificationsSendMailPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//Scroll the page
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	//Click the Send Mail icon in Recent Certificate Generations
	By mail = By.xpath("//*[@title='Send Mail']");

	//Click the send mail in Recent Certificate Verifications
	By sendmail = By.xpath("(//*[@title='Send Mail'])[6]");



	public UserRecentCertificateGenerationsandVerificationsSendMailPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void Scrollthepage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}
	
	public void ClicktheSendMailiconinRecentCertificateGenerations() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(mail).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();

	}

	public void ClickthesendmailinRecentCertificateVerifications() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(sendmail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(sendmail).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
	}	

}