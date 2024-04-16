package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithAlphabetsandNumericsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersPageObjects invalidemail;

	public UserInternalPrintingCSVFileStudentEmailWithoutSpecialCharectersSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidemail = testContext.getPageObjectManager().getinvalidemail();
	}
	

	@Given("^login by the username and valid password$")
	public void login_by_the_username_and_valid_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click by Internal Printing$")
	public void click_by_Internal_Printing() throws Throwable {
		invalidemail.clickbyInternalPrinting();
	}

	@Then("^click by certificate type dropdown$")
	public void click_by_certificate_type_dropdown() throws Throwable {
		invalidemail.clickbycertificatetypedropdown();
	}

	@Then("^click upload invalid CSV file$")
	public void click_upload_invalid_CSV_file() throws Throwable {
		invalidemail.clickuploadinvalidCSVfile();
	}

}
	
	
	
	
