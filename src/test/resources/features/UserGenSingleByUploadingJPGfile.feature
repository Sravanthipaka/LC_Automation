@tag
Feature: Institution User - Check the flow of User Generate Single by uploading JPG file

  @sanity
  Scenario: Verify the flow of Institution User Generate Single by uploading JPG file
    Given login institution user by username and password
    Then click on certificate click on the generate single 
    Then click Certificate Type Dropdown Select Certificate Type
    Then fill the required fields
    Then Upload JPG file into upload the document field
    Then Click next button
    