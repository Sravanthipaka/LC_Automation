package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingCSVFIleStudentNameWithAlphabetsandNumericsPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingUploadCSVFIleWithoutStudentNamePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingUploadCSVFIleWithoutStudentNameSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingUploadCSVFIleWithoutStudentNamePageObjects emptystudentname1;

	public UserInternalPrintingUploadCSVFIleWithoutStudentNameSteps(TestContext context) {
		System.out.println("Started Internal Printing Upload CSV File Withou Student Name steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		emptystudentname1 = testContext.getPageObjectManager().getemptystudentname1();

	}

	
	@Given("^Log in with  valid Username and Password$")
	public void Log_in_with_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^User navigate to  Certificates type$")
	public void User_navigate_to_Certificates_type() throws Throwable {
		emptystudentname1.UsernavigatetoCertificatestype();
	}

	@When("^user select the Internal Printing$")
	public void user_select_the_Internal_Printing() throws Throwable {
		emptystudentname1.userselecttheInternalPrinting();
	}

	@When("^User choose the appropriate Certificate$")
	public void User_choose_the_appropriate_Certificate() throws Throwable {
		emptystudentname1.UserchoosetheappropriateCertificate();
	}

	@When("^Uploading the CSV File empty student column$")
	public void Uploading_the_CSV_File_empty_student_column() throws Throwable {
		emptystudentname1.UploadingtheCSVFileemptystudentcolumn();
	}

	@Then("^Error message indicating$")
	public void Error_message_indicating() throws Throwable {
		emptystudentname1.Errormessageindicating();
	}
}
