@tag
Feature: Organisation Management - Check the flow of View Institutions

  @sanity
  Scenario: Verify the flow of Organisation Management View Institutions
    Given Login to Username and Password
    When click on Institutions Tab
    Then click on View Institutions
    Then click on Create Institution button
    Then enter the institution name
    Then click on back and click on Edit button
    Then click on back and Credits button
    Then click Back and rate contracts
    