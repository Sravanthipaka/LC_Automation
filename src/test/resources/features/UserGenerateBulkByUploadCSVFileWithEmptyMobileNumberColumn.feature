@tag
Feature: Institution User - Check the flow of Generate Bulk with invalid CSV File - Empty Mobile umber column

  @sanity
  Scenario: Verify the institution user - Generate Bulk with invalid CSV File - Empty Mobile umber column
    Given The application has been Launched
    When The user logs in with valid credentials
    Then A Popup should appear
    And The user clicks on the certificates 
    And The User Selects bulk certificates from the menu
    And The User chooses an option from the dropdown menu
    And The User uploads a JPG and a CSV file
    And The User checks the checkbox and clicks the save button