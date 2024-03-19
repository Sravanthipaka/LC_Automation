package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminWelcomeTextSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserWelcomeTextPageObjects welcometext;

	public AdminWelcomeTextSteps(TestContext context) {
		System.out.println("Started User User Welcome Text ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		welcometext = testContext.getPageObjectManager().getwelcometext();
	}
	@Given("^login the admin username and password$")
	public void login_the_admin_username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}
	
	
}