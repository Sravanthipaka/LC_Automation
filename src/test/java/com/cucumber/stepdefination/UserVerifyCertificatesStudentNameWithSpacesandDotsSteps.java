package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifiedCertificatesPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificatesStudentNameWithSpacesandDotsSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificatesStudentNameWithSpacesandDotsPageObjects verifStuDots;
	

	public UserVerifyCertificatesStudentNameWithSpacesandDotsSteps(TestContext context) {
		System.out.println("Started User Verify Certificates with Spaces and Dots in Student name steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		verifStuDots = testContext.getPageObjectManager().getverifStuDots();

	}
	
	@Given("^login with Username and Password$")
	public void login_with_Username_and_Password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000); 
	}

	@When("^click on Certificates Tab And verified certificates$")
	public void click_on_Certificates_Tab_And_verified_certificates() throws Throwable {
		verifStuDots.clicktheCertificatestypetab();
		Thread.sleep(2000);
		verifStuDots.clicktheverifiedcertificates(); 
		Thread.sleep(2000);
	}

	@Then("^select the Certificates type$")
	public void select_the_Certificates_type() throws Throwable {
		verifStuDots.selectCertificatestype();
		
	}

	@Then("^enter  the StudentDetails$")
	public void enter_the_StudentDetails() throws Throwable {
		verifStuDots.enterStudentDetails();
		
	}

	@Then("^enter the VerifierDetails$")
	public void enter_the_VerifierDetails() throws Throwable {
		verifStuDots.enterVerifierDetailsclickontheQRCodeicon(); 
		
	}

	@Then("^click the Next button$")
	public void click_the_Next_button() throws Throwable {
		verifStuDots.clickontheNextbutton();
		
	}
	
	
}
