@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File With Invalid Certificate Name

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File With Invalid Certificate Name
    Given the application is already running good
    When the User logs in using their valid credentials s
    Then a popup window should appear clear
    And the User navigates to the "Certificates" section further
    And selects "Bulk Certificates" from the menu options for click
    And chooses an option from the dropdown list for select
    And uploads both a JPG and a CSV file parallely
    And checks the checkbox before clicking on the save button and clicks