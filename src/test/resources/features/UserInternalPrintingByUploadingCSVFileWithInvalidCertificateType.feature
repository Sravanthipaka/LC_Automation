@tag
Feature: Institution User - Check the flow of Internal Printing with upload the CSV file with invalid Certificate Type

  @sanity
  Scenario: Verify Internal Printing with upload the CSV file with invalid Certificate Type
   Given I Log in a Valid Username and Password
   When Navigate the certificate option
   And Select internal printing type
   And Choose appropriate certificate type
   And Upload the CSV file with invalid certificate type
   Then An error message should be displayed