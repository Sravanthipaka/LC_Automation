@tag
Feature: Institution User - Check the flow of User Bulk By Uploading the JPEG File

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Uploading the JPEG File
    Given login of username and valid password
    Then Click by certificates tab and click on the generate bulk 
    Then Click by certificate type dropdown and select certificate type
    Then upload the JPEG file
   