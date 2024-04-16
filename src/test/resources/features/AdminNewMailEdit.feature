@tag
Feature: Institution Admin - Check the flow of New Mail Edit

  @sanity
  Scenario: Verify the flow of Institution Admin New Mail Edit
    Given login by at the valid Username and password
    Then click reports 
    Then Select by generated certificates
    Then click the edit icon and Clear Student Email
    Then Enter New Email
    Then Click the Save