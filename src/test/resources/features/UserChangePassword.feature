@tag
Feature: Institution User - Check the flow of Change Password

  @sanity
  Scenario: Verify the flow of Institution User ChangePassword
    Given Login with valid Username and valid Password
    Then Click on Settings tab
    Then Click the Change Password 
    Then Enter the Current Password 
    Then Enter the New Password  
    And  Re Enter the New Password 
    Then Click the Update button then Click the OK button