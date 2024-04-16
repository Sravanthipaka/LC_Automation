package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBacktotopbuttonPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserBacktotopbuttonSteps {
	TestContext testContext;
	LoginPageObjects login;
	UserBacktotopbuttonPageObjects backtotop;

	public UserBacktotopbuttonSteps(TestContext context) {
		System.out.println("Started User Backtotop button ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		backtotop = testContext.getPageObjectManager().getbacktotop();
	}
	@Given("^login the user with Username and password$")
	public void login_the_user_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	}

	@Then("^scroll the bar$")
	public void scroll_the_bar() throws Throwable {
		backtotop.scrollthebar();
	}
	
	@Then("^Click on the Back to top button$")
	public void Click_on_the_Back_to_top_button() throws Throwable {
		backtotop.ClickontheBacktotopbutton();
	}


}