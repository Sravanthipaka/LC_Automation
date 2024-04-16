package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminBacktotopbuttonPageObjects;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserBacktotopbuttonPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminBacktotopbuttonSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminBacktotopbuttonPageObjects adminbacktotop;

	public AdminBacktotopbuttonSteps(TestContext context) {
		System.out.println("Started User Backtotop button ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminbacktotop = testContext.getPageObjectManager().getadminbacktotop();
	}
	@Given("^login the admin with Username and password$")
	public void login_the_admin_with_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^scroll on bar$")
	public void scroll_on_bar() throws Throwable {
		adminbacktotop.scrollthebar();
	}
	
	@Then("^Click on the back to top$")
	public void Click_on_the_back_to_top() throws Throwable {
		adminbacktotop.Clickonthebacktotop();
	}


}