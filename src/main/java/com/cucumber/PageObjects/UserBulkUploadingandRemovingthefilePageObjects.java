package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cucumber.TestBase.TestBase;
import com.cucumber.managers.FileReaderManager;
import com.cucumber.utility.Constants;

public class UserBulkUploadingandRemovingthefilePageObjects
{
	WebDriver driver;
	TestBase testbase;

	By	c=By.xpath("//a[text()='Certificates ']");
	By	gbk=By.xpath("//a[text()='Generate Bulk ']");
	By	ce=By.xpath("//div[@class='card-body']/div/div/select");
	By	ch=By.xpath("//input[@type='checkbox']");
	By	sbmt=By.id("rcfrmsubmit");
	By	error=By.xpath("//span[text()='File size should be less than 2MB or equal to 2MB']");
	public UserBulkUploadingandRemovingthefilePageObjects(WebDriver driver)
	{
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonCertificate()
	{
		WebElement cr = Constants.driver.findElement(c);
		Actions act=new Actions(driver);
		act.moveToElement(cr).perform();
	}
	
	public void selectCertficate() throws InterruptedException
	
	{
		Constants.driver.findElement(gbk).click();
		Thread.sleep(1000);
		WebElement CertificateType = driver.findElement(ce);
		Select sc=new Select(CertificateType);
		sc.selectByVisibleText("Degree");
		Thread.sleep(3000);
	}
	
	public void checkCheckBox() throws Exception
	
	{
		Constants.driver.findElement(ch).click();
		Thread.sleep(2000);
		Constants.driver.findElement(sbmt).click();
	}
	
	public void verifytheErrormsg()
	
	{
		WebElement ErrorMsg = driver.findElement(error);
		Assert.assertEquals(true, ErrorMsg.isDisplayed());
	}
}


