package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminApplicationTitleSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserApplicationTitlePageObjects applicationtitle;

	public AdminApplicationTitleSteps(TestContext context) {
		System.out.println("Started User Read the Application title ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		applicationtitle = testContext.getPageObjectManager().getapplicationtitle();
	}
	@Given("^login by admin username and password$")
	public void login_by_admin_username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}
}