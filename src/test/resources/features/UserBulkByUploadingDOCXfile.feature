@tag
Feature: Institution User - Check the flow of User Bulk By Uploading the DOCX File

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Uploading the DOCX File
    Given login of valid username and password
    Then Click Certificates tab and click on the generate bulk 
    Then Click Certificate type Dropdown and Select certificate type
    Then upload the DOCX file
   