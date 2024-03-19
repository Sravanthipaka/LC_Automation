@tag
Feature: Institution Admin - Check the flow of Registration

  @sanity
  Scenario: Verify the flow of Institution Admin Registration
    Given Login valid Username and valid Password
    When Click on the Registration tab 
    Then enter the firstname 
    Then enter the lastname
    Then enter the emailid
    Then enter the mobile number
    Then enter username 
    Then enter pwd
    And click on Register and ok button