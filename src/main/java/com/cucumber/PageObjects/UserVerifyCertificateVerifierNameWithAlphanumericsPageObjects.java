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

public class UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	By CER = By.xpath("//a[text()='Certificates ']");
	By BGC= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[3]/a");
	By OK = By.xpath("//button[text()='Ok']");
	By CertificateType= By.xpath("//option[text()='Select Certificate Type']/..");
	By StudentName = By.id("StudentName");
	By StudentEmail = By.id("StudentEmail");
	By studentMobile = By.id("studentMobile");
	By academicReferenceNumber = By.id("academicReferenceNumber");
	By CertificationName =  By.xpath("//option[text()='Select Certification Name ']/..");
	By IssueMonth = By.xpath("//option[text()='Issue Month']/..");
	By IssueYear = By.xpath("//option[text()='Issue Year']/..");
	By VerifierName = By.xpath("//input[@id='VerifierName']");
	By VerifierEmail = 	By.xpath("//input[@id='VerifierEmail']");	
	By VerifierMobile = By.xpath("//input[@id='VerifierMobile']");
	By Next = By.xpath("//button[text()='Next']");
	
	
	


	public UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void i_navigate_to_Certificates_type_tab() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CER), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void select_verified_certificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(BGC), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(BGC).click();
		Thread.sleep(3000);
		driver.findElement(OK).click();
		Thread.sleep(3000);

	}

	public void choose_the_Certificate() throws InterruptedException {
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


	public void fill_in_the_Student_Details() throws Exception {
		Thread.sleep(4000);
		testbase.waitForElement(Constants.driver.findElement(StudentName), TIMEOUT_WAIT, POOLING_WAIT);
		Thread.sleep(4000);
		excelGeniricUtillity ex = new excelGeniricUtillity();
		String StudentName1 = ex.getDataFromExcel("User", 13, 0);
		String StudentEmail1 = ex.getDataFromExcel("User", 13, 1);
		String studentMobile1 = ex.getDataFromExcel("User", 13, 2);
		String academicReferenceNumber1 = ex.getDataFromExcel("User", 13, 3);
		String SelectCertificationName1  = ex.getDataFromExcel("User", 13, 4);
		String IssueMonth1 = ex.getDataFromExcel("User", 13, 5);
		String IssueYear1 = ex.getDataFromExcel("User", 13, 6);

		Thread.sleep(2000);
		Constants.driver.findElement(StudentName).sendKeys(StudentName1);
		Thread.sleep(2000);
		Constants.driver.findElement(StudentEmail).sendKeys(StudentEmail1);
		Thread.sleep(2000);
		Constants.driver.findElement(studentMobile).sendKeys(studentMobile1);
		Thread.sleep(2000);
		Constants.driver.findElement(academicReferenceNumber).sendKeys(academicReferenceNumber1);
		Thread.sleep(2000);
		Constants.driver.findElement(CertificationName).sendKeys(SelectCertificationName1);
		Thread.sleep(2000);
		Constants.driver.findElement(IssueMonth).sendKeys(IssueMonth1);
		Thread.sleep(2000);
		Constants.driver.findElement(IssueYear).sendKeys(IssueYear1);
		Thread.sleep(2000);

	}

	public void input_alphanumeric_characters_in_the_Verifier_name_field() throws Exception {

		excelGeniricUtillity ex = new excelGeniricUtillity();
		String VerifierName1 = ex.getDataFromExcel("User", 13, 7);
		String VerifierEmail1 = ex.getDataFromExcel("User", 13, 8);
		String VerifierMobile1 = ex.getDataFromExcel("User", 13, 9);

		Thread.sleep(2000);
		Constants.driver.findElement(VerifierName).sendKeys(VerifierName1);
		Thread.sleep(2000);
		Constants.driver.findElement(VerifierEmail).sendKeys(VerifierEmail1);
		Thread.sleep(2000);
		Constants.driver.findElement(VerifierMobile).sendKeys(VerifierMobile1);
		Thread.sleep(2000);

	}

	public void click_Next_Button() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(Next), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(Next).click();
		Thread.sleep(2000);

	}


}
