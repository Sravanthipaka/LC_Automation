@tag
Feature: Institution User - Check the flow of Updateprofile

  @sanity
  Scenario: Verify the flow of Institution User Updateprofile
    Given Login by valid Username and Password
    Then Click the Settings type
    Then Click on update profile option
    Then Clear on first name field
    Then Enter on first name field
    Then Clear on Last Name field
    Then Enter on Last Name field
    Then Clear on Email Id field
    Then Enter on Email Id field
    Then Clear on Mobile Number field
    Then Enter on Mobile Number field
    Then Click the Submit button and Click by ok 
    