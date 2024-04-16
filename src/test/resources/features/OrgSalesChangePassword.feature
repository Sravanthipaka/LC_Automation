@tag
Feature: Orgnaisation Sales - Check the flow of Change Password

  @sanity
  Scenario: Verify the flow of Orgnaisation Sales Change Password
    Given Login through Username and Password
    Then Click on Settings option
    Then Click on Change Password
    Then Enter Current Password
    Then Enter New Password
    And  Re Enter New Password
    Then Click on Update and Click on OK
    Then Click Sign Out