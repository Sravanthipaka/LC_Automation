package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminVerifiedCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on Reports Tab
	By reports = By.xpath("//a[normalize-space()='Reports']");
	// click on Verified Certificates
	By verifiedcertificates = By.xpath("//a[normalize-space()='Verified Certificates']");
	// Click on SendMail icon
	By sendmailicon = By.xpath("(//*[@title='Send Mail'])[1]");
	// Click on Ok button
	By OK = By.xpath("(//*[@type='button'])[3]");
	// Click on Download sourcefile icon
	By downloadsorcefile = By.xpath("(//*[@title='Download Original Certificte'])[1]");
	// Click on Download keyfile icon
	By downloadkeyfile = By.xpath("(//*[@title='Download QR Code'])[1]");
	// click on header check box
	By studentheader = By.xpath("(//*[@id='rowid'])[1]");
	// click on action dropdown
	By drop = By.xpath("//*[@name='bulk_action']");
	// Click on sendmail option
	By Sentmailinactions = By.xpath("//option[text()='Send Mail']");  
	// click on Go button
	By go = By.xpath("//*[@type='button']");
	// click on ok button
	By ok1 = By.xpath("(//*[@type='button'])[3]");
	

	public AdminVerifiedCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickonReportstab() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void clickOnVerifiedCertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verifiedcertificates), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verifiedcertificates).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//th[normalize-space()='Actions']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/app-root/app-verified-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div/select/option[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[@class='mb-0 card-title']")).click();
		Thread.sleep(1000);
	}

	public void clickOnSendMailicon() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(sendmailicon), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(sendmailicon).click();
		Thread.sleep(3000);
	}

	public void ClickonOkbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(OK), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(OK).click();
		Thread.sleep(3000);

//		JavascriptExecutor jse1=(JavascriptExecutor) driver;
//
//		WebElement Action=driver.findElement(By.xpath("//li[@class='pagination-next']//a[1]"));
//
//		jse1.executeScript("arguments[0].scrollIntoView();",Action);
//		Thread.sleep(3000);
//		
//
//		JavascriptExecutor jse2=(JavascriptExecutor) driver;
//
//		WebElement Actions=driver.findElement(By.xpath("//th[normalize-space()='Actions']"));
//
//		jse1.executeScript("arguments[0].scrollIntoView();",Actions);
//		Thread.sleep(3000);
	}

	
   public void clickOnDownloadSourceFileicon() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(downloadsorcefile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(downloadsorcefile).click();
		Thread.sleep(3000);
	}

	public void clickOnDownloadKeyFileicon() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(downloadkeyfile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(downloadkeyfile).click();
		Thread.sleep(3000);
	}

	public void studentheader() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(studentheader), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(studentheader).click();
		Thread.sleep(2000);
		// scroll down a page
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

	}

	public void bulkDrop() throws InterruptedException {
		WebElement dropdown = testbase.waitForElement(Constants.driver.findElement(drop), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(drop).click();
		Thread.sleep(2000);
		Select select = new Select(dropdown);
		select.selectByValue("1");
		Thread.sleep(2000);
	}
	public void sendmailinactions() throws InterruptedException {
	testbase.waitForElement(Constants.driver.findElement(Sentmailinactions), TIMEOUT_WAIT, POOLING_WAIT);
	Constants.driver.findElement(Sentmailinactions).click();
	Thread.sleep(5000);
	}

	public void clickonGoandOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(go).click();
		Thread.sleep(3000);
//		testbase.waitForElement(Constants.driver.findElement(ok1), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(ok1).click();
//		Thread.sleep(1000);

	}
}
