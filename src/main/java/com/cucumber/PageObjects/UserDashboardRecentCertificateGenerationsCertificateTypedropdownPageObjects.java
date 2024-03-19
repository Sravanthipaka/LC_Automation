package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//scroll by vertical
	By scroll = By.xpath("//a[normalize-space()='LearningChain']");

	//click on the cerificate type dropdown and select the type
	By type = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select");
	By select = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select/option[2]");

	
	public UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void Scrollthevertical() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h5[normalize-space()='Recent Certificate Verifications']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}

	public void clickontheCerificateTypedropdownandselectthetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(type), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(type).click();
		Thread.sleep(3000);
		Constants.driver.findElement(select).click();
		Thread.sleep(2000);
	}

}