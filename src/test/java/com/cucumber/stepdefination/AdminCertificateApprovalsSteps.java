package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminCertificateApprovalsPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminCertificateApprovalsSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminCertificateApprovalsPageObjects certificateapprovals;
	
	public AdminCertificateApprovalsSteps(TestContext context) {
		System.out.println("Started CreateInstitution ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		certificateapprovals = testContext.getPageObjectManager().getcertificateapprovals();
	}
	@Given("^login to Admin with Username and password$")
	public void login_to_Admin_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@1");
	}

	@Then("^click on Certificates dropdown$")
	public void click_on_Certificates_dropdown() throws Throwable {
		certificateapprovals.clickonCertificatesdropdown();
	}

	@Then("^select the Approvals$")
	public void select_the_Approvals() throws Throwable {
		certificateapprovals.selecttheApprovals();
	}

	@Then("^click on BulkApproval$")
	public void click_on_BulkApproval() throws Throwable {
		certificateapprovals.clickonBulkApproval();
	   
	}

	/*@Then("^click on OK$")
	public void click_on_Ok() throws Throwable {
	    approvals.clicktonOK();
	}*/

	@Then("^click on SingleApproval$")
	public void click_on_SingleApproval() throws Throwable {
		certificateapprovals.clickonSingleApproval();
	}

}
