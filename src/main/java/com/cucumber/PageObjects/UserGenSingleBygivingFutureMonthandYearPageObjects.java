package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGenSingleBygivingFutureMonthandYearPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	//click certificate and click the generate single1 
	By certificates= By.xpath("//a[text()='Certificates ']");
	By single= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[1]/a");
	By certtype= By.xpath("/html/body/div/app-root/app-generate-certificates/div/div/div/div/div[2]/div/div/div[2]/select/option[7]");

	//click Certificate type Dropdown1 Select Certificate Type1
	//By certtype= By.xpath("//select//option[5]");

	//fill the required fields1 
	By name= By.xpath("//input[@id='StudentName']");
	By mobile= By.xpath("//input[@id='studentMobile']");
	By email= By.xpath("//input[@id='StudentEmail']");
	By AcademicRef= By.xpath("//input[@id='academicReferenceNumber']");
	By CertName= By.xpath("/html/body/div/app-root/app-generate-certificates/div/div/div/div/div[2]/div/div/div[3]/div/div/form/div[1]/div[6]/div/select/option[2]");
	By upload= By.xpath("//input[@id='Uploadfile']");

	//Select issue month and issue year as future
	By IssueMonth= By.xpath("//div[7]//div[1]//select[1]//option[13]");
	By IssueYear= By.xpath("//div[8]//div[1]//select[1]//option[13]");



	//click on the next button
	By checkbox = By.name("gen_mail_institution");
	By next = By.xpath("//input[@class='btn btn-primary sw-btn-next']");
	By popup = By.xpath("//button[text()='Yes, Submit']");
	By ok = By.xpath("(//button[text()='No'])[2]");



	public UserGenSingleBygivingFutureMonthandYearPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickcertificateandclickthegeneratesingle1() throws InterruptedException {
		WebElement adminsetting = testbase.waitForElement(Constants.driver.findElement(certificates), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(adminsetting).build().perform();
		Thread.sleep(3000);

	}

	public void clickCertificatetypeDropdown1SelectCertificateType1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(single), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(single).click();
		Thread.sleep(3000);
		Constants.driver.findElement(certtype).click();

	}

	public void filltherequiredfields1() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(name), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(name).sendKeys("Ashok");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(mobile), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mobile).sendKeys("7519243890");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).sendKeys("saitejaswi.m@sapphirus.in");
		Thread.sleep(3000);


		testbase.waitForElement(Constants.driver.findElement(AcademicRef), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(AcademicRef).sendKeys("MST22");
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(CertName), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(CertName).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		String img= "C:\\Users\\admin\\Desktop\\Bulk Data\\loved-to-death-obooko-92.pdf";

		Constants.driver.findElement(upload);
		WebElement Upload= testbase.waitForElement(Constants.driver.findElement(upload), TIMEOUT_WAIT, POOLING_WAIT);
		Upload.sendKeys(img);
		Thread.sleep(2000);



	}

	public void Selectissuemonthandissueyearasfuture() throws InterruptedException {


		testbase.waitForElement(Constants.driver.findElement(IssueMonth), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueMonth).click();
		Thread.sleep(2000);

		testbase.waitForElement(Constants.driver.findElement(IssueYear), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IssueYear).click();
		Thread.sleep(2000);

	}



	public void Clicknextbutton() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(next), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(checkbox).click();
		Constants.driver.findElement(next).click();
		Thread.sleep(2000);
		Constants.driver.findElement(popup).click();
		Thread.sleep(2000);
		Constants.driver.findElement(ok).click();
	}	


}