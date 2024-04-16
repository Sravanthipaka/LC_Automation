@tag
Feature: Institution Admin - Check the flow of Receipts

  @sanity
  Scenario: Verify the flow of Institution Admin Receipts
    Given Login into InstituteAdmin by using Username and Password
    When Click on Reports 
    Then Click on Receipts
    Then Click on Next button