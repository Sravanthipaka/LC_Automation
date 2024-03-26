package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtChangePasswordPageObjects;
import com.cucumber.PageObjects.OrgSalesViewInstitutionsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgSalesViewInstitutionsSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgSalesViewInstitutionsPageObjects orgsalesviewinstitutions;

	public OrgSalesViewInstitutionsSteps(TestContext context) {
		System.out.println("Started Organization Sales View Institutions Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		orgsalesviewinstitutions = testContext.getPageObjectManager().getorgsalesviewinstitutions();
	 
	}
	
    @Given("^Login by the Username and Password$")
	public void login_by_the_Username_and_Password() throws Throwable {
		login.Logintoappln("pavan123", "Global12@");
		Thread.sleep(4000);
	}

	@When("^click the institutions option$")
	public void click_the_institutions_option() throws Throwable {
		orgsalesviewinstitutions.clicktheinstitutionsoption();
	}

	@Then("^click the view institutions$")
	public void click_the_view_institutions() throws Throwable {
		orgsalesviewinstitutions.clicktheviewinstitutions();
	}

	@Then("^click the create institution$")
	public void click_the_create_institution() throws Throwable {
		orgsalesviewinstitutions.clickthecreateinstitution();
	}

	@Then("^Enter the Institution Name$")
	public void enter_the_Institution_Name() throws Throwable {
		orgsalesviewinstitutions.EntertheInstitutionName();
	}

	@Then("^click the Back the Click the edit option$")
	public void click_the_Back_the_Click_the_edit_option() throws Throwable {
		orgsalesviewinstitutions.clicktheBackthecreditsoption();
	}

	@Then("^click the Back the credits option$")
	public void click_the_Back_the_credits_option() throws Throwable {
		orgsalesviewinstitutions.clicktheBackthecreditsoption();
	}

	@Then("^click back and Rate Contracts$")
	public void click_back_and_Rate_Contracts() throws Throwable {
		orgsalesviewinstitutions.clickbackandRateContracts();
	}

}