package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminAddCertificateTypePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on the Certificates
	By certificate = By.xpath("//a[normalize-space()='Certificates']");
	
	//click on the Add Certificate Type 
	By add = By.xpath("//a[normalize-space()='Add certificate type']");
	
	//enter the certificate type into field
	By certificatetype = By.xpath("//input[@id='CertificateType']");
	By discription = By.xpath("//*[@id='description']");
	
	//click on the Type dropdown and select the option
	By dropdown = By.xpath("/html/body/div/app-root/app-certificate-type-name/div/div/div[2]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/select");
	
	//click on Create button
	By go = By.xpath("//*[@type='button']");
	By checkbox = By.xpath("(//*[@type='checkbox'])[184]");
	By save = By.xpath("//*[@class='btn btn-primary btn-save']");
	
	// Click on ok button
	By ok = By.xpath("//button[normalize-space()='Ok']");

	
   public AdminAddCertificateTypePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
   
   public void clickontheCertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificate).click();
		Thread.sleep(2000);
	
	}

	public void clickontheAddCertificateType () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(add), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(add).click();
		Thread.sleep(2000);

	}
	
	public void enterthecertificatetypeintofield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certificatetype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certificatetype).sendKeys("Auto");
		Constants.driver.findElement(discription).sendKeys("AA");
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,100)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);


	}
		
	 public void clickontheTypedropdownandselecttheoption() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(dropdown), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/app-root/app-certificate-type-name/div/div/div[2]/div/div/div[2]/div[3]/table/tbody/tr[1]/td[5]/select")).click();
		Thread.sleep(2000);
		
	    JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
}
	 
	 public void clickonGobutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(go).click();
		Constants.driver.findElement(checkbox).click();
		Constants.driver.findElement(save).click();
		Thread.sleep(2000);
		
		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		
	 } 
}