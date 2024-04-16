@tag
Feature: Institution User - Check the flow of Verify Certificate Verifier Name with spaces and dots

  @sanity
  Scenario: Verify the institution User - Verify Certificate Verifier Name with spaces and dots
    Given I log in with a Username and Password
    When I go to the Certificates section
    And choose the option for verified certificates
    And pick a specific Certificate type
    And complete the Student Details section
    And input spaces and dots in the Verifier name field
    And click the Next Button