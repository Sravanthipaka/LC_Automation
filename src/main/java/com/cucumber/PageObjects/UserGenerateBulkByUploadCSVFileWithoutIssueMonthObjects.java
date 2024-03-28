package com.cucumber.PageObjects;

import java.awt.Robot;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;

	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	// Click on cerificates
	By certificate = By.xpath("//a[text()='Certificates ']");

	// Click on generate bulk
	By generateBulk = By.xpath("//a[text()='Generate Bulk ']");

	// select from dropdown
	By dropdown= By.xpath("//option[text()='MBA']/..");

	//upload pdf 
	//By upload_pdf= By.xpath("(//p[text()='Drag and drop a file here or click'])[1]");
	By upload_pdf= By.id("fileInput");
	By upload_csv=By.id("datafile");

	//checkbox & next button

	By checkbox1 =By.xpath("//input[@id='gen_mail_institution']");
	By nextButton =By.xpath("//input[@id='rcfrmsubmit']");




	public UserGenerateBulkByUploadCSVFileWithoutIssueMonthObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickOnCertificates() throws InterruptedException {
		WebElement tds = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT, POOLING_WAIT);
		tds.click();
		Thread.sleep(2000);
		testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificate).click();
		Thread.sleep(4000);
	}

	public void clickOnGenerateBulk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(generateBulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(generateBulk).click();
		Thread.sleep(5000);

	}

	// Locate dropdown
	public void clickOndropDown() throws InterruptedException {
		WebElement ele= Constants.driver.findElement(dropdown);
		ele.click();
		Thread.sleep(4000);
		Select s=new Select(ele);
		s.selectByVisibleText("BSC");
		Thread.sleep(4000);

	}

	public void files_upload() throws InterruptedException {
		WebElement fileInput = Constants.driver.findElement(upload_pdf);
		Thread.sleep(4000);
		String filePath = "D:\\\\For Automation Purpose\\\\Screenshot (21).jpg";
		Thread.sleep(4000);
		fileInput.sendKeys(filePath);

		WebElement csv = Constants.driver.findElement(upload_csv);
		Thread.sleep(4000);
		String csv1 = "D:\\For Automation Purpose\\data (8).csv";
		Thread.sleep(4000);
		csv.sendKeys(csv1);

	}
	
	public void next_button() throws InterruptedException {


		testbase.waitForElement(Constants.driver.findElement(checkbox1), TIMEOUT_WAIT, POOLING_WAIT);
		//Constants.driver.findElement(checkbox1).click();
		testbase.waitForElement(Constants.driver.findElement(nextButton), TIMEOUT_WAIT, POOLING_WAIT);
		//Constants.driver.findElement(nextButton).click();


	}

}
