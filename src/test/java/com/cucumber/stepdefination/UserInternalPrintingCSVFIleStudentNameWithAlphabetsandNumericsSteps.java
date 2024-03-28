package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects invalidcsv1;

	public UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcsv1 = testContext.getPageObjectManager().getinvalidcsv1();

	}

	
	@Given("^log in with  valid Username and Password$")
	public void log_in_with_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^user navigate to  Certificates type tab$")
	public void user_navigate_to_Certificates_type_tab() throws Throwable {
		invalidcsv1.user_navigate_to_Certificates_type_tab();
	}

	@When("^user select the internal printing$")
	public void user_select_the_internal_printing() throws Throwable {
		invalidcsv1.user_select_the_internal_printing();
	}

	@When("^user choose the appropriate Certificate$")
	public void user_choose_the_appropriate_Certificate() throws Throwable {
		invalidcsv1.user_choose_the_appropriate_Certificate();
	}

	@When("^uploading the CSV File, student name column with alphabets and numeric values$")
	public void uploading_the_CSV_File_student_name_column_with_alphabets_and_numeric_values() throws Throwable {
		invalidcsv1.uploading_the_CSV_File_student_name_column_with_alphabets_and_numeric_values();
	}

	@Then("^error message indicating$")
	public void error_message_indicating() throws Throwable {
		invalidcsv1.error_message_indicating();
	}
}
