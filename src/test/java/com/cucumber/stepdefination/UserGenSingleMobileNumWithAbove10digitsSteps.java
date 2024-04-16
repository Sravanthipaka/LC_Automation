package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.PageObjects.UserGenSingleMobileNumWithAbove10digitsPageObjects;
import com.cucumber.PageObjects.UserGenSingleMobileNumWithless10digitsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleMobileNumWithAbove10digitsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleMobileNumWithAbove10digitsPageObjects genwithinvalidmobilenum1;

	public UserGenSingleMobileNumWithAbove10digitsSteps(TestContext context) {
		System.out.println("Started Generate Single Mobile Number with Above 10 digits ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		genwithinvalidmobilenum1 = testContext.getPageObjectManager().getgenwithinvalidmobilenum1();
	}
	

	@Given("^login through User Username and Password$")
	public void login_through_User_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click the certificate1 and click the generate1 single$")
	public void click_the_certificate1_and_click_the_generate1_single() throws Throwable {
		genwithinvalidmobilenum1.clickthecertificate1andclickthegenerate1single();
	}

	@Then("^click the Certificate type1 Dropdown1 Select the Certificate Type3$")
	public void click_the_Certificate_type1_Dropdown1_Select_the_Certificate_Type3() throws Throwable {
		genwithinvalidmobilenum1.clicktheCertificatetype1Dropdown1SelecttheCertificateType3();
	}

	@Then("^fill by the required fields3$")
	public void fill_by_the_required_fields3() throws Throwable {
		genwithinvalidmobilenum1.fillbytherequiredfields3();
	}

}