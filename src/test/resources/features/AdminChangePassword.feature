@tag
Feature: Institution Admin - Check the flow of ChangePassword

  @sanity
  Scenario: Verify the flow of Institution Admin ChangePassword
    Given Login with valid Username and Password
    Then Click the Settings options
    Then Click the Change Password field
    Then Enter the Current Password field
    Then Enter the New Password field
    And  Re Enter the New Password field
    Then Click the Update button then Click the OK
    Then Click Sign Out page