@tag
Feature: Institution Admin - Check the flow of Update Institution

  @sanity
  Scenario: Verify the flow of Institution Admin Update Institution
    Given login at the Admin Username and password
    Then click the settings option
    Then select the Update Institution
    Then click on the Address field
    Then upload the Logo
    Then select the state from dropdown
    Then click on the city and click on the contact person
    Then click on the Email id then click on the update
    