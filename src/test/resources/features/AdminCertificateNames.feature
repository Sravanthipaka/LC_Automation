@tag
Feature: Institution Admin - Check the flow of Certificate Names

  @sanity
  Scenario: Verify the flow of Institution Admin Certificate Names
    Given login through at the Admin with Username and password
    Then click by Institution dropdown
    Then select on Certificate Names 
    Then click on Edit button
    Then clear on Certificate Name
    Then enter by Certificate Name
    Then Update of Certificate Name  