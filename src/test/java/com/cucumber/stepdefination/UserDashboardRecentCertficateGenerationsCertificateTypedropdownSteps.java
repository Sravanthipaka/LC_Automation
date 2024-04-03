package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserDashboardRecentCertficateGenerationsCertificateTypedropdownSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects certificatetypedropdown;

	public UserDashboardRecentCertficateGenerationsCertificateTypedropdownSteps(TestContext context) {
		System.out.println("Started Dashboard RecentCertificateGenerations Certificatetype dropdown ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		certificatetypedropdown = testContext.getPageObjectManager().getcertificatetypedropdown();
	}
	@Given("^login of the user valid Username valid Password$")
	public void login_of_the_user_valid_Username_valid_Password() throws Throwable {
		//login.Logintoappln("DemoUser", "Admin@123");
	}

	@Then("^Scroll the vertical$")
	public void Scroll_by_vertical() throws Throwable {
		//certificatetypedropdown.Scrollthevertical();
	}

	@Then("^click on the Cerificate Type dropdown and select the type$")
	public void click_on_the_cerificate_type_dropdown_and_select_the_type() throws Throwable {
		//certificatetypedropdown.clickontheCerificateTypedropdownandselectthetype();
	}

}