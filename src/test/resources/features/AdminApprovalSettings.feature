@tag
Feature: Institution Admin - Check the flow of Approval Settings

  @sanity
  Scenario: Verify the flow of Institution Admin approval Settings
    Given Login by Admin by using Username and Password
    When Click on Settings dropdown then Select Settings
    Then Select the institution Checkbox
    Then Select the CCtostudent checkbox
    Then Select the Mail to Verifier checkbox
    Then Select the CC to Institution verifier Checkbox
    Then Select the CC to Student verifier Checkbox
    Then Select the Approval require for single certificate generation Checkbox
    Then Select the Approval require for bulk certificate generation Checkbox
    Then Select the InternalPrinting Checkbox
    Then Select the EnableDownloadFiles checkbox
    Then Click on Submitbutton the popup alert is displayed
    Then Click on Okbutton then singout the page
   