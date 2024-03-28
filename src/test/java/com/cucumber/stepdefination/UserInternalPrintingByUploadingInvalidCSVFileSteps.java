package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingByUploadingInvalidCSVFilePageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingByUploadingInvalidCSVFileSteps {
	TestContext testContext;
	LoginPageObjects login;
    UserInternalPrintingByUploadingInvalidCSVFilePageObjects invalidcsv;
	

	public UserInternalPrintingByUploadingInvalidCSVFileSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcsv = testContext.getPageObjectManager().getinvalidcsv();

	}

	@Given("^I log in with valid Username and Password$")
	public void i_log_in_with_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^I navigate to the Certificates type tab$")
	public void i_navigate_to_the_Certificates_type_tab() throws Throwable {
		invalidcsv.i_navigate_to_the_Certificates_type_tab();
	}

	@When("^select internal printing option$")
	public void select_internal_printing_option() throws Throwable {
		invalidcsv.select_internal_printing_option();
	}

	@When("^choose the Certificate type$")
	public void choose_the_Certificate_type() throws Throwable {
		invalidcsv.choose_the_Certificate_type();
	}

	@When("^upload a CSV file$")
	public void upload_a_CSV_file() throws Throwable {
		invalidcsv.upload_a_CSV_file();
	}

	@When("^remove the uploaded CSV File$")
	public void remove_the_uploaded_CSV_File() throws Throwable {
	    
	}

//	@When("^user click on the Next button$")
//	public void user_click_on_the_Next_button() throws Throwable {
//		invalidcsv.user_click_on_the_Next_button();
	}

