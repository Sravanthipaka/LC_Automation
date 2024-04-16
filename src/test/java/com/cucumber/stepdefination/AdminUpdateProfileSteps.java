package com.cucumber.stepdefination;

import com.cucumber.PageObjects.AdminUpdateProfilePageObjects;
import com.cucumber.PageObjects.AdminApprovalSettingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminUpdateProfileSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminUpdateProfilePageObjects updtprf;
	
	

	public AdminUpdateProfileSteps(TestContext context) {
		System.out.println("Started InstituteAdminUpdateprofile Step Definition ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		updtprf = testContext.getPageObjectManager().getupdtprf();
		
	}
	
	@Given("^Login by Username and valid Password$")
	public void login_by_Username_and_valid_Password() throws Throwable {
		login.Logintoappln("testingtest", "Admin@1");
	}

	@Then("^Click on the Settings tab$")
	public void click_on_the_Settings_tab() throws Throwable {
		updtprf.clicktheSettingstab();
	}

	@Then("^Click on the update profile$")
	public void click_on_the_update_profile() throws Throwable {
		updtprf.clickontheupdateprofile();
	}

	@Then("^Clear on the first name and Enter on the first name$")
	public void clear_on_the_first_name_and_Enter_on_the_first_name() throws Throwable {
		updtprf.clearonthefirstnameandenteronfirstname();
	}

	@Then("^Clear on the Last Name and Enter on the Last Name$")
	public void clear_on_the_Last_Name_and_Enter_on_the_Last_Name() throws Throwable {
		updtprf.clearonthelastnameandenteronlaststname();
	}

	@Then("^Clear on Email Id and Enter on Email Id$")
	public void clear_on_Email_Id_and_Enter_on_Email_Id() throws Throwable {
		updtprf.clearontheemailidandenteronemailid();
	}

	@Then("^Clear on Mobile Number and Enter on Mobile Number$")
	public void clear_on_Mobile_Number_and_Enter_on_Mobile_Number() throws Throwable {
		updtprf.clearonthemobilenumberandenteronmobilenumber();
	}

	@Then("^Click on the Submit and Click on ok$")
	public void click_on_the_Submit_and_Click_on_ok() throws Throwable {
		updtprf.clickonthesubmitandclickonok();
	}
}


	