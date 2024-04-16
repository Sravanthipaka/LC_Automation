package com.cucumber.stepdefination;
import com.cucumber.PageObjects.AdminCertificateNamesPageObjects;
import com.cucumber.PageObjects.AdminDashboardGenerationsandVerificationsCountPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.UserDashboardGenerationsandVerificationsCountPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsCertificateTypedropdownPageObjects;
import com.cucumber.PageObjects.UserDashboardRecentCertificateGenerationsPageObjects;
import com.cucumber.PageObjects.UserDashboardViewAllGenerationsPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AdminDashboardGenerationsandVerificationCountSteps {
	TestContext testContext;
	LoginPageObjects login;
	AdminDashboardGenerationsandVerificationsCountPageObjects admingenandvencount;

	public AdminDashboardGenerationsandVerificationCountSteps(TestContext context) {
		System.out.println("Started Dashboard Graphs Generations and Verifications Count ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		admingenandvencount = testContext.getPageObjectManager().getadmingenandvencount();

	}

	@Given("^login by admin through username and password$")
	public void login_by_admin_through_username_and_password() throws Throwable {
		login.Logintoappln("DemoAdmin", "Admin@123");
	}

	@Then("^Scroll By Down the Page$")
	public void Scroll_By_Down_the_Page() throws Throwable {
		admingenandvencount.ScrollByDownthePage();
	}

	@Then("^Click by Generations graph View Count$")
	public void Click_by_Generations_graph_View_Count() throws Throwable {
		admingenandvencount.ClickbyGenerationsgraphViewCount();
	}

	@Then("^Click verifications graph see the count$")
	public void Click_verifications_graph_see_the_count() throws Throwable {
		admingenandvencount.Clickverificationsgraphseethecount();

	}

}