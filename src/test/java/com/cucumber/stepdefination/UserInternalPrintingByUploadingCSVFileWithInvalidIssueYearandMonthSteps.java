package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthPageObjects invaliyearmonth;
	

	public UserInternalPrintingByUploadingCSVFileWithInvalidIssueYearandMonthSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invaliyearmonth = testContext.getPageObjectManager().getinvaliyearmonth();

	}

	@Given("^I log in with a valid Username and Password$")
	public void i_log_in_with_a_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^navigate to the Certificates type tab$")
	public void navigate_to_the_Certificates_type_tab() throws Throwable {
		invaliyearmonth.navigate_to_the_Certificates_type_tab();
	}

	@When("^select the internal printing option$")
	public void select_the_internal_printing_option() throws Throwable {
		invaliyearmonth.select_the_internal_printing_option();
	}

	@When("^choose the appropriate Certificate type$")
	public void choose_the_appropriate_Certificate_type() throws Throwable {
		invaliyearmonth.choose_the_appropriate_Certificate_type(); 
	}

	@When("^upload the CSV file with invalid issue year and month$")
	public void upload_the_CSV_file_with_invalid_issue_year_and_month() throws Throwable {
		invaliyearmonth.upload_the_CSV_file_with_invalid_issue_year_and_month(); 
	}

	@Then("^an error message should be displayed$")
	public void an_error_message_should_be_displayed() throws Throwable {
		invaliyearmonth.an_error_message_should_be_displayed();
	}
}
