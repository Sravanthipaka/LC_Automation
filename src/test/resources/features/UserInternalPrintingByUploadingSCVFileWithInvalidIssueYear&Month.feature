@tag
Feature: Institution User - Check the flow of Internal Printing with upload the CSV file with invalid issue year and month

  @sanity
  Scenario: Verify Internal Printing with upload the CSV file with invalid issue year and month
   Given I log in with a valid Username and Password
   When navigate to the Certificates type tab
   And select the internal printing option
   And choose the appropriate Certificate type
   And upload the CSV file with invalid issue year and month
   Then an error message should be displayed