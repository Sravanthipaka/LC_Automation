@tag
Feature: Institution User - Check the flow of Bulk Generated certificates

  @sanity
  Scenario: Verify the flow of Institution User Bulk Generated certificates
    Given Login by User by using Username and Password
    When Click on the Reports tab 
    Then Click on Bulk Generated Certificates
    Then Click on the particular Reference id
    