package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminCertificateApprovals1PageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//click on the Adminsettings Dropdown
	By adminsettings= By.xpath("//a[@class='sub-icon'][normalize-space()='Settings']");

	//select Settings 
	By settings= By.xpath("//a[@href='settings']");

	//click as approval checkbox
	By checkbox= By.xpath("//input[@id='approval_single_generation']");

	//click submit button
	By submit=By.xpath("//input[@value='Submit']");
	By ok= By.xpath("//button[normalize-space()='Ok']");

	//click signout option
	By signout= By.xpath("//a[normalize-space()='Signout']");

	//login the user details
	By username= By.xpath("//input[@placeholder='User Login']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//input[@value='Login']");

	//click certificate dropdown
	By certificate= By.xpath("//a[normalize-space()='Certificates']");

	//select the Single Generation
	By single= By.xpath("//a[normalize-space()='Generate single']");

	//click of Certificate type
	By certtype= By.xpath("//select//option[5]");

	//Enter the input fields
	By name= By.xpath("//input[@id='StudentName']");
	By mobile= By.xpath("//input[@id='studentMobile']");
	By IssueMonth= By.xpath("//div[7]//div[1]//select[1]//option[9]");
	By email= By.xpath("//input[@id='StudentEmail']");
	By AcademicRef= By.xpath("//input[@id='academicReferenceNumber']");
	By CertName= By.xpath("(//select)[2]//option[5]");
	By IssueYear= By.xpath("//div[8]//div[1]//select[1]//option[8]");
	By upload= By.xpath("//input[@id='Uploadfile']");


	//click on single approval
	By checkbox1= By.xpath("//input[@id='gen_mail_institution']");
	By singleApproval= By.xpath("//*[@value='Single Approval']");
	By submit1= By.xpath("(//*[@type='button'])[2]");
	By ok1= By.xpath("//button[normalize-space()='Ok']");
	
	//login the Admin details
	By username1= By.xpath("//input[@placeholder='User Login']");
	By password1= By.xpath("//input[@placeholder='Password']");
	By login1= By.xpath("//input[@value='Login']");
	
	//click on the certificates and click on the single approval radio button
	By certificates= By.xpath("//a[normalize-space()='Certificates']");
	By approvals = By.xpath("//a[normalize-space()='Approvals']");
	By radiobutton= By.xpath("//label[normalize-space()='Single Approval']//input[@name='sh']");



	public AdminCertificateApprovals1PageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheadminsettingsdropdown() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(adminsettings), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(3000);

	}
	public void selectonsettings() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(settings), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(settings).click();
		Thread.sleep(3000);

	}

	public void clickbyApprovalcheckbox() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Thread.sleep(2000);

	}	

	public void clicktheSubmit() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(2000);

		Constants.driver.findElement(ok).click();
		Thread.sleep(2000);
	}

	public void clickofsignout() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(2000);
	}	


	public void logintheuserdetails() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(username), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(username).sendKeys("TestUser");
		Thread.sleep(2000);

		Constants.driver.findElement(password).sendKeys("Admin@1");
		Thread.sleep(2000);

		Constants.driver.findElement(login).click();
		Thread.sleep(2000);
	}	

	public void clickwithcertificatedropdown() throws InterruptedException {
		WebElement dd = testbase.waitForElement(Constants.driver.findElement(certificate), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(dd).build().perform();
		Thread.sleep(3000);

	}

	public void selecttheSingleGeneration1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(single), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(single).click();
		Thread.sleep(2000);
	}

	public void clickofCertificatetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certtype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certtype).click();
		Thread.sleep(2000);

	}

	public void Entertheinputfields() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("Ashok");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mobile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).sendKeys("7519243890");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueMonth), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueMonth).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).sendKeys("saitejaswi.m@sapphirus.in");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(AcademicRef), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(AcademicRef).sendKeys("MST22");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(CertName), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(CertName).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueYear), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueYear).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		String img= "C:\\Users\\admin\\Desktop\\Bulk Data\\loved-to-death-obooko-92.pdf";

		Constants.driver.findElement(upload);
		WebElement Upload= testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		Upload.sendKeys(img);
		Thread.sleep(2000);
	}

	public void clickonsingleapproval() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(checkbox1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox1).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);

		testbase.waitForElement(Constants.driver.findElement(singleApproval), TIMEOUT_WAIT, POOLING_WAIT);
		/*WebElement element = driver.findElement(By.xpath("//*[@value='Single Approval']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); */
		Constants.driver.findElement(singleApproval).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(submit1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit1).click();
		Thread.sleep(3000);

		testbase.waitForElement(Constants.driver.findElement(ok1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(ok1).click();

	}
	
	public void logintheAdmindetails() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(username1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(username1).sendKeys("TestUser");
		Thread.sleep(2000);

		Constants.driver.findElement(password1).sendKeys("Admin@1");
		Thread.sleep(2000);

		Constants.driver.findElement(login1).click();
		Thread.sleep(2000);
	}
	
	public void clickonthecertificatesandApprovalsthenclickonthesingleapprovalradiobutton() throws InterruptedException {
		
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(3000);
		Constants.driver.findElement(approvals).click();
		Thread.sleep(2000);
		Constants.driver.findElement(radiobutton).click();

   }
}