package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminRecentCertificateGenerationsRecallPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsRecallPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsOriginalCertificatesPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsQRCodePageObjects;
import com.cucumber.PageObjects.UserRecentCertificateGenerationsandVerificationsSendMailPageObjects;
import com.cucumber.PageObjects.UserRecentCertificateVerificationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminRecentCertificateGenerationsRecallSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRecentCertificateGenerationsRecallPageObjects adminrecall;

	public AdminRecentCertificateGenerationsRecallSteps(TestContext context) {
		System.out.println("Started Admin Recent Certificate Generations Recall ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminrecall = testContext.getPageObjectManager().getadminrecall();
	}
	

	@Given("^login as through Username and password$")
	public void login_as_through_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
		Thread.sleep(2000);
		}

	@Then("^scroll by the vertical bar in dashboard$")
	public void scroll_by_the_vertical_bar_in_dashboard() throws Throwable {
		adminrecall.scrollbytheverticalbarindashboard();
	}

	@Then("^click recall icon in recent certificate generations in dashboard$")
	public void click_recall_icon_in_recent_certificate_generations_in_dashboard() throws Throwable {
		adminrecall.clickrecalliconinrecentcertificategenerationsindashboard();
	}
	
	}