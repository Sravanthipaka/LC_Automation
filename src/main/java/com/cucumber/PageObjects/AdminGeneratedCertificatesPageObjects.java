

package com.cucumber.PageObjects;

import java.time.Duration;
import java.util.List;

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
import org.openqa.selenium.UnsupportedCommandException;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminGeneratedCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click the Reports option
	By report = By.xpath("//a[normalize-space()='Reports']");

	// Click on Generated Certificates
	By generate = By.xpath("//a[normalize-space()='Generated Certificates']");

	// Click on the pop up mssage
	By ok3 = By.xpath("//button[normalize-space()='Ok']");

	// Click on the certificate type dropdown
	By dropdown1 = By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']");

	//Select the certificate type
	By selectvalue = By.xpath("/html/body/div/app-root/app-generated-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/select/option[1]");

	// click on the View Generated Certificate Text
	By popup = By.xpath("//h3[@class='mb-0 card-title']");

	// click on Student Name field
	By student = By.xpath("//input[@placeholder='student Name']");

	// click the Send mail icon 
	By mail = By.xpath("//i[@class='fa fa-envelope-o mx-2']");

	// click on Ok 
	By ok1 = By.xpath("//button[normalize-space()='Ok']");

	// click on Revoke icon 
	By revoke = By.xpath("//i[@class='fa fa-undo mx-2']");

	// click on Ok
	By ok = By.xpath("//button[normalize-space()='Ok']");

	// click the Download Original Certificate icon
	By source = By.xpath("//tbody/tr[1]/td[9]/a[3]/i[1]");

	// click the Download QR Code icon
	By key = By.xpath("//tbody/tr[1]/td[9]/a[4]/i[1]");

	// click on Header checkbox
	By checkbox = By.xpath("//*[@id='rowid']");

	// click on Action Dropdown
	By dropdown = By.xpath("//select[@id='bulk_action']");

	// Click on Go button
	By go = By.xpath("//input[@value='Go']");

	// Click on Send Mail Ok button
	By ok2 =By.xpath("//button[normalize-space()='Ok']");

	//click by sign out page
	By signout = By.xpath("//a[text()='Signout']");


	public AdminGeneratedCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void clicktheReportsoption() throws InterruptedException {
		WebElement inst = testbase.waitForElement(Constants.driver.findElement(report), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(inst).build().perform();
		Thread.sleep(3000);

	}

	public void clickOnGeneratedCertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(generate), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(generate).click();
		Thread.sleep(3000);

		testbase.waitForElement(Constants.driver.findElement(ok3), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok3).click();
		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(dropdown1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown1).click();
		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(selectvalue), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(selectvalue).click();
		Thread.sleep(1000);

		testbase.waitForElement(Constants.driver.findElement(popup), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(popup).click();

	}

	public void ClickonStudentName() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(student), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(student).sendKeys("shiva");
		Thread.sleep(2000);


		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//input[@value='Export CSV']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
	}
	public void clickthesendmailiconandclickonOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).click();
		Constants.driver.findElement(ok1).click();
		Thread.sleep(4000);

	}
	public void clickonRevokeiconandclickonOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(revoke), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(revoke).click();
		Constants.driver.findElement(ok).click();
		Thread.sleep(4000);


	}
	public void clickthedownloadsourcefileiconandclickonOK() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(source), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(source).click();
		Thread.sleep(4000);

	}

	public void clickthedownloadkeyfileiconandclickonOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(key), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(key).click();
		Thread.sleep(4000);

	}

	public void clickonHeadercheckbox() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Thread.sleep(2000);
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//select[@id='bulk_action']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}
	public void clickonActiondropdown() throws InterruptedException {
		WebElement drop = testbase.waitForElement(Constants.driver.findElement(dropdown), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@name='bulk_action']//option[2]")).click();
		Thread.sleep(3000);


	}
	public void selectsendmailandclickonGobutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(go).click();
		Thread.sleep(3000);
	}

	public void clickonOkbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok2).click();
		Thread.sleep(2000);


	}
	public void ClickbySignoutpage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(3000);
	}
}
