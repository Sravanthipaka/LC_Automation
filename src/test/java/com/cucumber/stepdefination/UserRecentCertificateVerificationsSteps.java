package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateVerificationsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateVerificationsPageObjects recentcertificateverifications;

	public UserRecentCertificateVerificationsSteps(TestContext context) {
		System.out.println("Started User Recent Certificate Verifications ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		recentcertificateverifications = testContext.getPageObjectManager().getrecentcertificateverifications();
	}
	

	@Given("^login by user the Username and password field$")
	public void login_by_user_the_Username_and_password_field() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Scroll down the page$")
	public void scroll_down_the_page() throws Throwable {
		recentcertificateverifications.Scrolldownthepage();
	}

	@Then("^Click on the Student name link$")
	public void click_on_the_Student_name_link() throws Throwable {
		recentcertificateverifications.ClickontheStudentnamelink();
	}

	}