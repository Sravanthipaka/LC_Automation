package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGuidelinesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGuidelinesSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGuidelinesPageObjects guidelines;

	public UserGuidelinesSteps(TestContext context) {
		System.out.println("Started Guidelines links");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		guidelines = testContext.getPageObjectManager().getguidelines();
	}


	@Given("^login user by Username and password$")
	public void login_user_by_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click on certificates1 dropdown$")
	public void click_on_certificates1_dropdown() throws Throwable {
		guidelines.clickoncertificates1dropdown();
	}

	@Then("^select the Generate single$")
	public void select_the_Generate_single() throws Throwable {
		guidelines.selecttheGeneratesingle();
	}

	@Then("^select the Certificate type1$")
	public void select_the_Certificate_type1() throws Throwable {
		guidelines.selecttheCertificatetype1();
	}

	@Then("^click on Guidelines1 link and navigate back$")
	public void click_on_Guidelines1_link_and_navigate_back() throws Throwable {
		guidelines.clickonGuidelines1linkandnavigateback();
	}

	@Then("^click on certificates2 dropdown$")
	public void click_on_certificates2_dropdown() throws Throwable {
		guidelines.clickoncertificates2dropdown();

	}

	@Then("^click with Generate Bulk$")
	public void click_with_Generate_Bulk() throws Throwable {
		guidelines.clickwithGenerateBulk();

	}

	@Then("^select the certificate type2$")
	public void select_the_certificate_type2() throws Throwable {
		guidelines.selectthecertificatetype2();
	}

	@Then("^click on Guidelines2 link and navigate back$")
	public void click_on_Guidelines2_link_and_navigate_back() throws Throwable {
		guidelines.clickonGuidelines2linkandnavigateback();
	}

}