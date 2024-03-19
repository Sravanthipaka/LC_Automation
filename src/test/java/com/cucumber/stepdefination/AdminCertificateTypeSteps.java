package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminCertificateTypePageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminCertificateTypeSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminCertificateTypePageObjects admincertificatetype;

	public AdminCertificateTypeSteps(TestContext context) {
		System.out.println("Started Institution Admin_ Certificate Types");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		admincertificatetype = testContext.getPageObjectManager().getadmincertificatetype();
	}

	@Given("^login of Admin with Username and password$")
	public void login_of_Admin_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^click by Institutions dropdown$")
	public void click_by_Institutions_dropdown() throws Throwable {
		admincertificatetype.clickbyInstitutionsdropdown();
	}

	@Then("^select the Certificate Types$")
	public void select_the_Certificate_Types() throws Throwable {
		admincertificatetype.selecttheCertificateTypes();
	}

	@Then("^click on the Certificate Type$")
	public void click_on_the_Certificate_Type() throws Throwable {
		admincertificatetype.clickontheCertificateType();
	}

	@Then("^edit the fields$")
	public void edit_the_fields() throws Throwable {
		admincertificatetype.editthefields();
	}

	@Then("^click on GO$")
	public void click_on_GO() throws Throwable {
		admincertificatetype.clickonGO();
	}

}