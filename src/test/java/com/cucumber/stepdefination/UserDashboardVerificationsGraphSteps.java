package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsGraphPageObjects;
import com.cucumber.PageObjects.UserDashboardVerificationsGraphPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserDashboardVerificationsGraphSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardVerificationsGraphPageObjects verificationsgraph;

	public UserDashboardVerificationsGraphSteps(TestContext context) {
		System.out.println("Started Dashboard Verifications Graph Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verificationsgraph = testContext.getPageObjectManager().getverificationsgraph();
	}

	@Given("^login user through the username and password$")
	public void login_user_through_the_username_and_password() throws Throwable {
		login.Logintoappln("DemoUser", "Admin@123");
	}

	@Then("^Scroll on the down$")
	public void scroll_down() throws Throwable {
		verificationsgraph.Scrollonthedown();
	}

	@Then("^Click the Verifications graph$")
	public void Click_the_Verifications_graph() throws Throwable {
		verificationsgraph.ClicktheVerificationsgraph();
	}

}

