package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserRecentCertificateGenerationsandVerificationsSendMailSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserRecentCertificateGenerationsandVerificationsSendMailPageObjects sendmail;

	public UserRecentCertificateGenerationsandVerificationsSendMailSteps(TestContext context) {
		System.out.println("Started User Recent Certificate GenerationsandVerifications Send Mail ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		sendmail = testContext.getPageObjectManager().getsendmail();
	}
	

	@Given("^login at the Username and password$")
	public void login_at_the_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Scroll the page$")
	public void scroll_down_the_page() throws Throwable {
		sendmail.Scrollthepage();
	}

	@Then("^Click the Send Mail icon in Recent Certificate Generations$")
	public void click_the_send_Mail_icon_in_Recent_Certificate_Generation() throws Throwable {
		sendmail.ClicktheSendMailiconinRecentCertificateGenerations();
	}
	
	@Then("^Click the send mail in Recent Certificate Verifications$")
	public void click_the_send_mail_in_Recent_Certificate_Verifications() throws Throwable {
		sendmail.ClickthesendmailinRecentCertificateVerifications();
	}
	}