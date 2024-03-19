package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsandVerificationsCountPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserDashboardGenerationsandVerificationCountSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardGenerationsandVerificationsCountPageObjects genandvencount;

	public UserDashboardGenerationsandVerificationCountSteps(TestContext context) {
		System.out.println("Started Dashboard RecentCertificateGenerations Certificatetype dropdown ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		genandvencount = testContext.getPageObjectManager().getgenandvencount();

	}

	@Given("^login by user through username and password$")
	public void login_by_user_through_username_and_password() throws Throwable {
		login.Logintoappln("DemoUser", "Admin@123");
	}

	@Then("^scroll by down the page$")
	public void scroll_by_down_the_page() throws Throwable {
		genandvencount.scrollbydownthepage();
	}

	@Then("^click by generations Graph and view count$")
	public void click_by_generations_Graph_and_view_count() throws Throwable {
		genandvencount.clickbygenerationsGraphandviewcount();
	}

	@Then("^click the Verifications graph and see the count$")
	public void click_the_Verifications_graph_and_see_the_count() throws Throwable {
		genandvencount.clicktheVerificationsgraphandseethecount();

	}

}