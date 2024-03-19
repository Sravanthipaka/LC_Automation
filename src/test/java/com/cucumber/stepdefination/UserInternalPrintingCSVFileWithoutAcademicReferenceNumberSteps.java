package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithoutAcademicReferenceNumberPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileWithoutAcademicReferenceNumberSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileWithoutAcademicReferenceNumberPageObjects invalidacrefnum;

	public UserInternalPrintingCSVFileWithoutAcademicReferenceNumberSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidacrefnum = testContext.getPageObjectManager().getinvalidacrefnum();
	}
	

	
   @Given("^login by valid username and valid password$")
	public void login_by_valid_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click by Internal Printing$")
	public void click_by_Internal_Printing() throws Throwable {
		invalidacrefnum.ClickbyInternalPrinting();
	}

	@Then("^Click by certificate type dropdown$")
	public void click_by_certificate_type_dropdown() throws Throwable {
		invalidacrefnum.Clickbycertificatetypedropdown();
	}

	@Then("^Click by upload invalid CSV file$")
	public void click_by_upload_invalid_CSV_file() throws Throwable {
		invalidacrefnum.ClickbyuploadinvalidCSVfile();
	}



}
	
	
	
	
