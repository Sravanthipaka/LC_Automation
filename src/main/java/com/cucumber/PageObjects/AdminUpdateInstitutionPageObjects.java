package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminUpdateInstitutionPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//click the settings option
	By settings = By.xpath("//a[@class='sub-icon'][normalize-space()='Settings']");

	//select the Update Institution
	By update = By.xpath("//a[normalize-space()='Update Institution']");

	//click on the Address field
	By address = By.xpath("//input[@id='address']");

	//upload the Logo
	By uploadfile =By.xpath("//input[@id='logo']");

	//select the state from dropdown
	By state  =By.xpath("//*[@id='stateId']");
	By dropdown  =By.xpath("//*[@id=\"stateId\"]/option[25]");


	//click on the city and click on the contact person
	By city = By.xpath("//input[@id='city']");
	By name = By.xpath("//input[@id='contactperson']");

	//click on the Email id then click on the update
	By email = By.xpath("//input[@id='email']");
	By submit = By.xpath("//input[@id='rcfrmsubmit']");



	public AdminUpdateInstitutionPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickthesettingsoption() throws InterruptedException {
		WebElement institution = testbase.waitForElement(Constants.driver.findElement(settings), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(institution).build().perform();
		Thread.sleep(3000);

	}
	public void selecttheUpdateInstitution() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(update), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(update).click();
		Thread.sleep(3000);

	}

	public void clickontheAddressfield() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(address), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(address).clear();
		Thread.sleep(2000);
		Constants.driver.findElement(address).sendKeys("Hitech city");
	}	

	public void uploadtheLogo() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(uploadfile), TIMEOUT_WAIT, POOLING_WAIT);
		String img= "D:\\LC_Automation Practice\\Cat03 (7).jpg";

		Constants.driver.findElement(uploadfile);
		WebElement Upload= testbase.waitForElement(Constants.driver.findElement(uploadfile), TIMEOUT_WAIT, POOLING_WAIT);
		Upload.sendKeys(img);
		Thread.sleep(2000);

	}	

	public void selectthestatefromdropdown() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(state), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(state).click();
		Thread.sleep(2000);
		Constants.driver.findElement(dropdown).click();

	}

	public void clickonthecityandclickonthecontactperson() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(city), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(city).clear();
		Thread.sleep(1000);
		Constants.driver.findElement(city).sendKeys("HYD");
		Thread.sleep(1000);
		Constants.driver.findElement(name).clear();
		Thread.sleep(1000);
		Constants.driver.findElement(name).sendKeys("Anusha");
		Thread.sleep(1000);

	}	

	public void clickontheEmailidthenclickontheupdate() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(email), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(email).clear();
		Thread.sleep(2000);
		Constants.driver.findElement(email).sendKeys("anusha.g@sapphirus.in");
		Thread.sleep(1000);
		Constants.driver.findElement(submit).click();
	}	
}