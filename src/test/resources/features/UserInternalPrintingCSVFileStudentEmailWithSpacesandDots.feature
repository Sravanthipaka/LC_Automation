@tag
Feature: Institution User - Check the flow of User Internal Printing CSV File Student Email With Spaces and Dots

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV File Student Email With Spaces and Dots
    Given login with the valid username and valid password
    Then Click the Internal Printing option
    Then Click the certificate type dropdown
    Then Click by upload the invalid CSV File
    
   