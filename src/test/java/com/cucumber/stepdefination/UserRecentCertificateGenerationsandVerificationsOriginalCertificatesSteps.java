package com.cucumber.stepdefination;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsandVerificationsOriginalCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects originalcertificates;

	public UserRecentCertificateGenerationsandVerificationsOriginalCertificatesSteps(TestContext context) {
		System.out.println("Started User Recent Certificate GenerationsandVerifications Original Certificates ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		originalcertificates = testContext.getPageObjectManager().getoriginalcertificates();
	}
	

	@Given("^login by Username and password the user$")
	public void login_by_Username_and_password_the_user() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^scroll down page$")
	public void scroll_down_page() throws Throwable {
		originalcertificates.scrolldownpage();
	}

	@Then("^click downoad original certificates recent certificate generations$")
	public void click_download_original_certificates_recent_certificate_generations() throws Throwable {
		originalcertificates.clickdownoadoriginalcertificatesrecentcertificategenerations();
	}
	
	@Then("^click Download original certficates recent certificate verifications$")
	public void click_Download_original_certficates_recent_certificate_verifications() throws Throwable {
		originalcertificates.clickDownloadoriginalcertficatesrecentcertificateverifications();
	}
	}