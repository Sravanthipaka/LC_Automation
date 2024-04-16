@tag
Feature: Institution User - Check the flow of Verify Certificates with empty Student Name

  @sanity
  Scenario: Verify the flow of institution User Verify Certificates with empty Student Name
    Given the user is on the login page
    When click the Certificates type tab
    Then click by verify certificates
    Then select Certificates type 
    Then enter Student Details
    Then enter Verifier Details
    And click on the next button
    