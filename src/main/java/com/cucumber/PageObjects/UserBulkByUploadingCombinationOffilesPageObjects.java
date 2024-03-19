
package com.cucumber.PageObjects;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserBulkByUploadingCombinationOffilesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	
	By CER = By.xpath("//a[text()='Certificates ']");
	By BGC= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[2]/a");
	By CertificateType= By.xpath("//option[text()='Certificate Type']/..");
	By Upload = By.id("fileInput");
	By checkbox = By.xpath("//input[@type='checkbox']");
	By next = By.xpath("//input[@value='Next']");

	public UserBulkByUploadingCombinationOffilesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
	public void ClickontheCertificatestab  () throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CER), TIMEOUT_WAIT, POOLING_WAIT);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(CER);
		action.moveToElement(element).perform();
		Thread.sleep(3000);	
	}
	public void ClickonGeneratedBulkCertificates () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(BGC), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(BGC).click();
		Thread.sleep(4000);
	}
	public void SelectCertificateType () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertificateType), TIMEOUT_WAIT, POOLING_WAIT);
		WebElement ee= Constants.driver.findElement(CertificateType);
		ee.click();
		Thread.sleep(4000);
		Select s1 = new Select(ee);
		s1.selectByVisibleText("MBA");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");
	}
	public void UploadAllCertificates  () throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(Upload), TIMEOUT_WAIT, POOLING_WAIT);
		WebElement fileInput = Constants.driver.findElement(Upload);
		Thread.sleep(4000);
		String[] filePaths = {"D:\\LC_Automation Practice\\Cat03 (7).jpg", "D:\\LC_Automation Practice\\DWSample1-DOC 1.doc","D:\\LC_Automation Practice\\loved-to-death-obooko-5.pdf","D:\\LC_Automation Practice\\Nature.jpeg"};
		for (String filePath : filePaths) {
			fileInput.sendKeys(filePath);
		}
	}
//	public void ClickNextbutton () throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
//		//Constants.driver.findElement(checkbox).click();
//		//Thread.sleep(4000);
//		//Constants.driver.findElement(next).click();
//	}
}
