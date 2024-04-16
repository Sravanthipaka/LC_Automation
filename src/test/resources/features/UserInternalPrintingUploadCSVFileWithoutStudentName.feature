@tag
Feature: Institution User - Check the flow of Internal Printing Upload CSV file Without Student Name

  @sanity
  Scenario: Verify the institution user Internal Printing Upload CSV file Without Student Name
    Given Log in with  valid Username and Password
    When User navigate to  Certificates type 
    And user select the Internal Printing
    And User choose the appropriate Certificate
    And Uploading the CSV File empty student column
    Then Error message indicating 