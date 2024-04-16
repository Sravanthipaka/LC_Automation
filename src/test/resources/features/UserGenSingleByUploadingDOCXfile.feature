@tag
Feature: Institution User - Check the flow of User Generate Single by uploading DOCX file

  @sanity
  Scenario: Verify the flow of Institution User Generate Single by uploading DOCX file
    Given login institution user by username and valid password
    Then Click Certificate Click Generate Single 
    Then Click Certificate Type Dropdown and Select Certificate Type
    Then Fill by the Required Fields
    Then Upload DOCX file into Upload the Document field
    Then Click by Next Button
    