@tag
Feature: Institution User - Check the flow of User Generate Single by future year and future month

  @sanity
  Scenario: Verify the flow of Institution User Generate Single by future year and future month
    Given login institution1 user by giving username and password
    Then click certificate and click the generate single1 
    Then click Certificate type Dropdown1 Select Certificate Type1
    Then fill the required fields1 
    Then Select issue month and issue year as future
    