package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingPDFfilePageObjects;
import com.cucumber.PageObjects.UserBulkDashboardLinkPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkDashboardLinkSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkDashboardLinkPageObjects bulkdashboardlink;

	public UserBulkDashboardLinkSteps(TestContext context) {
		System.out.println("Started Bulk with invalid data");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkdashboardlink = testContext.getPageObjectManager().getbulkdashboardlink();
	}



	@Given("^login by the valid username and valid password$")
	public void login_by_the_valid_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click the Certificate type$")
	public void click_the_Certificate_type() throws Throwable {
		bulkdashboardlink.clicktheCertificatetype();
	}

	@Then("^click on the Generate bulk option$")
	public void click_on_the_Generate_bulk_option() throws Throwable {
		bulkdashboardlink.clickontheGeneratebulkoption();
	}

	@Then("^click on the dashboard link$")
	public void click_on_the_dashboard_link() throws Throwable {
		bulkdashboardlink.clickonthedashboardlink();
	}
}