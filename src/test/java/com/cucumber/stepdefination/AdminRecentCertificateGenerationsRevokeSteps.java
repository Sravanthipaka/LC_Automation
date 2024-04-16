package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminRecentCertificateGenerationsRevokePageObjects;
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

public class AdminRecentCertificateGenerationsRevokeSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRecentCertificateGenerationsRevokePageObjects adminrevoke;

	public AdminRecentCertificateGenerationsRevokeSteps(TestContext context) {
		System.out.println("Started Admin Recent Certificate Generations Revoke ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminrevoke = testContext.getPageObjectManager().getadminrevoke();
	}
	

	@Given("^login through adminUsername and password$")
	public void login_into_through__Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^scroll by vertical bar on the dashboard$")
	public void scroll_by_vertical_bar_on_the_dashboard() throws Throwable {
		adminrevoke.scrollbyverticalbaronthedashboard();
	}

	@Then("^click the revoke icon in recent certificate generations on the dashbaord$")
	public void click_the_revoke_icon_in_recent_certificate_generations_on_the_dashbaord() throws Throwable {
		adminrevoke.clicktherevokeiconinrecentcertificategenerationsonthedashbaords();
	}
	
	}