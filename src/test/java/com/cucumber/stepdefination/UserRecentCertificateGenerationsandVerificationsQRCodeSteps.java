package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsandVerificationsQRCodeSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsandVerificationsQRCodePageObjects downloadqrcode;

	public UserRecentCertificateGenerationsandVerificationsQRCodeSteps(TestContext context) {
		System.out.println("Started User Recent Certificate GenerationsandVerifications QR Code ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		downloadqrcode = testContext.getPageObjectManager().getdownloadqrcode();
	}
	

	@Given("^login at into the Username and password$")
	public void login_at_into_the_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Scroll down$")
	public void Scroll_down() throws Throwable {
		downloadqrcode.Scrolldown();
	}

	@Then("^click the downoad QR Code icon recent certificate generations$")
	public void click_the_download_QR_Code_icon_recent_certificate_generations() throws Throwable {
		downloadqrcode.clickthedownoadQRCodeiconrecentcertificategenerations();
	}
	
	@Then("^click on the Download qr code in recent certificate verifications$")
	public void click_on_the_Download_qr_code_in_recent_certificate_verifications() throws Throwable {
		downloadqrcode.clickontheDownloadqrcodeinrecentcertificateverifications();
	}
	}