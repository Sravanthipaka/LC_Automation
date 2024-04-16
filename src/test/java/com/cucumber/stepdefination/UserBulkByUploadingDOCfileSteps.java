package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkByUploadingDOCfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingDOCfilePageObjects bulkwithdoc;

	public UserBulkByUploadingDOCfileSteps(TestContext context) {
		System.out.println("Started Bulk Without Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkwithdoc = testContext.getPageObjectManager().getbulkwithdoc();
	}


	@Given("^login of username and password$")
	public void login_of_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click certificates tab then click on the generate bulk option$")
	public void click_certificates_tab_then_click_on_the_generate_bulk_option() throws Throwable {
		bulkwithdoc.clickcertificatestabthenclickonthegeneratebulkoption();
	}

	@Then("^Click certificate type dropdown and select certificate type$")
	public void click_certificate_type_dropdown_and_select_certificate_type() throws Throwable {
		bulkwithdoc.Clickcertificatetypedropdownandselectcertificatetype();
	}

	@Then("^upload the DOC file$")
	public void upload_the_DOC_file() throws Throwable {
		bulkwithdoc.uploadtheDOCfile();
	}

}