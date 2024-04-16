package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingCombinationOffilesPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserBulkByUploadingCombinationOffilesSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserBulkByUploadingCombinationOffilesPageObjects Bulkcombo;


	public UserBulkByUploadingCombinationOffilesSteps(TestContext context) {
		System.out.println("Started BulkcomboGeneratedCertificatesSteps Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		Bulkcombo = testContext.getPageObjectManager().getBulkcombo();
	}
	
	@Given("^the user Login$")
	public void the_user_Login() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@When("^Click on the Certificates tab$")
	public void click_on_the_Certificates_tab() throws Throwable {
		Bulkcombo.ClickontheCertificatestab();
		Thread.sleep(2000);
	}

	@Then("^Click on Generated Bulk Certificates$")
	public void Click_on_Generated_Bulk_Certificates() throws Throwable {
		Bulkcombo.ClickonGeneratedBulkCertificates();
		Thread.sleep(2000);
	}

	@Then("^Select Certificate Type$")
	public void select_Certificate_Type() throws Throwable {
		Bulkcombo.SelectCertificateType();
		Thread.sleep(2000);
	}

	@Then("^Upload All Certificates$")
	public void upload_All_Certificates() throws Throwable {
		Bulkcombo.UploadAllCertificates();
		Thread.sleep(2000);
	}

	@Then("^Click Next button$")
	public void click_Next_button() throws Throwable {
		//Bulkcombo.ClickNextbutton();
		Thread.sleep(4000);
		
	}
}

