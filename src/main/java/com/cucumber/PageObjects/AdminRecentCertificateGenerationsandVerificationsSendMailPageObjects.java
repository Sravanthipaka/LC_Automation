package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//Scroll by admin verical bar
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	//Click by send mail  on Recent Certificate Generations the dashbaord
	By mail = By.xpath("//*[@class='fa fa-envelope-o mx-2']");

	//Click by Send Mail on recent certificate verifications the dashbaord
	By sendmail = By.xpath("(//*[@title='Send Mail'])[2]");
	By ok = By.xpath("//button[normalize-space()='Ok']");



	public AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void Scrollbyadminvericalbar() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

		Thread.sleep(3000);

	}

	public void ClickbysendmailonRecentCertificateGenerationsthedashbaord() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(mail).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();

	}

	public void ClickbySendMailonrecentcertificateverificationsthedashbaord() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(sendmail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(sendmail).click();
		Thread.sleep(2000);
		Constants.driver.findElement(ok).click();
		
	}	

}