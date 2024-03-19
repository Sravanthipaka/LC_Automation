@tag
Feature: Institution User - Check the flow of User Bulk By Click the Dashboard link

  @sanity
  Scenario: Verify the flow of Institution User Bulk By Click the Dashboard link
    Given login by the valid username and valid password
    Then click the Certificate type
    Then click on the Generate bulk option
    Then click on the dashboard link
   