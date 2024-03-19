package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserApplicationTitlePageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFileWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserWelcomeTextPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserInternalPrintingCSVFileWithSpacesandDotsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFileWithSpacesandDotsPageObjects internal;

	public UserInternalPrintingCSVFileWithSpacesandDotsSteps(TestContext context) {
		System.out.println("Started User Internal printing with invalid data ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		internal = testContext.getPageObjectManager().getinternal();
	}
	@Given("^login with the username and password$")
	public void login_with_the_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}
	
	@Given("^click on the internal printing option$")
	public void click_on_the_internal_printing_option() throws Throwable {
		internal.clickontheinternalprintingoption();
		
	}
	
	@Given("^click on the Certificate Type dropdown$")
	public void click_on_the_Certificate_Type_dropdown() throws Throwable {
		internal.clickontheCertificateTypedropdown();
	}
	
	@Given("^click and upload the invalid CSV File$")
	public void click_and_upload_the_invalid_CSV_File() throws Throwable {
		internal.clickanduploadtheinvalidCSVFile();
		
	}
}
	
	
	
	
