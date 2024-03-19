@tag
Feature: Institution User - Check the flow of Dashboard Recent Certificate Generations - print button

  @sanity
  Scenario: Verify the flow of  Institution User Dashboard Recent Certificate Generations - print button
    Given login the user valid Username and Password
    When scroll by vertical
    Then click on the cerificate type dropdown and select the type
    Then click on the student name 
    Then click and scroll the page
    Then click on the print button
    
    
    