package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminRecentCertificateGenerationsandVerificationsQRCodeSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRecentCertificateGenerationsandVerificationsQRCodePageObjects admindownloadqrcode;

	public AdminRecentCertificateGenerationsandVerificationsQRCodeSteps(TestContext context) {
		System.out.println("Started Admin Recent Certificate GenerationsandVerifications QR Code ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		admindownloadqrcode = testContext.getPageObjectManager().getadmindownloadqrcode();
	}
	

	@Given("^login as by the Username and password$")
	public void login_as_by_the_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^Scroll down on the dashboard$")
	public void Scroll_down_on_the_dashboard() throws Throwable {
		admindownloadqrcode.Scrolldownonthedashboard();
	}

	@Then("^click by downoad qR Code icon recent certificate generations in dashboard$")
	public void click_by_downoad_qR_Code_icon_recent_certificate_generations_in_dashboard() throws Throwable {
		admindownloadqrcode.clickbydownoadqRCodeiconrecentcertificategenerationsindashboard();
	}
	
	@Then("^click by downoad qR Code icon recent certificate verifications in dashboard$")
	public void click_by_downoad_qR_Code_icon_recent_certificate_verifications_in_dashboard() throws Throwable {
		admindownloadqrcode.clickbydownoadqRCodeiconrecentcertificateverificationsindashboard();
	}
	}