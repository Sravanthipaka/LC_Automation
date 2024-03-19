package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtViewInstitutionsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgMgmtViewInstitutionsSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgMgmtViewInstitutionsPageObjects orgmgmtview;

	public OrgMgmtViewInstitutionsSteps(TestContext context) {
		System.out.println("Started OrganizationManagement Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		orgmgmtview = testContext.getPageObjectManager().getorgmgmtview();
	}

	@Given("^Login to Username and Password$")
	public void login_Username_and_Password() throws Throwable {
		login.Logintoappln("sravanthiom", "Org@12");

	}
	
	@When("^click on Institutions Tab$")
	public void click_on_Institutions_Tab() throws Throwable {
		orgmgmtview.clickOnInstitutions();

	}

	@Then("^click on View Institutions$")
	public void click_on_View_Institutions() throws Throwable {
		orgmgmtview.clickOnviewinstitutions();

	}
	
	@Then("^click on Create Institution button$")
	public void click_on_Create_Institution_button() throws Throwable {
		orgmgmtview.clickoncreateinstitutionbutton();

	}
	@Then("^enter the institution name$")
	public void enter_the_institution_name() throws Throwable {
		orgmgmtview.entertheinstitutionName();

	}

	@Then("^click on back and click on Edit button$")
	public void click_on_back_and_click_on_Edit_button() throws Throwable {
		orgmgmtview.clickoneditbutton();

	}

	@Then("^click on back and Credits button$")
	public void click_on_back_and_Credits_button() throws Throwable {
		orgmgmtview.clickoncreditsbutton();

	}

	@Then("^click Back and rate contracts$")
	public void click_Back_and_rate_contracts() throws Throwable {
		orgmgmtview.clickbackandratecontracts();

	}
	
}
