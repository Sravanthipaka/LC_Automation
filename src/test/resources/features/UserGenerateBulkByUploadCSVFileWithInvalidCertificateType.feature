@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File With Invalid Certificate Type

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File With Invalid Certificate Type
    Given the Application is Already Running good
    When the user Logs in using their valid credentials
    Then A popup window should Appear clear
    And the User Navigates to the Certificates1 section further
    And Selects Bulk Certificates1 from the menu options for click
    And Chooses an option from the dropdown list for select
    And Uploads both a JPG and a CSV1 file parallely
    And Checks the checkbox before Clicking on the save button and clicks