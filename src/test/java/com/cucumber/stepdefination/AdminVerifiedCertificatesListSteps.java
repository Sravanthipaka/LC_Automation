package com.cucumber.stepdefination;

import org.openqa.selenium.WebDriver.Navigation;

import com.cucumber.PageObjects.AdminRateContractListPageObjects;
import com.cucumber.PageObjects.AdminVerifiedCertificatesPageObjects;
import com.cucumber.PageObjects.ApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminVerifiedCertificatesListSteps {
	TestContext testContext;
	LoginPageObjects login;
	ApprovalSettingPageObjects approval;
	AdminVerifiedCertificatesPageObjects verify;

	public AdminVerifiedCertificatesListSteps(TestContext context) {
		System.out.println("Started Verified Certificates steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verify = testContext.getPageObjectManager().getverify();
	}
	
	@Given("^Login to the Admin by using Username and Password$")
	public void login_to_the_Admin_by_using_Username_and_Password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@When("^Click on Reports tab$")
	public void click_on_Reports_tab() throws Throwable {
	    verify.ClickonReportstab();
	}

	@Then("^click on Verified Certificates$")
	public void click_on_Verified_Certificates() throws Throwable {
	    verify.clickOnVerifiedCertificates();
	}

	@Then("^click on Sendmail icon then click on ok button$")
	public void click_on_Sendmail_icon_then_click_on_ok_button() throws Throwable {
	   verify.clickOnSendMailicon();
	   verify.ClickonOkbutton();
	}

	@Then("^click on Download Source File$")
	public void click_on_Download_Source_File() throws Throwable {
	    verify.clickOnDownloadSourceFileicon();
	}

	@Then("^click on Download Key file$")
	public void click_on_Download_Key_file() throws Throwable {
	    verify.clickOnDownloadKeyFileicon();
	}

	@Then("^Select Student Checkbox then again click on OK$")
	public void select_Student_Checkbox_then_again_click_on_OK() throws Throwable {
	    verify.studentheader();
	    verify.bulkDrop();  
	    verify.sendmailinactions();
	    verify.clickonGoandOk();
	

	}
	}


	