@tag
Feature: Institution User - Check the flow of User Generate Single Mobile Number With Less than 10 digits

  @sanity
  Scenario: Verify the flow of Institution User Generate Single Mobile Number With Less than 10 digits
    Given login institution2 user by giving username and password
    Then click certificate and click the generate single2 
    Then click Certificate type Dropdown1 Select Certificate Type2
    Then fill the required fields2 
   
    