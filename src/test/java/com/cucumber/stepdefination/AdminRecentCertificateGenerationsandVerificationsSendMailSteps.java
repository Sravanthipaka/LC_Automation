package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminRecentCertificateGenerationsandVerificationsSendMailSteps {
	TestContext testContext;
	LoginPageObjects login;
    AdminRecentCertificateGenerationsandVerificationsSendMailPageObjects adminsendmail;

	public AdminRecentCertificateGenerationsandVerificationsSendMailSteps(TestContext context) {
		System.out.println("Started Admin Recent Certificate GenerationsandVerifications Send Mail ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminsendmail = testContext.getPageObjectManager().getadminsendmail();
	}
	

	@Given("^login at into Username and password by user$")
	public void login_at_into_Username_and_password_by_user() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^Scroll by admin verical bar$")
	public void Scroll_by_admin_verical_bar() throws Throwable {
		adminsendmail.Scrollbyadminvericalbar();
	}

	@Then("^Click by send mail  on Recent Certificate Generations the dashbaord$")
	public void Click_by_send_mail_on_Recent_Certificate_Generations_the_dashbaord() throws Throwable {
		adminsendmail.ClickbysendmailonRecentCertificateGenerationsthedashbaord();
	}
	
	@Then("^Click by Send Mail on recent certificate verifications the dashbaord$")
	public void Click_by_Send_Mail_on_recent_certificate_verifications_the_dashbaord() throws Throwable {
		adminsendmail.ClickbySendMailonrecentcertificateverificationsthedashbaord();
	}
	}