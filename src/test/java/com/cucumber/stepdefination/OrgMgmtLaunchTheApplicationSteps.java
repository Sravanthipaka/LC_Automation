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

public class OrgMgmtLaunchTheApplicationSteps {

	TestContext testContext;
	UserLaunchTheApplicationPageObjects userlaunchapplication;

	public OrgMgmtLaunchTheApplicationSteps(TestContext context) {
		this.testContext = context;
		userlaunchapplication = testContext.getPageObjectManager().getuserlaunchapplication();

	}

	@Given("^Launch the management login application$")
	public void launch_the_management_login_application() throws Throwable {

	}
}
