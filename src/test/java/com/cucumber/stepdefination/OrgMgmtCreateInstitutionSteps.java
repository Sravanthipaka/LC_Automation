package com.cucumber.stepdefination;

import com.cucumber.PageObjects.CreateInstitutionPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.OrgMgmtCreateInstitutionPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrgMgmtCreateInstitutionSteps {
	TestContext testContext;
	LoginPageObjects login;
	OrgMgmtCreateInstitutionPageObjects orgmgmtcreateinstitution;
	
	public OrgMgmtCreateInstitutionSteps(TestContext context) {
		System.out.println("Started CreateInstitution ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		orgmgmtcreateinstitution = testContext.getPageObjectManager().getorgmgmtcreateinstitution();
	}
	@Given("^login for Management with Username and password$")
	public void login_for_Management() throws Throwable {
		login.Logintoappln("sankar12", "Global12$");
	}

	@Then("^click on Institutions dropdown$")
	public void click_on_Institutions_dropdown() throws Throwable {
		orgmgmtcreateinstitution.clickonInstitutionsdropdown();
	}

	@Then("^select the Create Institution$")
	public void select_the_Create_Institution() throws Throwable {
		orgmgmtcreateinstitution.selecttheCreateInstitution();
	}

	@Then("^Enter Insitution name and Select state dropdown fields$")
	public void enter_Insitution_name_and_Select_state_dropdown_fields() throws Throwable {
		orgmgmtcreateinstitution.EnterInstitution();
	   
	}

	@Then("^Enter City and Address fields$")
	public void enter_City_and_Address_fields() throws Throwable {
		orgmgmtcreateinstitution.EnterCityAndAddressFields();
	}

	@Then("^Upload the logo$")
	public void upload_the_logo() throws Throwable {
		orgmgmtcreateinstitution.UploadLogo();
	}

	@Then("^Select the Network dropdown$")
	public void select_the_Network_dropdown() throws Throwable {
		orgmgmtcreateinstitution.EnterNetworkDropdown();
	}

	@Then("^Enter the Contact person and Email Id fields$")
	public void enter_the_Contact_person_and_Email_Id_fields() throws Throwable {
		orgmgmtcreateinstitution.EnterContactandEmail();
	}

	@Then("^click on Submit$")
	public void click_on_Submit() throws Throwable {
		orgmgmtcreateinstitution.EnterSubmit();
	}


}