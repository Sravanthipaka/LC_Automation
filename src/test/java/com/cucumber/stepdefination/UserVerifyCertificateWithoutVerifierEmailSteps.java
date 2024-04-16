package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateWithoutSpecialcharactersVerifierEmailPageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificateWithoutVerifierEmailSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateWithoutSpecialcharactersVerifierEmailPageObjects withoutverifieremail;

	public UserVerifyCertificateWithoutVerifierEmailSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		withoutverifieremail = testContext.getPageObjectManager().getwithoutverifieremail();

	}

	@Then("^Navigate to the certificates$")
	public void navigate_to_the_certificates() throws Throwable {
		login.Logintoappln("SahUser","User@1");
		withoutverifieremail.navigate_to_the_certificates();
	}

	@Then("^click on the Verify certificate$")
	public void click_on_the_Verify_certificate() throws Throwable {
		withoutverifieremail.click_on_the_Verify_certificate();
	}

	@Then("^Select a certificate Type$")
	public void select_a_certificate_Type() throws Throwable {
		withoutverifieremail.select_a_certificate_Type();
	}

	@Then("^Enter the Student details$")
	public void enter_the_Student_details() throws Throwable {
		withoutverifieremail.enter_the_Student_details();
	}

	@Then("^Enter the Verifier details$")
	public void enter_the_Verifier_details() throws Throwable {
		withoutverifieremail.enter_the_Verifier_details();
	}

	@Then("^click next button$")
	public void click_next_button() throws Throwable {
		withoutverifieremail.click_next_button();
	}


}