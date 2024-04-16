package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;
import com.cucumber.utility.excelGeniricUtillity;

public class UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	By CER = By.xpath("//a[text()='Certificates ']");
	By IP= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[4]/a");
	By Ok = By.xpath("//button[text()='Ok']");
	By CertificateType= By.xpath("//option[text()='Certificate Type']/..");
	By Upload = By.id("datafile");
	By Next = By.xpath("//input[@value='Next']");
	
	


	public UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void user_click_on_the_Certificates_type_tab() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CER), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void user_select_internal_printing()throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(IP), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IP).click();
		Thread.sleep(3000);


	}

	public void user_choose_the_Certificate_Type() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertificateType), TIMEOUT_WAIT, POOLING_WAIT);
		Thread.sleep(4000);
		WebElement ee= Constants.driver.findElement(CertificateType);
		ee.click();
		Thread.sleep(4000);
		Select s1 = new Select(ee);
		s1.selectByVisibleText("BSC");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");
	}

	public void uploading_CSV_File_without_Student_Email_id_column() throws Exception {
		WebElement fileInput = Constants.driver.findElement(Upload);
		Thread.sleep(4000);
		String filePath = "D:\\For Automation Purpose\\intercsv 10.csv";
		fileInput.sendKeys(filePath);
		Thread.sleep(4000);
		
	}


	public void error_message_shows() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(Ok), TIMEOUT_WAIT, POOLING_WAIT);
//	Constants.driver.findElement(Ok).click();
//	Thread.sleep(2000);

	}
}
