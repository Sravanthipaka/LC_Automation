package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberPageObjects invalidacrefnum1;

	public UserInternalPrintingCSVFileWithSpacesandDotsinAcademicReferenceNumberSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidacrefnum1 = testContext.getPageObjectManager().getinvalidacrefnum1();
	}
	
	@Given("^login by the username and password$")
	public void login_by_the_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		
	}

	@Then("^click the internal printing$")
	public void click_the_internal_printing() throws Throwable {
		invalidacrefnum1.clicktheinternalprinting();
	}

	@Then("^click the Certificate Type$")
	public void click_the_Certificate_Type() throws Throwable {
		invalidacrefnum1.clicktheCertificateType();
	}

	@Then("^click upload the invalid CSV File$")
	public void click_upload_the_invalid_CSV_File() throws Throwable {
		invalidacrefnum1.clickuploadtheinvalidCSVFile();
	}


}
	
	
	
	
