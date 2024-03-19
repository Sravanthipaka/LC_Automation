package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.PageObjects.UserGenSingleMobileNumWithless10digitsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleMobileNumWithless10digitsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleMobileNumWithless10digitsPageObjects genwithinvalidmobilenum;

	public UserGenSingleMobileNumWithless10digitsSteps(TestContext context) {
		System.out.println("Started Dashboard RecentCertificateGenerations Certificatetype dropdown ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		genwithinvalidmobilenum = testContext.getPageObjectManager().getgenwithinvalidmobilenum();
	}
	

	@Given("^login institution2 user by giving username and password$")
	public void login_institution2_user_by_giving_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^click certificate and click the generate single2$")
	public void click_certificate_and_click_the_generate_single2() throws Throwable {
		genwithinvalidmobilenum.ClickCertificateandClickGenerateSingle2();
	}

	@Then("^click Certificate type Dropdown1 Select Certificate Type2$")
	public void click_Certificate_type_Dropdown1_Select_Certificate_Type2() throws Throwable {
		genwithinvalidmobilenum.ClickCertificateTypeDropdown1SelectCertificateType2();
	}

	@Then("^fill the required fields2$")
	public void fill_the_required_fields2() throws Throwable {
		genwithinvalidmobilenum.FilltheRequiredFields2();
	}

}