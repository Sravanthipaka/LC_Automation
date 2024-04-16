@tag
Feature: Institution User - Check the flow of User Internal Printing CSV file Academic Reference Number With Spaces and Dots

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV file Academic Reference Number With Spaces and Dots
    Given login by the username and password
    Then click the internal printing 
    Then click the Certificate Type 
    Then click upload the invalid CSV File
    
   