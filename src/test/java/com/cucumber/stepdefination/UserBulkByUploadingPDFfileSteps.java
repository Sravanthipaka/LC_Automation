package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingPDFfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkByUploadingPDFfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingPDFfilePageObjects bulkwithpdf;

	public UserBulkByUploadingPDFfileSteps(TestContext context) {
		System.out.println("Started Bulk with invalid data");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkwithpdf = testContext.getPageObjectManager().getbulkwithpdf();
	}


	@Given("^login of valid username and valid password$")
	public void login_of_valid_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click as certificates tab and click on the generate bulk$")
	public void click_as_certificates_tab_and_click_on_the_generate_bulk() throws Throwable {
		bulkwithpdf.Clickascertificatestabandclickonthegeneratebulk();
	}

	@Then("^Click as certificate type dropdown and select certificate type$")
	public void click_as_certificate_type_dropdown_and_select_certificate_type() throws Throwable {
		bulkwithpdf.ClickasCertificatetypeDropdownandSelectcertificatetype();
	}

	@Then("^upload the PDF file$")
	public void upload_the_PDF_file() throws Throwable {
		bulkwithpdf.uploadthePDFfile();
	}

}