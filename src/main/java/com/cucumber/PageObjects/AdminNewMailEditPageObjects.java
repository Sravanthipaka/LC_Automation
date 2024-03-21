package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminNewMailEditPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click reports 
	By reports= By.xpath("//a[normalize-space()='Reports']");

	//Select by generated certificates
	By GeneratedCertfs= By.xpath("//a[normalize-space()='Generated Certificates']");


	//click the edit icon and Clear Student Email
	By icon= By.xpath("//tbody/tr[1]/td[7]/span[1]");
	By mail= By.xpath("//input[@placeholder='Enter new email']");
	//By ok = By.xpath("(//*[@type='button'])[3]");
	// Click on the certificate type dropdown
	By dropdown1 = By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']");

	//Select the certificate type
	By selectvalue = By.xpath("/html/body/div/app-root/app-generated-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/select/option[1]");


	//Enter New Email
	By enter= By.xpath("(//*[@class='text-center'])[3]");

	//Click the Save
	By save= By.xpath("//*[@id='example']/tbody/tr[1]/td[7]/button[1]");


	public AdminNewMailEditPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickreports() throws InterruptedException {
		WebElement report = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(report).build().perform();
		Thread.sleep(3000);

	}
	public void Selectbygeneratedcertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(GeneratedCertfs), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(GeneratedCertfs).click();
		Thread.sleep(3000);
		//Constants.driver.findElement(ok).click();
		Constants.driver.findElement(dropdown1).click();
		Constants.driver.findElement(selectvalue).click();
		Thread.sleep(3000);

	}

	public void clicktheediticonandClearStudentEmail() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(icon), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(icon).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).clear();
		//Thread.sleep(2000);
	}	

	public void EnterNewEmail() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).sendKeys("anusha.g@sapphirus.in");
		Thread.sleep(2000);
	}

	public void ClicktheSave() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(save), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(save).click();
		Thread.sleep(2000);
	}	


}