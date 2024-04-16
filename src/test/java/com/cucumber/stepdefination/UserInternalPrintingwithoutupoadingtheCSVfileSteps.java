package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserInternalPrintingwithoutuploadingCSVfilePageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserInternalPrintingwithoutupoadingtheCSVfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingwithoutuploadingCSVfilePageObjects interprintwithempty;


	public UserInternalPrintingwithoutupoadingtheCSVfileSteps(TestContext context) {
		System.out.println("Started UserVerifiedCertificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		interprintwithempty = testContext.getPageObjectManager().getinterprintwithempty();

	}

	@Given("^login with Valid Username and Password$")
	public void login_with_Valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^click on Certificates Menu$")
	public void click_on_Certificates_Menu() throws Throwable {
		interprintwithempty.clicktheCertificatestype();
	}

	@When("^Select verified certificates$")
	public void select_verified_certificates() throws Throwable {
		interprintwithempty.clicktheverifiedcertificates();
	}

	@Then("^select Certificates typ$")
	public void select_Certificates_typ() throws Throwable {
		interprintwithempty.selectCertificatestype();
	}

	@Then("^click Next button$")
	public void click_Next_button() throws Throwable {
		interprintwithempty.clickontheNextbutton();
	}
}