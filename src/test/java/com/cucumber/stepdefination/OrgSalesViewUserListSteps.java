package com.cucumber.stepdefination;

import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgSalesChangePasswordPageObjects;
import com.cucumber.PageObjects.OrgSalesViewUserListPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrgSalesViewUserListSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgSalesViewUserListPageObjects userlist;

	public OrgSalesViewUserListSteps(TestContext context) {
		System.out.println("Started OrgSalesChangePassword Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		userlist = testContext.getPageObjectManager().getuserlist();
	}
	
	@Given("^Login through a valid Username and valid Password$")
	public void login_through_a_valid_Username_and_valid_Password() throws Throwable {
		login.Logintoappln("pavan123", "Global12@");
		Thread.sleep(30000);	}

	@Then("^Click on the View user list$")
	public void click_on_the_View_user_list() throws Throwable {
	   userlist.clickOnViewUserList();
	}
	@Then("^Enter the Institution name$")
	public void Enter_the_Institution_name() throws Throwable {
		userlist.EntertheinstitutionName();
	}
	@And("^Click on the impersonate option$")
	public void Click_on_the_impersonate_option() throws Throwable {
		userlist.Clickonimpersonateoption();
}
}