package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsGraphPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserDashboardGenerationsGraphSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardGenerationsGraphPageObjects generationsgraph;

	public UserDashboardGenerationsGraphSteps(TestContext context) {
		System.out.println("Started Dashboard generations Graph Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		generationsgraph = testContext.getPageObjectManager().getgenerationsgraph();
	}

	@Given("^login user by username and password$")
	public void login_user_by_username_and_password() throws Throwable {
		login.Logintoappln("DemoUser", "Admin@123");
	}

	@Then("^scroll down$")
	public void scroll_down() throws Throwable {
		generationsgraph.scrolldown();
	}

	@Then("^click on Generations Graph$")
	public void click_on_Generations_Graph() throws Throwable {
		generationsgraph.clickonGenerationsGraph();
	}

}

