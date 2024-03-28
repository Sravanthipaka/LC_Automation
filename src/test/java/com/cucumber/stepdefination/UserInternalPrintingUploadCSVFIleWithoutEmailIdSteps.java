package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingUploadCSVFIleWithoutEmailIdSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingUploadCSVFIleWithoutEmailidPageObjects invalidcsv2;

	public UserInternalPrintingUploadCSVFIleWithoutEmailIdSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcsv2 = testContext.getPageObjectManager().getinvalidcsv2();

	}
	
	@Given("^User login with  valid Username and Password$")
	public void user_login_with_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^user click on the Certificates type tab$")
	public void user_click_on_the_Certificates_type_tab() throws Throwable {
		invalidcsv2.user_click_on_the_Certificates_type_tab();
	}

	@When("^user select internal printing$")
	public void user_select_internal_printing() throws Throwable {
		invalidcsv2.user_select_internal_printing();
	}

	@When("^user choose the Certificate Type$")
	public void user_choose_the_Certificate_Type() throws Throwable {
		invalidcsv2.user_choose_the_Certificate_Type();
	}

	@When("^uploading CSV File without Student Email id column$")
	public void uploading_CSV_File_without_Student_Email_id_column() throws Throwable {
		invalidcsv2.uploading_CSV_File_without_Student_Email_id_column();
	}

	@Then("^error message shows$")
	public void error_message_shows() throws Throwable {
		//invalidcsv2.error_message_shows();
	}
}
