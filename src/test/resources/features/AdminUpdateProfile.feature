@tag
Feature: Institution Admin - Check the flow of Updateprofile

  @sanity
  Scenario: Verify the flow of Institution Admin Updateprofile
    Given Login by Username and valid Password
    Then Click on the Settings tab
    Then Click on the update profile 
    Then Clear on the first name and Enter on the first name 
    Then Clear on the Last Name and Enter on the Last Name 
    Then Clear on Email Id and Enter on Email Id 
    Then Clear on Mobile Number and Enter on Mobile Number 
    Then Click on the Submit and Click on ok 