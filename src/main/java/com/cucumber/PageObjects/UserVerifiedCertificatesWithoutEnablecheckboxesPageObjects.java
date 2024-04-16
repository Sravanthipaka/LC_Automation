package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects 
{
	WebDriver driver;
	TestBase testbase;

	By	reports= By.xpath("//a[text()='Reports ']");
	By venc	=By.xpath("//a[text()='Verified Certificates ']");
	By ok=By.xpath("//button[text()='Ok']");
	By c=By.xpath("//div[@class='card-header']/div/select");
	By bc=By.name("bulk_action");
	By g=By.xpath("//input[@value='Go']");
	By o=By.xpath("//button[text()='Ok']");
	public UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects (WebDriver driver) 
	{
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clcikonreportsandgenearatedcertiifcates()
	{
		WebElement Certificates=Constants.driver.findElement(reports);
		Actions act=new Actions(driver);
		act.moveToElement(Certificates).perform();

		Constants.driver.findElement(venc).click();
	}
	public void selectValueCertificate() throws InterruptedException
	{
		//driver.findElement(ok).click();
		WebElement ele2 = driver.findElement(c);
		Thread.sleep(2000);
		Select sc1=new Select(ele2);
		sc1.selectByValue("Auto");
	}

	public void performclickoperation() throws InterruptedException
	{
		WebElement ActionDrpdwn = driver.findElement(bc);
		Select s1=new Select(ActionDrpdwn);
		String[] valueToselect= {"1","2","3"};
		for(String value:valueToselect)
		{
			s1.selectByValue(value);
			Thread.sleep(1000);
			driver.findElement(g).click();
			driver.findElement(o).click();
		}
	}


}

