@tag
Feature: Institution User - Check the flow of User Bulk By Uploading the PDF File

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Uploading the PDF File
    Given login of valid username and valid password
    Then Click as certificates tab and click on the generate bulk 
    Then Click as certificate type dropdown and select certificate type
    Then upload the PDF file
   