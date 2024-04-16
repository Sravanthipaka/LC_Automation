package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserApplicationTitleSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserApplicationTitlePageObjects applicationtitle;

	public UserApplicationTitleSteps(TestContext context) {
		System.out.println("Started User Read the Application title ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		applicationtitle = testContext.getPageObjectManager().getapplicationtitle();
	}
	@Given("^login by user username and password$")
	public void login_by_user_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}
}