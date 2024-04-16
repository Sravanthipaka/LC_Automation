@tag
Feature: Institution User - Check the flow of Recent Certificate Verifiecations 

  @sanity
  Scenario: Verify the flow of Institution User Recent Certificate Verifiecations
    Given login by user the Username and password field
    Then scroll by vertical
    Then click on the cerificate type dropdown and select the type
    Then click on the student name 
  
   