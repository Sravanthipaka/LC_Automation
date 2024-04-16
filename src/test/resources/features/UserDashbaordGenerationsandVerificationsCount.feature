@tag
Feature: Institution User - Check the flow of Dashboard Generationsand Verifications Count 

  @sanity
  Scenario: Verify the flow of Institution User Dashboard Generationsand Verifications Count 
    Given login by user through username and password
    Then scroll by down the page
    Then click by generations Graph and view count
    Then click the Verifications graph and see the count
   
   
   