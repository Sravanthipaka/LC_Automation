package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificateVerifierNameWithAlphanumericsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateVerifierNameWithAlphanumericsPageObjects invalidverifiername;
	

	public UserVerifyCertificateVerifierNameWithAlphanumericsSteps(TestContext context) {
		System.out.println("Started User Verify Certificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidverifiername = testContext.getPageObjectManager().getinvalidverifiername();

	}

	@Given("^I log in with Username and Password$")
	public void i_log_in_with_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^I navigate to Certificates type tab$")
	public void i_navigate_to_Certificates_type_tab() throws Throwable {
		invalidverifiername.i_navigate_to_Certificates_type_tab();
	}

	@When("^select verified certificates$")
	public void select_verified_certificates() throws Throwable {
		invalidverifiername.select_verified_certificates();
	}

	@When("^choose the Certificate$")
	public void choose_the_Certificate() throws Throwable {
		invalidverifiername.choose_the_Certificate(); 
	}

	@When("^fill in the Student Details$")
	public void fill_in_the_Student_Details() throws Throwable {
		invalidverifiername.fill_in_the_Student_Details(); 
	}

	@When("^input alphanumeric characters in the Verifier name field$")
	public void input_alphanumeric_characters_in_the_Verifier_name_field() throws Throwable {
		invalidverifiername.input_alphanumeric_characters_in_the_Verifier_name_field();
	}

	@When("^click Next Button$")
	public void click_Next_Button() throws Throwable {
		invalidverifiername.click_Next_Button();
	}

}
