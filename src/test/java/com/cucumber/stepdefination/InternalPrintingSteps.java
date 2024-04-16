package com.cucumber.stepdefination;
import com.cucumber.PageObjects.UserInternalPrintingPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class InternalPrintingSteps
{
	TestContext testContext;
	LoginPageObjects login;
	UserInternalPrintingPageObjects ipo;
	
	 public InternalPrintingSteps(TestContext context) 
	 { 
		System.out.println("Started Add Certificate Type ");
		testContext = context;
		login = testContext.getPageObjectManager().getlogin();
		ipo=testContext.getPageObjectManager().getinternalptinting();
	}
	
	
	@Given("^Login to application$")
	public void login_to_application() throws Throwable {
		login.Logintoappln("SahUser", "User@1");
	    
	}

	@When("^Click on Certificates and Upload CSV File$")
	public void click_on_Certificates_and_Upload_CSV_File() throws Throwable {
	   ipo.clickonCertificatesuploadCsv();
	}

	@When("^Generate the QR Code$")
	public void generate_the_QR_Code() throws Throwable {
		ipo.generateQRCode();
	   
	}

	@When("^attach QR Code to pdf with ScanWriter app$")
	public void attach_QR_Code_to_pdf_with_ScanWriter_app() throws Throwable {
	    ipo.attachQRCodeToPDF();
	}

	@When("^Upload the Certificate$")
	public void upload_the_Certificate() throws Throwable {
	   ipo.uploadCertificate();
	}
}



