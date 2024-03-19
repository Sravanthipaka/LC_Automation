@tag
Feature: Institution User - Check the flow of User Internal Printing CSV File Student Email With AlphabetsandNumerics

  @sanity
  Scenario: Verify the flow of Institution User Internal Printing CSV File Student Email With AlphabetsandNumerics
    Given login by the valid username and password
    Then Click Internal Printing option
    Then Click certificate type dropdown
    Then Click as upload invalid CSV file
    
   