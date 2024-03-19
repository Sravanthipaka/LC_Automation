package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminDashboardGenerationsandVerificationsCountPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//scroll down 
	By scroll = By.xpath("//h4[@class='card-title']");

	//click on Generations Graph
	By generation = By.xpath("//*[@id=\"chart\"]/svg/rect");
	
    //Click the Verifications graph
	By verification = By.xpath("//*[@id=\"chart\"]/svg/rect]");



	public AdminDashboardGenerationsandVerificationsCountPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ScrollByDownthePage() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(scroll).click();
		Thread.sleep(2000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//h4[@class='card-title']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}

	public void ClickbyGenerationsgraphViewCount() throws InterruptedException {
		WebElement admin = testbase.waitForElement(Constants.driver.findElement(generation), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		Thread.sleep(3000);
	}
	
	public void Clickverificationsgraphseethecount() throws InterruptedException {
		WebElement admin = testbase.waitForElement(Constants.driver.findElement(verification), TIMEOUT_WAIT,POOLING_WAIT);
		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		Thread.sleep(3000);
	}

}