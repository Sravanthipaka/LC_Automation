Feature: Login - Check the internal printing by giving CSV File student name column with Spaces and dots

  @sanity
  Scenario: CSV File student name column with Spaces and dots
    Given login with Username and Password
    When click on Certificates Tab And verified certificates
    Then select the Certificates type
    Then enter  the StudentDetails
    Then enter the VerifierDetails
    Then click the Next button