package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenerateBulkWithApprovalPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click the adminsettings dropdown
	By adminsetting= By.xpath("//a[@class='sub-icon'][normalize-space()='Settings']");

	//select settings 
	By setting= By.xpath("//a[@href='settings']");

	//click Approval checkbox
	By checkbox= By.xpath("//input[@id='approval_bulk_generation']");

	//Scroll down and click submit
	By submit=By.xpath("//input[@value='Submit']");
	By ok= By.xpath("//button[normalize-space()='Ok']");

	//Click the Signout
	By signout= By.xpath("//a[normalize-space()='Signout']");

	//login with user details
	By username= By.xpath("//input[@placeholder='User Login']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//input[@value='Login']");

	//click the Certificate Dropdown
	By certificate= By.xpath("//a[normalize-space()='Certificates']");

	//select bulk generation
	By bulk= By.xpath("//a[normalize-space()='Generate Bulk']");

	//click on Certificate type
	By certtype= By.xpath("//option[text()='Auto']");

	//Upload pdf Files
	//By original= By.xpath("//*[@id=\"verificationfrm1\"]/div[1]/div[1]/div/div/div[3]/ul");

	//Upload Data Files
	//By csv= By.xpath("//*[@id='datafile']");






	public UserGenerateBulkWithApprovalPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheadminsettingsdropdown() throws InterruptedException {
		WebElement admsettings = testbase.waitForElement(Constants.driver.findElement(adminsetting), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(admsettings).build().perform();
		Thread.sleep(3000);

	}
	public void selectsettings() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(setting), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(setting).click();
		Thread.sleep(3000);

	}

	public void clickApprovalcheckbox() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();

		WebElement checkbox = driver.findElement(By.id("approval_bulk_generation"));
		boolean isChecked = checkbox.isSelected();
		if(isChecked=false) {
			checkbox.click();
		}

		Thread.sleep(2000);
	}	

	public void Scrolldownandclicksubmit() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok).click();
		Thread.sleep(2000);
		
	}	

	public void ClicktheSignout() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(2000);

	}	

	public void loginwithuserdetails() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(username), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(username).sendKeys("SahUser");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(password), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(password).sendKeys("User@1");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(login), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(login).click();
		Thread.sleep(2000);
	}

	public void clicktheCertificateDropdown() throws InterruptedException {
		WebElement certificates = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(certificates).build().perform();
		Thread.sleep(3000);
	}

	public void selectbulkgeneration() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(bulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(bulk).click();
		Thread.sleep(2000);
	}

	public void clickonCertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certtype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certtype).click();
		Thread.sleep(2000);
		//
		//		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		//
		//		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));
		//
		//		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		//		Thread.sleep(3000);
	}

	public void UploadpdfFiles() throws InterruptedException {

		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\admin\\Desktop\\Bulk data-(26-Mar-24)\\important-linux-commands-you-should-know-obooko-41.pdf");

	}

	public void UploadDataFiles() throws InterruptedException {
		driver.findElement(By.id("datafile")).sendKeys("D:\\For Automation Purpose\\data (56).csv");
		driver.findElement(By.xpath("//input[@name='gen_mail_institution']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rcfrmsubmit")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("rcfrmsubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(3000);

	}

}