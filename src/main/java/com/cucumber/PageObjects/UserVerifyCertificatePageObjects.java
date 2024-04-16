package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

import dev.failsafe.internal.util.Assert;
import io.cucumber.messages.types.Duration;

public class UserVerifyCertificatePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on the certificates
	By certificate = By.xpath("//a[normalize-space()='Certificates']");

	//click the Verify Certificates option
	By verify = By.xpath("//a[@href='certificate-verification']");

	//Select the certificate type
	By certificatetype = By.xpath("//option[@value='Auto']");

	//fill all the input fields and click on Next button
	By name = By.id("StudentName");
	By email = By.id("StudentEmail");
	By mobile = By.id("studentMobile");
	By ref = By.id("academicReferenceNumber");
	
	By issuemonth= By.xpath("//*[@id=\"myForm\"]/div[2]/div[6]/div/select/option[9]");
	By issueyear= By.xpath("//*[@id=\"myForm\"]/div[2]/div[7]/div/select/option[11]");
	
	By verifiername = By.xpath("//input[@name=\"VerifierName\"]");
	By verifieremail = By.xpath("//input[@name=\"VerifierEmail\"]");
	By verifiermobile = By.xpath("//input[@name=\"VerifierMobile\"]");
	By next = By.xpath("//button[text()='Next']");
	By button = By.xpath("//button[text()='Yes, Submit']");

	//upload original certificate and QR Code 
	//By go = By.xpath("//input[@value='Go']");

	 //click on Next button
	  By ok = By.xpath("//button[@type='submit']");


	public UserVerifyCertificatePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonthecertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificate).click();
		Thread.sleep(2000);

	}

	public void clicktheVerifyCertificatesoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verify), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verify).click();
		Thread.sleep(2000);

	}

	public void Selectthecertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificatetype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificatetype).click();
		Thread.sleep(2000);

	}

	public void fillalltheinputfieldsandclickonNextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("Anusha");
		Thread.sleep(2000);
		Constants.driver.findElement(email).sendKeys("anusha.g@sapphirus.in");
		Constants.driver.findElement(mobile).sendKeys("917876476372");
		Constants.driver.findElement(ref).sendKeys("MR12");
		Thread.sleep(2000);

		Select s=new Select(driver.findElement(By.xpath("(//select[contains(@class,'form-control')])[2]")));
		s.selectByValue("OD");
		Thread.sleep(2000);
		Constants.driver.findElement(issuemonth).click();
		Constants.driver.findElement(issueyear).click();
		
//		Select s1=new Select(driver.findElement(By.xpath("(//select[contains(@class,'form-control')])[8]")));
//		s1.selectByValue("August");
//		Thread.sleep(2000);
//		Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"myForm\"]/div[2]/div[8]/div/select")));
//		s2.selectByVisibleText("8");

		Constants.driver.findElement(verifiername).sendKeys("anusha");
		Constants.driver.findElement(verifieremail).sendKeys("anusha@gmail.com");
		Constants.driver.findElement(verifiermobile).sendKeys("9912908023");
		Constants.driver.findElement(next).click();
		Constants.driver.findElement(button).click();
	}



	public void uploadoriginalcertificateandQRCode () throws InterruptedException {
		driver.findElement(By.id("fileInput")).sendKeys("D:\\For Automation Purpose\\marina-obooko (4)-40 (1).pdf");
		driver.findElement(By.id("fileInput1")).sendKeys("D:\\For Automation Purpose\\08 (6).png");
		Thread.sleep(2000);
	}

	public void clickonNextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(4000);
	}
	
}