@tag
Feature: Institution User - Check the flow of New Mail Edit

  @sanity
  Scenario: Verify the flow of Institution User New Mail Edit
    Given login with Username and password
    Then click on Reports dropdown
    Then select the Generated Certificates
    Then click on Edit Icon and clear student email
    Then enter new email
    Then click on save