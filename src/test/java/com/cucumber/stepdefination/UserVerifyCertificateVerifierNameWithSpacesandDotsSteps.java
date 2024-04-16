package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateVerifierNameWithSpacesandDotsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificateVerifierNameWithSpacesandDotsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateVerifierNameWithSpacesandDotsPageObjects invalidverifiername1;
	

	public UserVerifyCertificateVerifierNameWithSpacesandDotsSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidverifiername1 = testContext.getPageObjectManager().getinvalidverifiername1();

	}
	@Given("^I log in with a Username and Password$")
	public void i_log_in_with_a_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^I go to the Certificates section$")
	public void i_go_to_the_Certificates_section() throws Throwable {
		invalidverifiername1.i_go_to_the_Certificates_section();
	}

	@When("^choose the option for verified certificates$")
	public void choose_the_option_for_verified_certificates() throws Throwable {
		invalidverifiername1.choose_the_option_for_verified_certificates();
	}

	@When("^pick a specific Certificate type$")
	public void pick_a_specific_Certificate_type() throws Throwable {
		invalidverifiername1.pick_a_specific_Certificate_type();
	}

	@When("^complete the Student Details section$")
	public void complete_the_Student_Details_section() throws Throwable {
		invalidverifiername1.complete_the_Student_Details_section();
	}

	@When("^input spaces and dots in the Verifier name field$")
	public void input_spaces_and_dots_in_the_Verifier_name_field() throws Throwable {
		invalidverifiername1.input_spaces_and_dots_in_the_Verifier_name_field();
	}

	@When("^click the Next Button$")
	public void click_the_Next_Button() throws Throwable {
		invalidverifiername1.click_the_Next_Button();
	}

}
