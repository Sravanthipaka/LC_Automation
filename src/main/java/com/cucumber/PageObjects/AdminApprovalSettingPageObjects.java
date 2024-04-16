package com.cucumber.PageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class AdminApprovalSettingPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// Click on setting drop down
	By login = By.xpath("//input[@value='Login']");
	By settings = By.xpath("//a[text()='Settings ']");
	By settings1 = By.xpath("//a[@href='settings']");

	// Click on institution check box
	By institutions = By.xpath("(//input[@type='checkbox'])[2]");

	// Click on CCtostudent check box
	By CCtostudent = By.xpath("(//input[@type='checkbox'])[3]");

	// Click on Mail to verifer
	By mailcheckbox = By.xpath("(//input[@type='checkbox'])[4]");

	// Select Cc to Institution
	By CCtoInstitution = By.xpath("(//input[@type='checkbox'])[5]");

	// click on remarks
	By cctostudentverifier = By.xpath("(//input[@type='checkbox'])[6]");

	// Select Approvals>>Approval require for single certificate generation
	By singlecertificate = By.xpath("(//input[@type='checkbox'])[7]");

	// Select Approvals>>Approval require for bulk certificate generation
	By bulkceritificate = By.xpath("(//input[@type='checkbox'])[8]");

	// Internal Printing WebElement InternalPrinting
	By InternalPrinting = By.xpath("(//input[@type='checkbox'])[9]");

	// Enable Download Files WebElement EnableDownloadFiles
	By eneabledownloadfile = By.xpath("(//input[@type='checkbox'])[10]");

	// click on Submit button
	By submit = By.xpath("//input[@value='Submit']");

	// click on Ok
	By ok = By.xpath("//button[text()='Ok']");

	// signOut
	By logout = By.xpath("//a[text()='Signout']");



	public AdminApprovalSettingPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void ClickOnSettings() throws InterruptedException {
		WebElement Settings = testbase.waitForElement(Constants.driver.findElement(settings), TIMEOUT_WAIT,POOLING_WAIT);
		Settings.click();
		Thread.sleep(3000);
		testbase.waitForElement(Constants.driver.findElement(settings1), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(settings1).click();
		Thread.sleep(3000);
	}

	public void clickOnInstitutions() throws InterruptedException {

		WebElement Institution = testbase.waitForElement(Constants.driver.findElement(institutions), TIMEOUT_WAIT,
				POOLING_WAIT);
		try {
			if (!Institution.isSelected()) {
				Institution.click();
				Thread.sleep(1000);
				System.out.println("institution check box is toggled on" + "\n");
				// System.out.println("institution Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (Institution.isSelected()) {
				System.out.println("institution Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);

	}

	public void clickOnCCtostudent() throws InterruptedException {
		WebElement cctostudent = testbase.waitForElement(Constants.driver.findElement(CCtostudent), TIMEOUT_WAIT,
				POOLING_WAIT);
		try {
			if (!cctostudent.isSelected()) {
				cctostudent.click();
				Thread.sleep(1000);
				System.out.println("CCtostudent Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (cctostudent.isSelected()) {
				System.out.println("CCtostudent Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);
	}

	public void ClickonMailVeriferCheckbox() throws InterruptedException {
		WebElement mailverifier = testbase.waitForElement(Constants.driver.findElement(mailcheckbox), TIMEOUT_WAIT,
				POOLING_WAIT);
		try {
			if (!mailverifier.isSelected()) {
				mailverifier.click();
				Thread.sleep(1000);
				System.out.println("Mail to Verifier Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (mailverifier.isSelected()) {
				System.out.println("Mail to Verifier Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}

	}

	public void selectCCtoInstitutionCheckbox() throws InterruptedException {
		WebElement ccinstitution = testbase.waitForElement(Constants.driver.findElement(CCtoInstitution), TIMEOUT_WAIT,
				POOLING_WAIT);
		try {
			if (!ccinstitution.isSelected()) {
				ccinstitution.click();
				Thread.sleep(1000);
				System.out.println("CC to Institution Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (ccinstitution.isSelected()) {
				Thread.sleep(1000);
				System.out.println("CC to Institution Checkbox is already Toggled" + "\n");
				System.exit(0);
			}
		}
	}

	public void selectCCtoStudentVerifier() throws InterruptedException {
		WebElement ccstudentverifier = testbase.waitForElement(Constants.driver.findElement(cctostudentverifier),
				TIMEOUT_WAIT, POOLING_WAIT);
		try {
			if (!ccstudentverifier.isSelected()) {
				ccstudentverifier.click();
				Thread.sleep(1000);
				System.out.println("cc student verifier Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (ccstudentverifier.isSelected()) {
				System.out.println("CC to Student Verifier Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
	}

	public void selectSingleApprovalCheckbox() throws InterruptedException {
		WebElement singlecertificategeneration = testbase
				.waitForElement(Constants.driver.findElement(singlecertificate), TIMEOUT_WAIT, POOLING_WAIT);
		try {
			if (!singlecertificategeneration.isSelected()) {
				singlecertificategeneration.click();
				Thread.sleep(1000);
				System.out.println("Approval require for single certificate generation Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (singlecertificategeneration.isSelected()) {
				System.out.println(
						"Approval require for single certificate generation Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
	}

	public void selectBulkApprovalCheckbox() throws InterruptedException {
		WebElement bulkcertificategeneration = testbase.waitForElement(Constants.driver.findElement(bulkceritificate),
				TIMEOUT_WAIT, POOLING_WAIT);
		try {
			if (!bulkcertificategeneration.isSelected()) {
				bulkcertificategeneration.click();
				Thread.sleep(1000);
				System.out.println("Approval require for bulk certificate generation Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (bulkcertificategeneration.isSelected()) {
				System.out
				.println("Approval require for bulk certificate generation Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
	}

	public void selectinternalPrintingCheckbox() throws InterruptedException {
		WebElement internalPrinting = testbase.waitForElement(Constants.driver.findElement(InternalPrinting),
				TIMEOUT_WAIT, POOLING_WAIT);
		try {
			if (!internalPrinting.isSelected()) {
				internalPrinting.click();
				Thread.sleep(1000);
				System.out.println("Internal Printing Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (internalPrinting.isSelected()) {
				System.out.println("Internal Printing Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}

		}
	}

	public void selectEnableDownloadfileCheckbox() throws InterruptedException {
		WebElement downloadfile = testbase.waitForElement(Constants.driver.findElement(eneabledownloadfile),
				TIMEOUT_WAIT, POOLING_WAIT);
		try {
			if (!downloadfile.isSelected()) {
				downloadfile.click();
				Thread.sleep(1000);
				System.out.println("Enable Download Files Checkbox is Toggled On" + "\n");

			}
		} catch (Exception ex) {
			if (downloadfile.isSelected()) {
				System.out.println("Enable Download Files Checkbox is already Toggled" + "\n");
				System.exit(0);
				Thread.sleep(1000);
			}
		}
	}

	public void clickOnSubmit() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(submit), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(submit).click();
		Thread.sleep(4000);
	}

	public void okbutton() throws InterruptedException {
		WebElement okbutton = testbase.waitForElement(Constants.driver.findElement(ok), TIMEOUT_WAIT, POOLING_WAIT);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", okbutton);
		js1.executeScript("arguments[0].click();", okbutton);
		// driver.findElement(By.xpath("//button[text()='Ok']")).click();
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		// scroll up a page
		a.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		Thread.sleep(3000);

	}

	public void clickSignOut() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(logout), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(logout).click();
		Thread.sleep(4000);
	}
}
