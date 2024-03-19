package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificateVerifierEmailWithSpacesandDotsSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateVerifierEmailWithSpacesandDotsPageObjects verifieremail;

	public UserVerifyCertificateVerifierEmailWithSpacesandDotsSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verifieremail = testContext.getPageObjectManager().getverifieremail();

	}

	
    @Then("^Navigate to certificates$")
	public void navigate_to_certificates() throws Throwable {
		login.Logintoappln("SahUser","User@1");
		verifieremail.navigate_to_certificates();
	}

	@Then("^click on Verify certificate$")
	public void click_on_Verify_certificate() throws Throwable {
		verifieremail.click_on_Verify_certificate();
	}

	@Then("^Select certificate Type$")
	public void select_certificate_Type() throws Throwable {
		verifieremail.select_certificate_Type();
	}

	@Then("^Enter Student details$")
	public void enter_Student_details() throws Throwable {
		verifieremail.enter_Student_details();
	}

	@Then("^Enter Verifier details$")
	public void enter_Verifier_details() throws Throwable {
		verifieremail.enter_Verifier_details();
	}

	@Then("^click on Next$")
	public void click_on_Next() throws Throwable {
		verifieremail.click_on_Next();
	}

}
