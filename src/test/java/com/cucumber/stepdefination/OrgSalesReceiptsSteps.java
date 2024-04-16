package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtChangePasswordPageObjects;
import com.cucumber.PageObjects.OrgSalesReceiptsPageObjects;
import com.cucumber.PageObjects.OrgSalesViewInstitutionsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgSalesReceiptsSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgSalesReceiptsPageObjects salesreceipts;

	public OrgSalesReceiptsSteps(TestContext context) {
		System.out.println("Started Organization Sales Receipts Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		salesreceipts = testContext.getPageObjectManager().getsalesreceipts();

	}

	@Given("^Login by the Username(\\d+) and Password(\\d+)$")
	public void login_by_the_Username_and_Password(int arg1, int arg2) throws Throwable {
		login.Logintoappln("pavan123", "Global12@");
		Thread.sleep(30000);
	}

	@When("^Click on the Reports$")
	public void click_on_the_Reports() throws Throwable {
		salesreceipts.ClickontheReports();
	}

	@Then("^Click on the Receipts option$")
	public void click_on_the_Receipts_option() throws Throwable {
		salesreceipts.ClickontheReceiptsoption();
	}

	@Then("^Click on the Overall Organization Receipts$")
	public void click_on_the_Overall_Organization_Receipts() throws Throwable {
		salesreceipts.ClickontheOverallOrganizationReceipts();
	}

	@Then("^Click on the InstitutionWise Receipts and Select the Institution Name from dropdown$")
	public void click_on_the_InstitutionWise_Receipts() throws Throwable {
		salesreceipts.ClickontheInstitutionWiseReceiptsandSelecttheInstitutionNamefromdropdown();
	}

}