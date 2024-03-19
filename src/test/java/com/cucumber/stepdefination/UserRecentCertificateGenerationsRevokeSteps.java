package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsRecallPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsRevokePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsRevokeSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsRevokePageObjects revoke;

	public UserRecentCertificateGenerationsRevokeSteps(TestContext context) {
		System.out.println("Started User Recent Certificate Generations Revoke ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		revoke = testContext.getPageObjectManager().getrevoke();
	}
	

	@Given("^login into through Username and password$")
	public void login_into_through__Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^scroll on Vertical Bar$")
	public void scroll_on_Vertical_Bar() throws Throwable {
		revoke.scrollonVerticalBar();
	}

	@Then("^click Revoke icon in recent certificate generations$")
	public void click_Revoke_icon_in_recent_certificate_generations() throws Throwable {
		revoke.clickRevokeiconinrecentcertificategenerations();
	}
	
	}