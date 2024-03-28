package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;
import com.cucumber.utility.excelGeniricUtillity;

public class UserInternalPrintingByUploadingInvalidCSVFilePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;


	By CER = By.xpath("//a[text()='Certificates ']");
	By IP= By.xpath("//a[text()='Certificates ']/following-sibling::ul/li[4]/a");
    By CertificateType= By.xpath("//option[text()='Certificate Type']/..");
	By Upload = By.id("datafile");
	By Next = By.xpath("//input[@value='Next']");
	
	


	public UserInternalPrintingByUploadingInvalidCSVFilePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void i_navigate_to_the_Certificates_type_tab() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(CER), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void select_internal_printing_option() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(IP), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(IP).click();
		Thread.sleep(3000);
		

	}

	public void choose_the_Certificate_type() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(CertificateType), TIMEOUT_WAIT, POOLING_WAIT);
		Thread.sleep(4000);
		WebElement ee= Constants.driver.findElement(CertificateType);
		ee.click();
		Thread.sleep(4000);
		Select s1 = new Select(ee);
		s1.selectByVisibleText("BSC");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000);");
		
	}

	public void upload_a_CSV_file() throws Exception {
		WebElement fileInput = Constants.driver.findElement(Upload);
		Thread.sleep(4000);
		String filePath = "D:\\For Automation Purpose\\CSV1.csv";
		fileInput.sendKeys(filePath);
		Thread.sleep(4000);
		fileInput.clear();
		Thread.sleep(4000);
	}
	
	
	public void remove_the_uploaded_CSV_File() {
		
	}

//	public void user_click_on_the_Next_button() throws InterruptedException {
//		testbase.waitForElement(Constants.driver.findElement(Next), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(Next).click();
//		Thread.sleep(2000);

//	}


}