@tag
Feature: Institution User - Check the flow of  Internal Printing with Valid CSV File and Replace with Another

  @sanity
  Scenario: Verify Internal Printing with Valid CSV File and Replace with Another
    Given I log in with valid Username and Password
    When I navigate to the Certificates type tab
    And select internal printing option
    And choose the Certificate type
    And upload a CSV file
    And remove the uploaded CSV File
    And user click on the Next button