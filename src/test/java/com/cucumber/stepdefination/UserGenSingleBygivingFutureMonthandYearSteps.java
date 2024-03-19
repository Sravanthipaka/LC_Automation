package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.PageObjects.UserGenSingleByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserGenSingleBygivingFutureMonthandYearPageObjects;
import com.cucumber.PageObjects.UserGenSingleEmailWithMultipleSpecialcharectersPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleBygivingFutureMonthandYearSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleBygivingFutureMonthandYearPageObjects genwithfuturemonth;

	public UserGenSingleBygivingFutureMonthandYearSteps(TestContext context) {
		System.out.println("Started Generate Single By giving Future Month and Year");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		genwithfuturemonth = testContext.getPageObjectManager().getgenwithfuturemonth();
	}


	@Given("^login institution1 user by giving username and password$")
	public void login_institution1_user_by_giving_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click certificate and click the generate single1$")
	public void click_certificate_and_click_the_generate_single1 () throws Throwable {
		genwithfuturemonth.clickcertificateandclickthegeneratesingle1();
	}

	@Then("^click Certificate type Dropdown1 Select Certificate Type1$")
	public void click_Certificate_type_Dropdown1_Select_Certificate_Type1() throws Throwable {
		genwithfuturemonth.clickCertificatetypeDropdown1SelectCertificateType1();
	}

	@Then("^fill the required fields1$")
	public void fill_the_required_fields1 () throws Throwable {
		genwithfuturemonth.filltherequiredfields1();
	}

	@Then("^Select issue month and issue year as future$")
	public void Select_issue_month_and_issue_year_as_future() throws Throwable {
		genwithfuturemonth.Selectissuemonthandissueyearasfuture();
	}



}

