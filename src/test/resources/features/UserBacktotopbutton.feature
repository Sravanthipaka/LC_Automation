@tag
Feature: Institution User - Check the flow of back to top button

  @sanity
  Scenario: Verify the flow of Institution User back to top button
    Given login the user with Username and password
    Then scroll the bar
    Then Click on the back to top 
    