@tag
Feature: Organisation Management - Check the flow of Update Profile

  @sanity
  Scenario: Verify the flow of Organisation Management Updateprofile
    Given Login as Username and Password
    Then Click the Settings option
    Then Click the update profile
    Then Clear the first name
    Then Enter the first name
    Then Clear the Last Name
    Then Enter the Last Name
    Then Clear the Email Id
    Then Enter the Email Id
    Then Clear the Mobile Number
    Then Enter the Mobile Number
    Then Click Submit button 
    And  Click on the Ok option