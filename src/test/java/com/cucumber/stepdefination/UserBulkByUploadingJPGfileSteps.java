package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkByUploadingJPGfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingJPGfilePageObjects invalidbulkdata1;

	public UserBulkByUploadingJPGfileSteps(TestContext context) {
		System.out.println("Started Bulk Without Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidbulkdata1 = testContext.getPageObjectManager().getinvalidbulkdata1();
	}


	@Given("^login of the username and password$")
	public void login_of_the_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click on the certificates tab then click on the generate bulk option$")
	public void click_on_the_certificates_tab_then_click_on_the_generate_bulk_option() throws Throwable {
		invalidbulkdata1.clickonthecertificatestabthenclickonthegeneratebulkoption();
	}

	@Then("^Click on the certificate type dropdown and select certificate type$")
	public void click_on_the_certificate_type_dropdown_and_select_certificate_type() throws Throwable {
		invalidbulkdata1.Clickonthecertificatetypedropdownandselectcertificatetype();
	}

	@Then("^upload the JPG file$")
	public void upload_the_JPG_file() throws Throwable {
		invalidbulkdata1.uploadtheJPGfile();
	}
	
}