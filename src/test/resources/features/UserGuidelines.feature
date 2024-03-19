@tag
Feature: Institution User - Check the flow of Guidelines

  @tag1
  Scenario: Verify the flow of Institution User Guidelines
    Given login user by Username and password
    Then click on certificates1 dropdown
    Then select the Generate single
    Then select the Certificate type1
    Then click on Guidelines1 link and navigate back
    Then click on certificates2 dropdown
    Then click with Generate Bulk
    Then select the certificate type2
    Then click on Guidelines2 link and navigate back
    
   
   
  