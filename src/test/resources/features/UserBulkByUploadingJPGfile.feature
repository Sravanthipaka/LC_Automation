@tag
Feature: Institution User - Check the flow of User Bulk By Uploading the JPG File

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Uploading the JPG File
    Given login of the username and password
    Then click on the certificates tab then click on the generate bulk option
    Then Click on the certificate type dropdown and select certificate type
    Then upload the JPG file
   