package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cucumber.PageObjects.UserLaunchTheApplicationPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLaunchTheApplicationSteps {

	TestContext testContext;
	UserLaunchTheApplicationPageObjects userlaunchapplication;

	public UserLaunchTheApplicationSteps(TestContext context) {
		this.testContext = context;
		userlaunchapplication = testContext.getPageObjectManager().getuserlaunchapplication();

	}

	@Given("^Launch the user login application$")
	public void launch_the_user_login_application() throws Throwable {

	}
}
