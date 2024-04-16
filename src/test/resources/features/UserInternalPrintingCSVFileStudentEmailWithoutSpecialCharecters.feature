@tag
Feature: Institution User - Check the flow of User Internal Printing CSV File Student Email Without Special Charecters

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV File Student Email Without Special Charecters
    Given login by the username and valid password
    Then click by Internal Printing 
    Then click by certificate type dropdown
    Then click upload invalid CSV file
    
   