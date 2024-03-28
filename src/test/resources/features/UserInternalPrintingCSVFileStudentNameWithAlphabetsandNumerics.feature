@tag
Feature: Institution User - Check the flow of Internal Printing CSV file Student Name With Alphabets and Numeic values

  @sanity
  Scenario: Verify the institution user Internal Printing  By uploading the CSV File, student name column with alphabets and numeric values.
    Given log in with  valid Username and Password
    When user navigate to  Certificates type tab
    And user select the internal printing
    And user choose the appropriate Certificate
    And uploading the CSV File, student name column with alphabets and numeric values
    Then error message indicating 