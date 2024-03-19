package com.cucumber.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.TestBase.TestBase;

public class UserApplicationTitlePageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	
	public UserApplicationTitlePageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}
}

