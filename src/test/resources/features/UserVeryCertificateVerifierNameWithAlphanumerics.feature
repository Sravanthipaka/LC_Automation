@tag
Feature: Institution User - Check the flow of Verify Certificate Verifier Name With Alphabets

  @sanity
  Scenario: Verify the institution User - verify Certificate Verifier Name With Alphabets
    Given I log in with Username and Password
    When I navigate to Certificates type tab
    And select verified certificates
    And choose the Certificate
    And fill in the Student Details
    And input alphanumeric characters in the Verifier name field
    And click Next Button