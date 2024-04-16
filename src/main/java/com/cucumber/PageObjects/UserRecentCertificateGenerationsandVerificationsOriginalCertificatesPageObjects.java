package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//scroll down page
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	//click downoad original certificates recent certificate generations
	By icon = By.xpath("(//*[@title='Download Original Certificate'])[1]");

	//click Download original certficates recent certificate verifications
	By download = By.xpath("//*[@title='Download Original Certificte']");


	public UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void scrolldownpage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}

	public void clickdownoadoriginalcertificatesrecentcertificategenerations() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(icon), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(icon).click();
		Thread.sleep(3000);
	}

	public void clickDownloadoriginalcertficatesrecentcertificateverifications() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(download), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(download).click();
		Thread.sleep(2000);

	}	

}