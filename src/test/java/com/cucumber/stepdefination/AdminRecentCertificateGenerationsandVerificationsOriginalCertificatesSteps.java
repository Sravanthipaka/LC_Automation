package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects adminoriginalcertificates;

	public AdminRecentCertificateGenerationsandVerificationsOriginalCertificatesSteps(TestContext context) {
		System.out.println("Started User Recent Certificate GenerationsandVerifications Original Certificates ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminoriginalcertificates = testContext.getPageObjectManager().getadminoriginalcertificates();
	}
	


@Given("^login by using Username and password field$")
public void login_by_using_Username_and_password_field() throws Throwable {
	login.Logintoappln("SahaAdmin", "Admin@123");
}


	@Then("^scroll vertical$")
	public void scroll_vertical() throws Throwable {
		adminoriginalcertificates.scrollvertical();
	}

	@Then("^click the downoad original certificates Recent Certificate Generations$")
	public void click_the_downoad_original_certificates_Recent_Certificate_Generations() throws Throwable {
		adminoriginalcertificates.clickthedownoadoriginalcertificatesRecentCertificateGenerations();
	}
	
	@Then("^click by the Download original certficates Recent Certificate Verifications$")
	public void click_by_the_Download_original_certficates_Recent_Certificate_Verifications() throws Throwable {
		adminoriginalcertificates.clickbytheDownloadoriginalcertficatesRecentCertificateVerifications();
	}
	}