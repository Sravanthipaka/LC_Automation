package com.cucumber.stepdefination;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects;
import com.cucumber.managers.WebDriverManager;
import com.cucumber.utility.Constants;
import com.cucumber.utility.TestContext;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserGenerateBulkByUploadCSVFileWithInvalidCertificateNameSteps {

	TestContext testContext;
	LoginPageObjects login;
	UserGenerateBulkByUploadCSVFileWithInvalidCertificateNamePageObjects invalidcertificatename;
	
	public UserGenerateBulkByUploadCSVFileWithInvalidCertificateNameSteps(TestContext context) {
		this.testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		invalidcertificatename = testContext.getPageObjectManager().getinvalidcertificatename();

	}

	
     @Given("^the application is already running good$")
	public void the_application_is_already_running_good() throws Throwable {
	    
	}

	@When("^the User logs in using their valid credentials s$")
	public void the_User_logs_in_using_their_valid_credentials_s() throws Throwable {
		login.Logintoappln("SahUser", "User@1"); 
	}

	@Then("^a popup window should appear clear$")
	public void a_popup_window_should_appear_clear() throws Throwable {
	   System.out.println("login done");
	}

	@Then("^the User navigates to the \"([^\"]*)\" section further$")
	public void the_User_navigates_to_the_section_further(String arg1) throws Throwable {
		invalidcertificatename.ClickOnCertificates();
	   
	}

	@Then("^selects \"([^\"]*)\" from the menu options for click$")
	public void selects_from_the_menu_options_for_click(String arg1) throws Throwable {
		invalidcertificatename.clickOnGenerateBulk();
	    
	}

	@Then("^chooses an option from the dropdown list for select$")
	public void chooses_an_option_from_the_dropdown_list_for_select() throws Throwable {
		invalidcertificatename.clickOndropDown();
	    
	}

	@Then("^uploads both a JPG and a CSV file parallely$")
	public void uploads_both_a_JPG_and_a_CSV_file_parallely() throws Throwable {
		invalidcertificatename.files_upload();
	}

	@Then("^checks the checkbox before clicking on the save button and clicks$")
	public void checks_the_checkbox_before_clicking_on_the_save_button_and_clicks() throws Throwable {
		//invalidcertificatename.next_button();
	}


}