package com.cucumber.stepdefination;


import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserUpdateProfilePageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserUpdateProfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	private UserUpdateProfilePageObjects updateprf;
	
	public UserUpdateProfileSteps(TestContext context) {
		System.out.println("Started Updateprofile Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		updateprf = testContext.getPageObjectManager().getupdate();
		
	}
	
	@Given("^Login by valid Username and Password$")
	public void login_by_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("testinguser", "User@1");
	}

	@Then("^Click the Settings type$")
	public void click_the_Settings_type() throws Throwable {
		updateprf.clicktheSettingstype();
	}

	@Then("^Click on update profile option$")
	public void click_on_update_profile_option() throws Throwable {
		updateprf.clickonupdateprofileoption();
	}

	@Then("^Clear on first name field$")
	public void clear_on_first_name_field() throws Throwable {
		updateprf.clearonfirstnamefield();
	}

	@Then("^Enter on first name field$")
	public void enter_on_first_name_field() throws Throwable {
		updateprf.enteronfirstnamefield();
	}

	@Then("^Clear on Last Name field$")
	public void clear_on_Last_Name_field() throws Throwable {
		updateprf.clearonlastnamefield();
	}

	@Then("^Enter on Last Name field$")
	public void enter_on_Last_Name_field() throws Throwable {
		updateprf.enteronlaststnamefield();
	}

	@Then("^Clear on Email Id field$")
	public void clear_on_Email_Id_field() throws Throwable {
		updateprf.clearonemailidfield();
	}

	@Then("^Enter on Email Id field$")
	public void enter_on_Email_Id_field() throws Throwable {
		updateprf.enteronemailidfield();
	}

	@Then("^Clear on Mobile Number field$")
	public void clear_on_Mobile_Number_field() throws Throwable {
		updateprf.clearonmobilenumberfield();
	}

	@Then("^Enter on Mobile Number field$")
	public void enter_on_Mobile_Number_field() throws Throwable {
		updateprf.enteronmobilenumberfield();
	}

	@Then("^Click the Submit button and Click by ok$")
	public void click_the_Submit_button_and_click_by_ok() throws Throwable {
		updateprf.clickthesubmitbuttonandclickbyok();
	}
	
	
	}