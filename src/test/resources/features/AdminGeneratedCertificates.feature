@tag
Feature: Institution Admin - Check the flow of Generated Certificates
  @sanity
  Scenario: Verify the flow of Institution Admin Generated Certificates
    Given Login through valid Username and Password
    Then Click the Reports option
    Then Click on Generated Certificates 
    Then Click on Student Name
    Then Click the Send Mail icon and Click Ok
    Then Click on Revoke icon and Click on Ok
    Then Click the Download Source File icon and Click on Ok
    And  Click the Download Key File icon and Click on Ok
    Then Click on Header Checkbox
    Then Click on Action Dropdown
    Then Select send mail and click on GO button
    Then Click on Ok button
    And  Click by Signout page
    
    