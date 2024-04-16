@tag
Feature: Institution Admin - Check the flow of Rate Contrat List

  @sanity
  Scenario: Verify the flow of Institution Admin Rate Contrat List
    Given Login through the valid Username and Password
    When Click on Institution tab 
    Then Click on RateContract option
    Then Click on Download icon
    Then Click on Prepaid radio button 
    Then Click on Postpaid Radio button
    #Then Click on pages
    