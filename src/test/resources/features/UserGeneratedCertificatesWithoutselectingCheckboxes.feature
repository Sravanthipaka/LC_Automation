@tag
Feature: Institution User - Check the flow of Generated Certificates without selecting checkboxes

  @sanity
  Scenario: Verify the flow of Institution User Generated Certificates without selecting checkboxes
    Given login with the valid Username and valid password
    Then Click on reports type
    Then Click the Generated Certificates 
    Then Select the Certificate Type
    Then Click on the Action dropdown and select the options one by one

   
    
    