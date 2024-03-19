@tag
Feature: Institution User - Check the flow of User Internal Printing CSV File without Academic Reference Number

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV File without Academic Reference Number
    Given login by valid username and valid password
    Then Click by Internal Printing 
    Then Click by certificate type dropdown
    Then Click by upload invalid CSV file
    
   