package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminVerificationURLObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerificationURLObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminVerificationURLSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminVerificationURLObjects adminverificationurl;

	public AdminVerificationURLSteps(TestContext context) {
		System.out.println("Started Admin Verification URL ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminverificationurl = testContext.getPageObjectManager().getadminverificationurl();
	}
	@Given("^login through the admin Username and password$")
	public void login_through_the_admin_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}
	@Then("^click verification url$")
	public void click_verification_url() throws Throwable {
		adminverificationurl.clickverificationurl();
	}


}