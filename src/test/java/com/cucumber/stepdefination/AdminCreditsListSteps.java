package com.cucumber.stepdefination;

import org.openqa.selenium.WebDriver.Navigation;

import com.cucumber.PageObjects.AdminCreditsListPageObjects;
import com.cucumber.PageObjects.AdminRateContractListPageObjects;
import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminCreditsListSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminCreditsListPageObjects credits;
	AdminApprovalSettingPageObjects approval;

	public AdminCreditsListSteps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		credits = testContext.getPageObjectManager().getcredits();
	}
	
	
	@Given("^Login the valid Username and valid Password$")
	public void login_the_valid_Username_and_valid_Password() throws Throwable {
		login.Logintoappln("testingtest", "Admin@1");
	}

	@When("^Click on the Institution tab$")
	public void click_on_the_Institution_tab() throws Throwable {
	    credits.ClickOninstitutionstab();
	}

	@Then("^Click on Credits list$")
	public void click_on_Credits_list() throws Throwable {
	    credits.ClickonCreditslist();
	}

//	@Then("^Click pages")
//	public void Click_pages() throws Throwable {
//	   credits.Clickpages();
//	}

}

	