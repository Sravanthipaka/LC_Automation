@tag
Feature: Institution User - Check the flow of User Internal Printing CSV With Spaces&Dots

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV With Spaces&Dots
    Given login with the username and password
    Then click on the internal printing option
    Then click on the Certificate Type dropdown
    Then click and upload the invalid CSV File
    
   