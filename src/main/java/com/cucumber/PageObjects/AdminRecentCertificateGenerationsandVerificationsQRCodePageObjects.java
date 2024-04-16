package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//Scroll down on the dashboard
	By scroll = By.xpath("//h5[normalize-space()='Recent Certificate Verifications']");

	// Click on the certificate type dropdown
	//By dropdown1 = By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']");

	//Select the certificate type
	//By selectvalue = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select/option[2]");

	//click by downoad qR Code icon recent certificate generations in dashboard
	By icon = By.xpath("(//*[@title=' Download QR Code'])[1]");

	//click by downoad qR Code icon recent certificate verifications in dashboard
	By download = By.xpath("(//*[@title='Download QR Code'])[1]");




	public AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void Scrolldownonthedashboard() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(1000);
		//Constants.driver.findElement(dropdown1).click();
		//Constants.driver.findElement(selectvalue).click();
		Thread.sleep(1000);

	}

	public void clickbydownoadqRCodeiconrecentcertificategenerationsindashboard() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(icon), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(icon).click();
		Thread.sleep(3000);
	}

	public void clickbydownoadqRCodeiconrecentcertificateverificationsindashboard() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(download), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(download).click();
		Thread.sleep(2000);

	}	

}