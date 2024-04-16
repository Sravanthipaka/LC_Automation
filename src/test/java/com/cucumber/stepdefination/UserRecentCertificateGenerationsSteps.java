package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsPageObjects recentcertificategenerations;

	public UserRecentCertificateGenerationsSteps(TestContext context) {
		System.out.println("Started User Recent Certificate Generations ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		recentcertificategenerations = testContext.getPageObjectManager().getrecentcertificategenerations();
	}
	

	@Given("^login into Username and password$")
	public void login_into_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^scroll down the page$")
	public void scroll_down_the_page() throws Throwable {
		recentcertificategenerations.scrolldownthepage();
	}

	@Then("^click the student name link$")
	public void click_the_student_name_link() throws Throwable {
		recentcertificategenerations.clickthestudentnamelink();
	}

	}