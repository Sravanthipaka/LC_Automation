@tag
Feature: Institution User - Certificates Internal Printing WIth Out CSV

  @sanity
  Scenario: Verified Certificates Internal Printing WIth Out CSV
    Given login with Valid Username and Password
    When click on Certificates Menu 
    And Select verified certificates
    Then select Certificates typ
    And click Next button
    