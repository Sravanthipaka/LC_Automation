@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File With Empty Certificate Name

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File With Empty Certificate Name
    Given the Application already running good
    When the User logs in using their Valid Credentials1
    Then The popup window should appear clear
    And the user navigates to Certificates section 
    And Selects Bulk Certificates from the menu 
    And Chooses an option from the Dropdown list for select
    And Uploads both a JPG and a CSV file Parallely
    And Checks the checkbox Before clicking on the save button and clicks