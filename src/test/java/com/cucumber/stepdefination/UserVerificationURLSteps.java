package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerificationURLObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserVerificationURLSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerificationURLObjects userverificationurl;

	public UserVerificationURLSteps(TestContext context) {
		System.out.println("Started Verification URL ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		userverificationurl = testContext.getPageObjectManager().getuserverificationurl();
	}
	@Given("^login to the username and password field by user$")
	public void login_to_the_username_and_password_field_by_user() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click the Verification URL1$")
	public void click_the_Verification_URl() throws Throwable {
		userverificationurl.ClicktheVerificationURL1();
	}

}