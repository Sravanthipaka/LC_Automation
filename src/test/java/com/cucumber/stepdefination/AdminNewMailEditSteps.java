package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminNewMailEditPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserNewMailEditPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminNewMailEditSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminNewMailEditPageObjects newmailedit;

	public AdminNewMailEditSteps(TestContext context) {
		System.out.println("Started Reports New mail ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		newmailedit = testContext.getPageObjectManager().getnewemailedit();
	}


	@Given("^login by at the valid Username and password$")
	public void login_by_at_the_valid_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");

	}

	@Then("^click reports$")
	public void click_reports () throws Throwable {
		newmailedit.clickreports();
	}

	@Then("^Select by generated certificates$")
	public void Select_by_generated_certificates() throws Throwable {
		newmailedit.Selectbygeneratedcertificates();
	}

	@Then("^click the edit icon and Clear Student Email$")
	public void click_the_edit_icon_and_Clear_Student_Email() throws Throwable {
		newmailedit.clicktheediticonandClearStudentEmail();
	}

	@Then("^Enter New Email$")
	public void Enter_New_Email() throws Throwable {
		newmailedit.EnterNewEmail();
    }
   @Then("^Click the Save$")
	public void Click_the_Save() throws Throwable {
	   newmailedit.ClicktheSave();
	}

}