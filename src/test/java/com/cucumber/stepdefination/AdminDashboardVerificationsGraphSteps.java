package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminDashboardVerificationsGraphPageObjects;
import com.cucumber.PageObjects.AdminGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsGraphPageObjects;
import com.cucumber.PageObjects.UserDashboardVerificationsGraphPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminDashboardVerificationsGraphSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminDashboardVerificationsGraphPageObjects adminverificationsgraph;

	public AdminDashboardVerificationsGraphSteps(TestContext context) {
		System.out.println("Started Dashboard Verifications Graph Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminverificationsgraph = testContext.getPageObjectManager().getadminverificationsgraph();
	}

	@Given("^login admin through the username and password$")
	public void login_admin_through_the_username_and_password() throws Throwable {
		login.Logintoappln("DemoUser", "Admin@123");
	}

	@Then("^scroll by the down$")
	public void scroll_by_the_down () throws Throwable {
		adminverificationsgraph.scrollbythedown();
	}

	@Then("^Click Verifications graph$")
	public void Click_Verifications_graph() throws Throwable {
		adminverificationsgraph.ClickVerificationsgraph();
	}

}

