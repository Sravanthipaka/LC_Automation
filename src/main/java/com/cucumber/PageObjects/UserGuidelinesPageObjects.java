package com.cucumber.PageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGuidelinesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click on certificates1 dropdown
	By certs1= By.xpath("//a[normalize-space()='Certificates']");

	//select the Generate single
	By Gensingle= By.xpath("//a[normalize-space()='Generate single']");

	//select the Certificate type1
	By certType= By.xpath("//select//option[5]");

	//click on Guidelines link and navigate back
	By Guidelines1= By.xpath("//a[normalize-space()='GuideLines']");

	//click on certificates2 dropdown
	By certs2= By.xpath("//a[normalize-space()='Certificates']");

	//click on Generate Bulk
	By Bulk= By.xpath("//a[normalize-space()='Generate Bulk']");

	//select the certificate type2
	By certType2= By.xpath("//select//option[5]");

	//click on Guidelines link and navigate back
	By Guidelines2= By.xpath("//a[normalize-space()='GuideLines']");



	public UserGuidelinesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickoncertificates1dropdown() throws InterruptedException {
		WebElement certf1 = testbase.waitForElement(Constants.driver.findElement(certs1), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(certf1).build().perform();
		Thread.sleep(3000);

	}
	public void selecttheGeneratesingle() throws InterruptedException {

		String window = driver.getWindowHandle();


		testbase.waitForElement(Constants.driver.findElement(Gensingle), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(Gensingle).click();
		Thread.sleep(3000);

	}

	public void selecttheCertificatetype1() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certType), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.getWindowHandles();
		Constants.driver.findElement(certType).click();
		Thread.sleep(2000);

	}	

	public void clickonGuidelines1linkandnavigateback() throws InterruptedException {

		testbase.waitForElement(Constants.driver.findElement(Guidelines1), TIMEOUT_WAIT, POOLING_WAIT);

		Constants.driver.findElement(Guidelines1).click();
		Thread.sleep(2000);



	}

	public void clickoncertificates2dropdown() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certs2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certs2).click();
		Thread.sleep(2000);
	}	

	public void clickwithGenerateBulk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(Bulk), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(Bulk).click();
		Thread.sleep(2000);
	}	


	public void selectthecertificatetype2() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(certType2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(certType2).click();
		Thread.sleep(2000);
	}	

	public void clickonGuidelines2linkandnavigateback() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(Guidelines2), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(Guidelines2).click();
		//Constants.driver.switchTo().Window(certType2);
		Thread.sleep(2000);

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	}	

}