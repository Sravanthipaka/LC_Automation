package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminCertificateTypePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Then click by Institutions dropdown
	By Institutions= By.xpath("//a[normalize-space()='Institutions']");

	//Then select the Certificate Types
	By CertTypes= By.xpath("//a[normalize-space()='Certificate Types']");

	//Then click on the Certificate Type 
	By CertType= By.xpath("//a[normalize-space()='MBA']");

	//	//Then edit the fields 
	//	//	By edit=By.xpath("(//*[@type='number'])[1]");
	//	//By edit= By.xpath("(//*[@type='checkbox'])[2]");
	//
	//	//Then click on GO
	//	By go=By.xpath("//*[@value='Update']");

	//click on the Type dropdown and select the option
	By dropdown = By.xpath("/html/body/div/app-root/app-certificate-type-name/div/div/div[2]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/select");

	//click on Create button
	By go = By.xpath("//*[@type='button']");
	By checkbox = By.xpath("(//*[@type='checkbox'])[184]");
	By save = By.xpath("//*[@class='btn btn-primary btn-save']");

	// Click on ok button
	By ok = By.xpath("//button[normalize-space()='Ok']");



	public AdminCertificateTypePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickbyInstitutionsdropdown() throws InterruptedException {
		WebElement institution = testbase.waitForElement(Constants.driver.findElement(Institutions), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(institution).build().perform();
		Thread.sleep(3000);

	}
	public void selecttheCertificateTypes() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertTypes), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(CertTypes).click();
		Thread.sleep(3000);

	}

	public void clickontheCertificateType() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertType), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(CertType).click();
		Thread.sleep(2000);
	}	

	public void editthefields() throws InterruptedException {
		//testbase.waitForElement(Constants.driver.findElement(edit), TIMEOUT_WAIT, POOLING_WAIT);
		//Constants.driver.findElement(edit).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("/html/body/div/app-root/app-certificate-type-name/div/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td[5]/select/option[2]")).click();
		//Thread.sleep(2000);

		Constants.driver.findElement(dropdown).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div/app-root/app-certificate-type-name/div/div/div[2]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/select")).click();
		//Thread.sleep(2000);
		
	    JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}	

	public void clickonGO() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(go).click();
		Constants.driver.findElement(checkbox).click();
		Constants.driver.findElement(save).click();
		Thread.sleep(2000);
		
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();


	}	
}