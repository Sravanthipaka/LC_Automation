package com.cucumber.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserInternalPrintingPageObjects {
	WebDriver driver;
	TestBase testbase;


	//click on the Certificate tab
	By Certificates=By.xpath("//a[text()='Certificates ']");

	//click on the internal printing option
	By InternalPrintingLnk=By.xpath("//a[text()='Internal Printing ']");

	// select the certificate type from the dropdown
	By CertiFicateType=By.xpath("//div[@class='row my-5']/div/select");

	// click on the upload CSV file field
	By CsvUpload=By.xpath("//input[@type='file']");

	// click on the next button
	By NxtBtn=By.xpath("//input[@value='Next']");

	//click on the toggle button
	By tooglebtn=By.xpath("//label[@class='switch']/span");

	//click on the ok button
	By OKBtn=By.xpath("//button[text()='OK']");

	//click on the Generate QRCode button
	By generateQRCode=By.xpath("//input[@value='Generate QR-Code']");

	// drop the document in third party tool
	By dropDocument=By.xpath("//div[text()='Drop your document here.']");

	//click on the ok button
	By OkBtn=By.xpath("//button[text()='Ok']");

	// click on the insert image option
	By InsertImage=By.xpath("//span[text()=' Insert image']");

	// upload the file
	By  ClickToSelectFile= By.xpath("//div[contains(text(),'Drop image here or click to select a file.')]");

	//click on the apply button
	By applyBtn= By.xpath("//button[text()='Apply']");

	//click on the download option
	By dwnldBtn=By.xpath("//button[@title='Download']");

	//click on the domload pdf option
	By dwnldPdfBtn=By.xpath("//a[text()='Download PDF']");

	By dwnldbscwmrk=By.xpath("//button[text()='Download basic PDF with watermark']");

	//upload the file in upload file field
	By UploadQrattachedFile= By.xpath("//input[@type='file']");







	public UserInternalPrintingPageObjects(WebDriver driver)
	{
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickonCertificatesuploadCsv() throws Exception
	{
		WebElement c = Constants.driver.findElement(Certificates);

		Actions act=new Actions(Constants.driver);
		act.moveToElement(c).perform();

		Constants.driver.findElement(InternalPrintingLnk).click();
		Thread.sleep(2000);
		WebElement CertificateType =Constants.driver.findElement(CertiFicateType);
		Select sc=new Select(CertificateType);
		sc.selectByVisibleText("Degree");

		Constants.driver.findElement(CsvUpload).sendKeys("D:\\For Automation Purpose\\data -12.csv");

	}

	public void generateQRCode()  {

		Constants.driver.findElement(NxtBtn).click();
		Constants.driver.findElement(tooglebtn).click();
		Constants.driver.findElement(OKBtn).click();
		Constants.driver.findElement(generateQRCode).click();
		Constants.driver.findElement(OkBtn).click();


	}

	public void attachQRCodeToPDF() throws  Exception  {

		Constants.driver.get("https://www.scanwritr.com/app/#!/gallery");
		Constants.driver.manage().window().maximize();
		Constants.driver.findElement(dropDocument).click();
		//uploading pdf document
		Robot r=new Robot();
		r.delay(2000);

		StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Bulk Data\\loved-to-death-obooko-1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//for pressing cntrl+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		//for realising cntl+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		//Click on Enter key

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


		Thread.sleep(3000);
		//Click on Insert Image
		Constants.driver.findElement(InsertImage).click();
		r.delay(2000);
		Constants.driver.findElement(ClickToSelectFile).click();


		StringSelection ss1=new StringSelection("D:\\For Automation Purpose\\download (55).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		Thread.sleep(2000);
		//for pressing cntrl+v
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		//for realising cntl+v
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		//Click on Enter key

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		Constants.driver.findElement(applyBtn).click();

		Thread.sleep(2000);
		Constants.driver.findElement(dwnldBtn).click();
		Thread.sleep(2000);
		Constants.driver.findElement(dwnldPdfBtn).click();
		Thread.sleep(2000);
		Constants.driver.findElement(dwnldbscwmrk).click();
		System.out.println("Attached QRCode Pdf Downloaded successfully");

	}

	public void uploadCertificate() throws InterruptedException  {
		Thread.sleep(2000);
		Constants.driver.get("https://stage.learningchain.in/printer-generate-certificate");

		Thread.sleep(2000);
		Constants.driver.findElement(UploadQrattachedFile).sendKeys("D:\\For Automation Purpose\\Document (17).pdf");
		System.out.println("Pdf uploaded successfully");
        Constants.driver.quit();

	}

}



