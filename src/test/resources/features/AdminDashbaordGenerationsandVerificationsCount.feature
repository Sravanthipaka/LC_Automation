@tag
Feature: Institution Admin - Check the flow of Dashboard Generationsand Verifications Count 

  @sanity
  Scenario: Verify the flow of Institution Admin Dashboard Generations and Verifications Count 
    Given login by admin through username and password
    Then Scroll By Down the Page
    Then Click by Generations graph View Count
    Then Click verifications graph see the count
   
   
   