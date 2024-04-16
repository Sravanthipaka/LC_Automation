package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkByUploadingJPEGfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingJPEGfilePageObjects bulkwithjpeg;

	public UserBulkByUploadingJPEGfileSteps(TestContext context) {
		System.out.println("Started Bulk with invalid data");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkwithjpeg = testContext.getPageObjectManager().getbulkwithjpeg();
	}


	@Given("^login of username and valid password$")
	public void login_of_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click by certificates tab and click on the generate bulk$")
	public void click_by_certificates_tab_and_click_on_the_generate_bulk() throws Throwable {
		bulkwithjpeg.Clickbycertificatestabandclickonthegeneratebulk();
	}

	@Then("^Click by certificate type dropdown and select certificate type$")
	public void click_by_certificate_type_dropdown_and_select_certificate_type() throws Throwable {
		bulkwithjpeg.ClickCertificatetypeDropdownandSelectcertificatetype();
	}

	@Then("^upload the JPEG file$")
	public void upload_the_JPEG_file() throws Throwable {
		bulkwithjpeg.uploadtheJPEGfile();
	}

}