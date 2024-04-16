@tag
Feature: Institution User - Check the flow of View All Generations

  @sanity
  Scenario: Verify the flow of Institution User View All Generations
    Given login by the user valid Username and Password
    When Scroll down the vertical bar
    Then click on the Certificate type dropdown and select the type
    Then click on the View All Generations button 
    
    
    