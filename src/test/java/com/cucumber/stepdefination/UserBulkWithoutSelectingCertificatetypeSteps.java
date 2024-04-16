package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkWithoutSelectingCertificatetypeSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkWithoutSelectingCertificatetype invalidbulkdata;

	public UserBulkWithoutSelectingCertificatetypeSteps(TestContext context) {
		System.out.println("Started Bulk Without Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidbulkdata = testContext.getPageObjectManager().getinvalidbulkdata();
	}


	@Given("^login as the username and password$")
	public void login_as_the_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click on the Certificates tab then click on the generate bulk option$")
	public void click_on_the_Certificates_tab_then_click_on_the_generate_bulk_option() throws Throwable {
		invalidbulkdata.ClickontheCertificatestabthenclickonthegeneratebulkoption();
	}

	@Then("^upload the original certificate$")
	public void upload_the_original_certificate() throws Throwable {
		invalidbulkdata.uploadtheoriginalcertificate();
	}

}