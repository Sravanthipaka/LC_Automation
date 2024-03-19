package com.cucumber.stepdefination;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserNewMailEditPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserNewMailEditSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserNewMailEditPageObjects newmail;

	public UserNewMailEditSteps(TestContext context) {
		System.out.println("Started Reports New mail ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		newmail = testContext.getPageObjectManager().getnewmail();
	}


	@Given("^login with Username and password$")
	public void login_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");

	}

	@Then("^click on Reports dropdown$")
	public void click_on_Reports_dropdown() throws Throwable {
		newmail.clickonReportsdropdown();
	}

	@Then("^select the Generated Certificates$")
	public void select_the_Generated_Certificates() throws Throwable {
		newmail.selecttheGeneratedCertificates();
	}

	@Then("^click on Edit Icon and clear student email$")
	public void click_on_Edit_Icon_and_enter_student_email() throws Throwable {
		newmail.clickonEditIconandclearstudentemail();
	}

	@Then("^enter new email$")
	public void enter_new_email() throws Throwable {
		newmail.enternewemail();	

	}


	@Then("^click on save$")
	public void click_on_save() throws Throwable {
		newmail.clickonsave();
	}

}