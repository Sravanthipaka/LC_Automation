@tag
Feature: Institution User - Check the flow of User Generate Single with multiple special charecters

  @sanity
  Scenario: Verify the flow of Institution User Generate Single with multiple special charecters
    Given login the username and password
    Then Click the Certificate and click on the Generate Single option
    Then Click on the Certificate type dropdown and select the certificate type
    Then fill all the required fields
    Then enter the multiple special charecters into email id field
    Then click on the Next button
    