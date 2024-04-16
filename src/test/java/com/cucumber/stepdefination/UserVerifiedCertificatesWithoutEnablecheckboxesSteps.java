package com.cucumber.stepdefination;
import org.openqa.selenium.WebDriver;

import com.cucumber.PageObjects.UserInternalPrintingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects;

import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class UserVerifiedCertificatesWithoutEnablecheckboxesSteps 
{
	TestContext testContext;
	LoginPageObjects login;
	UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects verifiedcertificates;



	public UserVerifiedCertificatesWithoutEnablecheckboxesSteps(TestContext context) 
	{
		System.out.println("Started Add Certificate Type ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verifiedcertificates=new UserVerifiedCertificatesWithoutEnablecheckboxesPageObjects(Constants.driver);

	}

	@Given("^logging to application$")
	public void logging_to_application() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Given("^Clickon reportsverifiedCertificate$")
	public void clickon_reportsverifiedCertificate() throws Throwable {
		verifiedcertificates.clcikonreportsandgenearatedcertiifcates();

	}

	@When("^select value certificate$")
	public void select_value_certificate() throws Throwable {
		verifiedcertificates.selectValueCertificate();
	}

	@When("^perform click operation$")
	public void perform_click_operation() throws Throwable {
		verifiedcertificates.performclickoperation();
	}

}