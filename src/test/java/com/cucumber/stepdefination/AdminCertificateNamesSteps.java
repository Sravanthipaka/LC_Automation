package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminCertificateNamesSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminCertificateNamesPageObjects certificateNames;

	public AdminCertificateNamesSteps(TestContext context) {
		System.out.println("Started Institutions Certificate Names ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		certificateNames = testContext.getPageObjectManager().getcertificateNames();
	}
	@Given("^login through at the Admin with Username and password$")
	public void login_through_at_the_Admin_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^click by Institution dropdown$")
	public void click_by_Institution_dropdown() throws Throwable {
		certificateNames.clickbyInstitutiondropdown();
	}


	@Then("^select on Certificate Names$")
	public void select_on_Certificate_Names() throws Throwable {
		certificateNames.selectonCertificateNames();
	}

	@Then("^click on Edit button$")
	public void click_on_Edit_button() throws Throwable {
		certificateNames.clickonEditbutton();
	}

	@Then("^clear on Certificate Name$")
	public void clear_on_Certificate_Name() throws Throwable {
		certificateNames.clearonCertificateName();
	}

	@Then("^enter by Certificate Name$")
	public void enter_by_Certificate_Name() throws Throwable {
		certificateNames.enterbyCertificateName();
	}

	@Then("^Update of Certificate Name$")
	public void Update_of_Certificate_Name() throws Throwable {
		certificateNames.UpdateofCertificateName();
	}

}