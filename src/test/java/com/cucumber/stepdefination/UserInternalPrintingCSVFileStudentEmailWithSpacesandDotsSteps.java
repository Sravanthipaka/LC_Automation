package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects invalidfile;

	public UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidfile = testContext.getPageObjectManager().getinvalidfile();
	}
	
	
	@Given("^login with the valid username and valid password$")
	public void login_with_the_valid_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click the Internal Printing option$")
	public void click_the_Internal_Printing_option() throws Throwable {
		invalidfile.ClicktheInternalPrintingoption();
	}

	@Then("^Click the certificate type dropdown$")
	public void click_the_certificate_type_dropdown() throws Throwable {
		invalidfile.Clickthecertificatetypedropdown();
	}

	@Then("^Click by upload the invalid CSV File$")
	public void click_by_upload_the_invalid_CSV_File() throws Throwable {
		invalidfile.ClickbyuploadtheinvalidCSVFile();
	}


}
	
	
	
	
