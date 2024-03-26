@tag
Feature: Institution User - Check the flow of Verify Certificates StudentName With Spaces and Dots

  @sanity
  Scenario: Check the flow of Institution User Verify Certificates StudentName With Spaces and Dots
    Given login with Username and Password
    When click on Certificates Tab And verified certificates
    Then select the Certificates type
    And enter  the StudentDetails
    Then enter the VerifierDetails
    And click the Next button
    