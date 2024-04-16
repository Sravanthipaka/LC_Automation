package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminApprovalSettingsSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminApprovalSettingPageObjects approval;

	public AdminApprovalSettingsSteps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		approval = testContext.getPageObjectManager().getapproval();
	}

	@Given("^Login by Admin by using Username and Password$")
	public void Login_by_admin() throws Throwable {
		login.Logintoappln("testingtest", "Admin@1");
	}

	@When("^Click on Settings dropdown then Select Settings$")
	public void Click_On_Settings_DropDown() throws Throwable {
		//approval.ClickOnlogin();
		approval.ClickOnSettings();
	}

	@Then("^Select the institution Checkbox$")
	public void Click_on_Instituion() throws Throwable {
		approval.clickOnInstitutions();

	}

	@Then("^Select the CCtostudent checkbox$")
	public void Click_On_CC_to_Student() throws Throwable {
		approval.clickOnCCtostudent();

	}

	@Then("^Select the Mail to Verifier checkbox$")
	public void Click_On_Mail_verifier() throws Throwable {
		approval.ClickonMailVeriferCheckbox();

	}

	@Then("^Select the CC to Institution verifier Checkbox$")
	public void Click_On_CC_to_Institution_verifier() throws Throwable {
		approval.selectCCtoInstitutionCheckbox();

	}

	@Then("^Select the CC to Student verifier Checkbox$")
	public void Click_On_Student_verifier() throws Throwable {
		approval.selectCCtoStudentVerifier();

	}

	@Then("^Select the Approval require for single certificate generation Checkbox$")
	public void Click_On_Single_Certificate() throws Throwable {
		approval.selectSingleApprovalCheckbox();
	}

	@Then("^Select the Approval require for bulk certificate generation Checkbox$")
	public void Click_On_bulk_Certificate() throws Throwable {
		approval.selectBulkApprovalCheckbox();
	}

	@Then("^Select the InternalPrinting Checkbox$")
	public void Click_On_Internal_Printing() throws Throwable {
		approval.selectinternalPrintingCheckbox();
	}

	@Then("^Select the EnableDownloadFiles checkbox$")
	public void Click_On_Enable_Download() throws Throwable {
		approval.selectEnableDownloadfileCheckbox();
	}

	@Then("^Click on Submitbutton the popup alert is displayed$")
	public void Click_On_Submit() throws Throwable {
		approval.clickOnSubmit();
	}

	@Then("^Click on Okbutton then singout the page$")
	public void Click_On_OK() throws Throwable {
		approval.okbutton();
		approval.clickSignOut();
	}
}
