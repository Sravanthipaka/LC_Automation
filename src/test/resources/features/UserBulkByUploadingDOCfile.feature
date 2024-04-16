@tag
Feature: Institution User - Check the flow of User Bulk By Uploading the DOC File

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Uploading the DOC File
    Given login of username and password
    Then click certificates tab then click on the generate bulk option
    Then Click certificate type dropdown and select certificate type
    Then upload the DOC file
   