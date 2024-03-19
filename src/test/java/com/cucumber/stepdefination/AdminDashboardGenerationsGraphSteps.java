package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminDashboardGenerationsGraphPageObjects;
import com.cucumber.PageObjects.AdminGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsGraphPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminDashboardGenerationsGraphSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminDashboardGenerationsGraphPageObjects admingenerationsgraph;

	public AdminDashboardGenerationsGraphSteps(TestContext context) {
		System.out.println("Started Dashboard generations Graph Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		admingenerationsgraph = testContext.getPageObjectManager().getadmingenerationsgraph();
	}

	@Given("^login admin by username and password$")
	public void login_admin_by_username_and_password() throws Throwable {
		login.Logintoappln("DemoAdmin", "Admin@123");
	}

	@Then("^scroll the page down$")
	public void scroll_the_page_down () throws Throwable {
		admingenerationsgraph.scrollthepagedown();
	}

	@Then("^click by generations graph$")
	public void click_by_generations_graph() throws Throwable {
		admingenerationsgraph.clickbygenerationsgraph();
	}

}

