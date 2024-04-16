package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenerateBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBulkByUploadingDOCXfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingDOCXfilePageObjects bulkwithdocx;

	public UserBulkByUploadingDOCXfileSteps(TestContext context) {
		System.out.println("Started Bulk Without Approvals");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkwithdocx = testContext.getPageObjectManager().getbulkwithdocx();
	}


	@Given("^login of valid username and password$")
	public void login_of_valid_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click Certificates tab and click on the generate bulk$")
	public void click_Certificates_tab_and_click_on_the_generate_bulk() throws Throwable {
		bulkwithdocx.ClickCertificatestabandclickonthegeneratebulk();
	}

	@Then("^Click Certificate type Dropdown and Select certificate type$")
	public void click_Certificate_type_Dropdown_and_Select_certificate_type() throws Throwable {
		bulkwithdocx.ClickCertificatetypeDropdownandSelectcertificatetype();
	}

	@Then("^upload the DOCX file$")
	public void upload_the_DOCX_file() throws Throwable {
		bulkwithdocx.uploadtheDOCXfile();
	}
	
}

