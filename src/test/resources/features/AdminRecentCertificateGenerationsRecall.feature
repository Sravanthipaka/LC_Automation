@tag
Feature: Institution User - Check the flow of Recent Certificate Generations Recall

  @sanity
  Scenario: Verify the flow of Institution User Recent Certificate Generations Recall
    Given login as through Username and password
    Then  scroll by the vertical bar in dashboard
    Then  click recall icon in recent certificate generations in dashboard
    
    