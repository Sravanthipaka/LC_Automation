package com.cucumber.stepdefination;

import org.openqa.selenium.WebDriver.Navigation;

import com.cucumber.PageObjects.AdminRateContractListPageObjects;
import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminRateContractListSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminRateContractListPageObjects ratecontract;

	public AdminRateContractListSteps(TestContext context) {
		System.out.println("Started CL2plus1 Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		ratecontract = testContext.getPageObjectManager().getratecontract();
	}
	@Given("^Login through the valid Username and Password$")
	public void login_through_the_valid_Username_and_Password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@When("^Click on Institution tab$")
	public void click_on_Institution_tab() throws Throwable {
	    ratecontract.ClickonInstitutiontab();
	}

	@Then("^Click on RateContract option$")
	public void click_on_RateContract_option() throws Throwable {
		ratecontract.ClickonRateContractoption();
	}

	@Then("^Click on Download icon$")
	public void click_on_Download_icon() throws Throwable {
		ratecontract.Clickondownloadicon();
		Thread.sleep(2000);

	}

	@Then("^Click on Prepaid radio button$")
	public void click_on_Prepaid_radio_button() throws Throwable {
		ratecontract.ClickonPrepaidradiobutton();
	}

	@Then("^Click on Postpaid Radio button$")
	public void click_on_Postpaid_Radio_button() throws Throwable {
		ratecontract.ClickonPostpaidRadiobutton();
	}
//	@Then("^Click on Pages$")
//	public void click_on_pages() throws Throwable {
//		ratecontract.Clickonpages();
//	}
}
