package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserVerifyCertificateWithEmptyStudentNamePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserVerifyCertificatesWithEmptyStudentNameSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserVerifyCertificateWithEmptyStudentNamePageObjects Verifstuname;
	

	public UserVerifyCertificatesWithEmptyStudentNameSteps(TestContext context) {
		System.out.println("Started User Verifstunamey certificates with empty student name steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		Verifstuname = testContext.getPageObjectManager().getVerifstuname();

	}
	
	@Given("^the user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
		Thread.sleep(2000);
	}

	@When("^click the Certificates type tab$")
	public void click_the_Certificates_type_tab() throws Throwable {
		Verifstuname.clicktheCertificatestypetab();
		Thread.sleep(2000);
	}

	@Then("^click by verify certificates$")
	public void click_by_verify_certificates() throws Throwable {
		Verifstuname.clicktheverifiedcertificates(); 
		Thread.sleep(2000);
	}

	@Then("^select Certificates type$")
	public void select_Certificates_type() throws Throwable {
		Verifstuname.selectCertificatestype();
		Thread.sleep(2000);
	}

	@Then("^enter Student Details$")
	public void enter_Student_Details() throws Throwable {
		Verifstuname.enterStudentDetails();
		Thread.sleep(2000);
	}

	@Then("^enter Verifier Details$")
	public void enter_Verifier_Details() throws Throwable {
		Verifstuname.enterVerifierDetailsclickontheQRCodeicon();
		Thread.sleep(2000);
	}

	@Then("^click on the next button$")
	public void click_on_the_next_button() throws Throwable {
		Verifstuname.clickontheNextbutton();
		Thread.sleep(2000);
	}


}