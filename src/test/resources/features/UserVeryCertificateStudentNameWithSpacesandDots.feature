@tag
Feature: Institution User - Verify Certificates Spaces and Dots in student name

  @sanity
  Scenario: Check the flow of Institution User Verify Certificates Spaces and Dots in student name
    Given login with Username and Password
    When click on Certificates Tab And verified certificates
    Then select the Certificates type
    And enter  the StudentDetails
    Then enter the VerifierDetails
    And click the Next button
    