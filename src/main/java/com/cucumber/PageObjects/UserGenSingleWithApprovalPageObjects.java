package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenSingleWithApprovalPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//Then click the adminsettings dropdown1
	By adminsettings= By.xpath("//a[@class='sub-icon'][normalize-space()='Settings']");

	//Then select on settings1 
	By settings= By.xpath("//a[@href='settings']");

	//Then click by Approval checkbox1
	By checkbox= By.xpath("//input[@id='approval_single_generation']");

	//Then  click the Submit1
	By submit=By.xpath("//input[@value='Submit']");
	By ok= By.xpath("//button[normalize-space()='Ok']");

	//Then click of signout1
	By signout= By.xpath("//a[normalize-space()='Signout']");

	//Then login the user details1
	By username= By.xpath("//input[@placeholder='User Login']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//input[@value='Login']");

	//Then click with certificate dropdown1
	By certificate= By.xpath("//a[normalize-space()='Certificates']");

	//Then select the Single Generation1
	By single= By.xpath("//a[normalize-space()='Generate single']");

	//Then click of Certificate type1
	By certtype= By.xpath("/html/body/div/app-root/app-generate-certificates/div/div/div/div/div[2]/div/div/div[2]/select/option[7]");

	//Then Enter the input fields1
	By name= By.xpath("//input[@id='StudentName']");
	By mobile= By.xpath("//input[@id='studentMobile']");
	By IssueMonth= By.xpath("//div[7]//div[1]//select[1]//option[9]");
	By email= By.xpath("//input[@id='StudentEmail']");
	By AcademicRef= By.xpath("//input[@id='academicReferenceNumber']");
	By CertName= By.xpath("(//select)[2]//option[5]");
	By IssueYear= By.xpath("//div[8]//div[1]//select[1]//option[8]");
	By upload= By.xpath("//input[@id='Uploadfile']");


	//Then click on single approval1
	By checkbox1= By.xpath("//input[@id='gen_mail_institution']");
	By singleApproval= By.xpath("//*[@value='Single Approval']");
	By submit1= By.xpath("(//*[@type='button'])[2]");
	By ok1= By.xpath("//button[normalize-space()='Ok']");

	public UserGenSingleWithApprovalPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clicktheadminsettingsdropdown1() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(adminsettings), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(3000);

	}
	public void selectonsettings1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(settings), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(settings).click();
		Thread.sleep(3000);

	}

	public void clicktheApprovalcheckbox1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(checkbox), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Thread.sleep(2000);

	}	

	public void clicktheSubmit1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(2000);

		Constants.driver.findElement(ok).click();
		Thread.sleep(2000);
	}

	public void clickofsignout1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(signout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(signout).click();
		Thread.sleep(2000);
	}	


	public void logintheuserdetails1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(username), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(username).sendKeys("SahUser");
		Thread.sleep(2000);

		Constants.driver.findElement(password).sendKeys("User@1");
		Thread.sleep(2000);

		Constants.driver.findElement(login).click();
		Thread.sleep(2000);
	}	

	public void clickwithcertificatedropdown1() throws InterruptedException {
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

	public void clickofCertificatetype1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certtype), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certtype).click();
		Thread.sleep(2000);

	}

	public void Entertheinputfields1() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("ShreyasIyer");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mobile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).sendKeys("7569143890");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueMonth), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueMonth).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).sendKeys("saitejaswi.m@sapphirus.in");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(AcademicRef), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(AcademicRef).sendKeys("MST21");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(CertName), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(CertName).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueYear), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueYear).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		String img= "C:\\Users\\admin\\Desktop\\BULK Data (2-28-24)\\marina-obooko (4)-67.pdf";

		Constants.driver.findElement(upload);
		WebElement Upload= testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		Upload.sendKeys(img);
		Thread.sleep(2000);
	}

	public void clickonsingleapproval1() throws InterruptedException {
		
		testbase.waitForElement(Constants.driver.findElement(checkbox1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox1).click();
		Thread.sleep(3000);
		
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
}