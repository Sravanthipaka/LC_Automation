package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Click on reports type
	By reports = By.xpath("//a[text()='Reports ']");

	//Click the Generated Certificates 
	By generated = By.xpath("//a[text()='Generated Certificates ']");

	// Select the Certificate Type
	By ok1 = By.xpath("//button[text()='Ok']");

	// Click on the Action dropdown
	By dropdown1 = By.xpath("bulk_action");

	//select the options one by one
	//By selectvalue = By.xpath("/html/body/div/app-root/app-generated-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/select/option[1]");



	public UserGeneratedCertificatesWithoutSelectingCheckboxesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}


	public void Clickonreportstype() throws InterruptedException {
		WebElement inst = testbase.waitForElement(Constants.driver.findElement(reports), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act1 = new Actions(driver);
		act1.moveToElement(inst).build().perform();
		Thread.sleep(3000);

	}

	public void ClicktheGeneratedCertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(generated), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(generated).click();
		Thread.sleep(3000);


	}

	public void SelecttheCertificateType() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(ok1), TIMEOUT_WAIT, POOLING_WAIT);
		//Constants.driver.findElement(ok1).click();
		Thread.sleep(2000);		

		WebElement ele2 = driver.findElement(By.xpath("//div[@class='card-header']/div[2]/select"));
		Thread.sleep(2000);
		Select sc1=new Select(ele2);
		sc1.selectByValue("MBA");

		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		WebElement Action=driver.findElement(By.xpath("//th[normalize-space()='Action']"));
		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
	}

	public void ClickontheActiondropdownandselecttheoptionsonebyone() throws InterruptedException {
		//		testbase.waitForElement(Constants.driver.findElement(sendmail), TIMEOUT_WAIT, POOLING_WAIT);
		//		Constants.driver.findElement(sendmail).click();
		//		Constants.driver.findElement(ok).click();
		//		Thread.sleep(4000);


		WebElement ActionDrpdwn = driver.findElement(By.name("bulk_action"));
		Select s1=new Select(ActionDrpdwn);
		String[] valueToselect= {"1","2","3","4","5"};
		for(String value:valueToselect)
		{
			s1.selectByValue(value);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			driver.findElement(By.xpath("//button[text()='Ok']")).click();

		}


	}

}
