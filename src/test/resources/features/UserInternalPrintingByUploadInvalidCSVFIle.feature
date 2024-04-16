@tag
Feature: Institution User - Ccheck the flow of Internal Printing with Upload of CSV File containing Invalid Email, Student Name, and Mobile Number

  @sanity
  Scenario: Verify Internal Printing with Upload of CSV File containing Invalid Email, Student Name, and Mobile Number
    Given log in with a valid Username and Password
    When I navigate to  Certificates type tab
    And select the internal printing
    And choose the appropriate Certificate
    And attempt to upload a CSV file containing invalid email addresses, student names, and mobile numbers
    Then an error message indicating the issues should be displayed