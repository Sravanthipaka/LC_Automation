@tag
Feature: Institution User - Check the flow of Internal Printing Without Uploading the CSV file

  @sanity
  Scenario: Check the flow of institution user Internal Printing Without Uploading the CSV file
    Given login with Valid Username and Password
    When click on Certificates Menu 
    And Select verified certificates
    Then select Certificates typ
    And click Next button
    