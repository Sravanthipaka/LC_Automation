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

public class UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click certificates
	By certificate = By.xpath("//a[normalize-space()='Certificates']");

	//click Verify Certificates 
	By verify = By.xpath("//a[text()='Verify Certificate ']");

	//select certificate type1
	By certificatetype = By.xpath("//option[@value='Auto']");

	//fill all input fields then click on next button
	By name = By.id("StudentName");
	By email = By.id("StudentEmail");
	By mobile = By.id("studentMobile");
	By issuemonth= By.xpath("//*[@id=\"myForm\"]/div[2]/div[6]/div/select/option[9]");
	By issueyear= By.xpath("//*[@id=\"myForm\"]/div[2]/div[7]/div/select/option[11]");
	By verifiername = By.xpath("//input[@name=\"VerifierName\"]");
	By verifieremail = By.xpath("//input[@name=\"VerifierEmail\"]");
	By verifiermobile = By.xpath("//input[@name=\"VerifierMobile\"]");
	By next = By.xpath("//button[text()='Next']");




	public UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickcertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificate).click();
		Thread.sleep(2000);

	}

	public void clickVerifyCertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verify), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verify).click();
		Thread.sleep(2000);

	}

	public void selectcertificatetype1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificatetype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificatetype).click();
		Thread.sleep(2000);

	}

	public void fillallinputfieldsthenclickonnextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("Anusha");
		Constants.driver.findElement(email).sendKeys("mahidarreddy1111@gmail.com");
		Constants.driver.findElement(mobile).sendKeys("637644744377");
		Thread.sleep(2000);

		Select s=new Select(driver.findElement(By.xpath("(//select[contains(@class,'form-control')])[2]")));
		s.selectByValue("OD");
		Thread.sleep(2000);
		Constants.driver.findElement(issuemonth).click();
		Constants.driver.findElement(issueyear).click();


		Constants.driver.findElement(verifiername).sendKeys("anusha");
		Constants.driver.findElement(verifieremail).sendKeys("anusha@gmail.com");
		Constants.driver.findElement(verifiermobile).sendKeys("9912908023");
		Thread.sleep(3000);
		Constants.driver.findElement(next).click();
		Thread.sleep(1000);

	}

}