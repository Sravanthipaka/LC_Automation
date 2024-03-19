package com.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;

public class AdminApplicationTitlePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	
	public AdminApplicationTitlePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
}

