@tag
Feature: Institution Admin - Check the flow of Recent Certificate Generations Revoke

  @sanity
  Scenario: Verify the flow of Institution Admin Recent Certificate Generations Revoke
    Given login through adminUsername and password
    Then  scroll by vertical bar on the dashboard
    Then  click the revoke icon in recent certificate generations on the dashbaord
    
    