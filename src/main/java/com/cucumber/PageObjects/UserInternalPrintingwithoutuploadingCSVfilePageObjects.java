package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;


public class UserInternalPrintingwithoutuploadingCSVfilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	By CER = By.xpath("//a[text()='Certificates ']");
	By BGC= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[4]/a");
	By CertificateType= By.xpath("//option[text()='Certificate Type']/..");
	By Next = By.xpath("//input[@value='Next']");

	public UserInternalPrintingwithoutuploadingCSVfilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheCertificatestype() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CER), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void clicktheverifiedcertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(BGC), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(BGC).click();
		Thread.sleep(3000);
	

	}

	public void selectCertificatestype () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertificateType), TIMEOUT_WAIT, POOLING_WAIT);
		Thread.sleep(4000);
		WebElement ee= Constants.driver.findElement(CertificateType);
		ee.click();
		Thread.sleep(4000);
		Select s1 = new Select(ee);
		s1.selectByVisibleText("MBA");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");
	}


	public void clickontheNextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(Next), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(Next).click();
		Thread.sleep(2000);

	}


}
