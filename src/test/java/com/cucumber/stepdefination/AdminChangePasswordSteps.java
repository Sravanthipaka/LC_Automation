package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminChangePasswordPageObjects;
import com.cucumber.PageObjects.ApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminChangePasswordSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminChangePasswordPageObjects achangepwd;

	public AdminChangePasswordSteps(TestContext context) {
		System.out.println("Started InstituteAdminChangePassword Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		achangepwd = testContext.getPageObjectManager().getachangepwd();
	 
	}
	@Given("^Login with valid Username and Password$")
	public void login_with_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("AnuAdmin", "Admin@1");
	}

	@Then("^Click the Settings options$")
	public void click_the_Settings_options() throws Throwable {
		achangepwd.clicktheSettingsoptions();
	}

	@Then("^Click the Change Password field$")
	public void click_the_Change_Password_field() throws Throwable {
		achangepwd.clickthechangepasswordfield();
	}

	@Then("^Enter the Current Password field$")
	public void enter_the_Current_Password_field() throws Throwable {
		achangepwd.enterthecurrentpasswordfield();
	}

	@Then("^Enter the New Password field$")
	public void enter_the_New_Password_field() throws Throwable {
		achangepwd.enterthenewpasswordfield();
	}

	@Then("^Re Enter the New Password field$")
	public void re_Enter_the_New_Password_field() throws Throwable {
		achangepwd.Reenterthenewpasswordfield();
	}

	@Then("^Click the Update button then Click the OK$")
	public void click_the_Update_button_then_Click_the_OK() throws Throwable {
		achangepwd.clicktheupdatebuttonandclicktheok();
	    
	}

	@Then("^Click Sign Out page$")
	public void click_Sign_Out_page() throws Throwable {
		achangepwd.clicksignoutpage();
	}
} 