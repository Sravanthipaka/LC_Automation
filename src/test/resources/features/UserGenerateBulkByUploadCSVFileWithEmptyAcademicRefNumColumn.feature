@tag
Feature: Institution User - Check the flow of Generate Bulk with invalid CSV File - empty academic reference num

  @sanity
  Scenario: Verify the institution user - Generate Bulk with invalid CSV File - empty academic reference num
    Given the application has been launched
    When the User logs in with valid credentials
    Then a popup should appear
    And the User clicks on the "Certificates" option
    And the User selects "Bulk Certificates" from the menu
    And the User chooses an option from the dropdown menu
    And the User uploads a JPG and a CSV file
    And the User checks the checkbox and clicks the save button