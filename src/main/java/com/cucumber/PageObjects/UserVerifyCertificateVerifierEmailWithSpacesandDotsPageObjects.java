package com.cucumber.PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;
import com.cucumber.utility.excelGeniricUtillity;

public class UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	By CerNav=By.xpath("(//a[@class='sub-icon'])[2]");
	By VerCer=By.xpath("//a[text()='Verify Certificate ']");
	By CertificateType= By.xpath("//option[@value='Auto']");
	//By OK=By.xpath("//button[text()='Ok']");

	By SName=By.id("StudentName");
	By SEmail=By.id("StudentEmail");
	By SMobile=By.id("studentMobile");
	By SRef=By.id("academicReferenceNumber");

	By CName=By.xpath("(//select[contains(@class,'form-control')])[2]");
	By Smonth=By.xpath("(//select[contains(@class,'form-control')])[3]");
	By SYear=By.xpath("//*[@id='myForm']/div[2]/div[8]/div/select");

	By VName=By.xpath("//input[@name='VerifierName']");
	By VEmail=By.id("VerifierEmail");
	By VMobile=By.xpath("//input[@name='VerifierMobile']");
	By Next=By.xpath("//button[text()='Next']");

	public UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void navigate_to_certificates() throws Exception
	
	{
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CerNav), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}
	
	public void click_on_Verify_certificate()
	
	{
		testbase.waitForElement(Constants.driver.findElement(VerCer), TIMEOUT_WAIT, POOLING_WAIT);	
		Constants.driver.findElement(VerCer).click();
		//Constants.driver.findElement(OK).click();


	}
	
	public void select_certificate_Type() throws InterruptedException {
		WebElement ee= Constants.driver.findElement(CertificateType);
		ee.click();
		Thread.sleep(4000);
		Select s1 = new Select(ee);
		s1.selectByVisibleText("Auto");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");
	}

	public void enter_Student_details() throws Exception
	
	{
		testbase.waitForElement(Constants.driver.findElement(CertificateType), TIMEOUT_WAIT, POOLING_WAIT);	


		excelGeniricUtillity ex = new excelGeniricUtillity();
		String StudentName1 = ex.getDataFromExcel("User", 9, 0);
		String StudentEmail1 = ex.getDataFromExcel("User", 9, 1);
		String studentMobile1 = ex.getDataFromExcel("User", 9, 2);
		String academicReferenceNumber1 = ex.getDataFromExcel("User", 9, 3);
		String SelectCertificationName1  = ex.getDataFromExcel("User", 9, 4);
		String IssueMonth1 = ex.getDataFromExcel("User", 9, 5);
		String IssueYear1 = ex.getDataFromExcel("User", 9, 6);

		Thread.sleep(2000);
		Constants.driver.findElement(SName).sendKeys(StudentName1);
		Thread.sleep(2000);
		Constants.driver.findElement(SEmail).sendKeys(StudentEmail1);
		Thread.sleep(2000);
		Constants.driver.findElement(SMobile).sendKeys(studentMobile1);
		Thread.sleep(2000);
		Constants.driver.findElement(SRef).sendKeys(academicReferenceNumber1);
		Thread.sleep(2000);
		Constants.driver.findElement(CName).sendKeys(SelectCertificationName1);
		Thread.sleep(2000);
		Constants.driver.findElement(Smonth).sendKeys(IssueMonth1);
		Thread.sleep(2000);
		Constants.driver.findElement(SYear).sendKeys(IssueYear1);
		Thread.sleep(2000);

	}
	
	public void enter_Verifier_details() {
		Constants.driver.findElement(VName).sendKeys("dwe");
		Constants.driver.findElement(VEmail).sendKeys("    .....");
		Constants.driver.findElement(VMobile).sendKeys("9798989877");
	}
	
	public void click_on_Next() throws InterruptedException {
		Thread.sleep(3000);
		Constants.driver.findElement(Next).click();
	}

}
