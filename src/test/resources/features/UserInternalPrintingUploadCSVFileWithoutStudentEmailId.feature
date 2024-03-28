@tag
Feature: Institution User - Check the flow of Internal Printing   By uploading the CSV File without Student Email id column.

  @sanity
  Scenario: Verify the institution user- Internal Printing   By uploading the CSV File without Student Email id column.
    Given User login with  valid Username and Password
    When user click on the Certificates type tab
    And user select internal printing
    And user choose the Certificate Type
    And uploading CSV File without Student Email id column
    Then error message shows