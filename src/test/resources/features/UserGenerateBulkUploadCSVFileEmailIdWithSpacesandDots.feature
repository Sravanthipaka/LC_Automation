@tag
Feature: Institution User - Check the flow of Generate bulk Upload CSV File Email id with Sapces and Dots

  @sanity
  Scenario: Verify the Institution User - Generate bulk Upload CSV File Email id with Sapces and Dots
    Given the application is launched
    When User enters credentials and logs in
    Then a popup is displayed
    And I click on the Certificates option
    And I click on the Bulk Certificates option
    And I select a value from the dropdown
    And I upload a JPG file &CSV file
    And I click on the checkbox and save button