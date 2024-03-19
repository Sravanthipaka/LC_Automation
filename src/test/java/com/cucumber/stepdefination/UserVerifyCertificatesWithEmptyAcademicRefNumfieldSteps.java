package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificatePageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificatesWithEmptyAcademicRefNumfieldSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateWithEmptyAcademicRefNumfieldPageObjects verifycertiwithemptyrefid;

	public UserVerifyCertificatesWithEmptyAcademicRefNumfieldSteps(TestContext context) {
		System.out.println("Started User Verify Certificates with empty academic reference number field steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verifycertiwithemptyrefid = testContext.getPageObjectManager().getverifycertiwithemptyrefid();
	}

	

	@Given("^login the institution user and enter valid username and password$")
	public void login_the_institution_user_and_enter_valid_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click certificates$")
	public void click_certificates() throws Throwable {
		verifycertiwithemptyrefid.clickcertificates();
	}

	@Then("^click Verify Certificates$")
	public void click_Verify_Certificates() throws Throwable {
		verifycertiwithemptyrefid.clickVerifyCertificates();
	}

	@Then("^select certificate type(\\d+)$")
	public void select_certificate_type(int arg1) throws Throwable {
		verifycertiwithemptyrefid.selectcertificatetype1();
	}

	@Then("^fill all input fields then click on next button$")
	public void fill_all_input_fields_then_click_on_next_button() throws Throwable {
		verifycertiwithemptyrefid.fillallinputfieldsthenclickonnextbutton();
	}
}

