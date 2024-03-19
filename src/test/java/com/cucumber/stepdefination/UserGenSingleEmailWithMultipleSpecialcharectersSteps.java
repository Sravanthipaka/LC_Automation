package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCXfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingDOCfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPEGfilePageObjects;
import com.cucumber.PageObjects.UserBulkByUploadingJPGfilePageObjects;
import com.cucumber.PageObjects.UserBulkWithoutApprovalPageObjects;
import com.cucumber.PageObjects.UserBulkWithoutSelectingCertificatetype;
import com.cucumber.PageObjects.UserGenSingleEmailWithMultipleSpecialcharectersPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserGenSingleEmailWithMultipleSpecialcharectersSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserGenSingleEmailWithMultipleSpecialcharectersPageObjects invalidemail1;

	public UserGenSingleEmailWithMultipleSpecialcharectersSteps(TestContext context) {
		System.out.println("Started Generate Single with invalid Email id");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidemail1 = testContext.getPageObjectManager().getinvalidemail1();
	}


	@Given("^login the username and password$")
	public void login_the_username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^Click the Certificate and click on the Generate Single option$")
	public void Click_the_Certificate_and_click_on_the_Generate_Single_option() throws Throwable {
		invalidemail1.ClicktheCertificateandclickontheGenerateSingleoption();
	}

	@Then("^Click on the Certificate type dropdown and select the certificate type$")
	public void Click_on_the_Certificate_type_dropdown_and_select_the_certificate_type() throws Throwable {
		invalidemail1.ClickontheCertificatetypedropdownandselectthecertificatetype();
	}

	@Then("^fill all the required fields$")
	public void fill_all_the_required_fields() throws Throwable {
		invalidemail1.fillalltherequiredfields();
	}
	
	@Then("^enter the multiple special charecters into email id field$")
	public void enter_the_multiple_special_charecters_into_email_id_field() throws Throwable {
		invalidemail1.enterthemultiplespecialcharectersintoemailidfield();
	}
	@Then("^click on the Next button$")
	public void click_on_the_Next_button() throws Throwable {
		invalidemail1.clickontheNextbutton();
	}

}