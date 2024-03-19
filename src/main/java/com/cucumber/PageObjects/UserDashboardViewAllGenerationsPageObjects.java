package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserDashboardViewAllGenerationsPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	//Scroll down the vertical bar
	By scroll = By.xpath("//a[normalize-space()='LearningChain']");

	//click on the Certificate type dropdown and select the type
	By dropdown = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select");
	By select = By.xpath("/html/body/div/app-root/app-dashboard/body/div/div/div[2]/div/div[5]/div[1]/div/div/div[1]/div/select/option[4]");
	
	//click on the View All Generations button 
	By viewallgenerations = By.xpath("//a[normalize-space()='View All Generations']");
	


	public UserDashboardViewAllGenerationsPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void Scrolldowntheverticalbar() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(scroll), TIMEOUT_WAIT,POOLING_WAIT);


		JavascriptExecutor jse=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//a[normalize-space()='LearningChain']"));

		jse.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);

	}
	
	public void clickontheCertificatetypedropdownandselectthetype() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(dropdown), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(dropdown).click();
		Thread.sleep(2000);
		Constants.driver.findElement(select).click();
		Thread.sleep(2000);
	}

	public void clickontheViewAllGenerationsbutton () throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(viewallgenerations), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(viewallgenerations).click();
		Thread.sleep(3000);
	}	

}