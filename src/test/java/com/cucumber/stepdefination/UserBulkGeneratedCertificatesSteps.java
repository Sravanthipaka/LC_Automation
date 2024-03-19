package com.cucumber.stepdefination;

import org.openqa.selenium.WebDriver.Navigation;

import com.cucumber.PageObjects.AdminCreditsListPageObjects;
import com.cucumber.PageObjects.AdminRateContractListPageObjects;
import com.cucumber.PageObjects.ApprovalSettingPageObjects;
import com.cucumber.PageObjects.BulkGeneratedCertificatesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserBulkGeneratedCertificatesSteps {
	TestContext testContext;
	LoginPageObjects login;
	BulkGeneratedCertificatesPageObjects bulkgc;

	public UserBulkGeneratedCertificatesSteps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		bulkgc = testContext.getPageObjectManager().getbulkgc();
	}
	
	@Given("^Login by User by using Username and Password$")
	public void login_by_User_by_using_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@When("^Click on the Reports tab$")
	public void click_on_the_Reports_tab() throws Throwable {
		bulkgc.ClickontheReportstab();
	}

	@Then("^Click on Bulk Generated Certificates$")
	public void click_on_Bulk_Generated_Certificates() throws Throwable {
		bulkgc.ClickonBulkGeneratedCertificates();
	}

	@Then("^Click on the particular Reference id$")
	public void click_on_the_particular_Reference_id() throws Throwable {
		bulkgc.ClickontheparticularReferenceid();
	}
	}

	