package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminUpdateInstitutionPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminUpdateInstitutionSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminUpdateInstitutionPageObjects adminupdateinstitution;

	public AdminUpdateInstitutionSteps(TestContext context) {
		System.out.println("Started Update Institution steps ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		adminupdateinstitution = testContext.getPageObjectManager().getadminupdateinstition();
	}
	@Given("^login at the Admin Username and password$")
	public void login_at_the_Admin_Username_and_password() throws Throwable {
		login.Logintoappln("SahaAdmin", "Admin@123");
	}

	@Then("^click the settings option$")
	public void click_the_settings_option() throws Throwable {
		adminupdateinstitution.clickthesettingsoption();
	}


	@Then("^select the Update Institution$")
	public void select_the_Update_Institution() throws Throwable {
		adminupdateinstitution.selecttheUpdateInstitution();
	}

	@Then("^click on the Address field$")
	public void click_on_the_Address_field() throws Throwable {
		adminupdateinstitution.clickontheAddressfield();
	}

	@Then("^upload the Logo$")
	public void upload_the_Logo() throws Throwable {
		adminupdateinstitution.uploadtheLogo();
	}

	@Then("^select the state from dropdown$")
	public void select_the_state_from_dropdown() throws Throwable {
		adminupdateinstitution.selectthestatefromdropdown();
	}

	@Then("^click on the city and click on the contact person$")
	public void click_on_the_city_and_click_on_the_contact_person() throws Throwable {
		adminupdateinstitution.clickonthecityandclickonthecontactperson();
	}
	@Then("^click on the Email id then click on the update$")
	public void click_on_the_Email_id_then_click_on_the_update() throws Throwable {
		adminupdateinstitution.clickontheEmailidthenclickontheupdate();
	}
}