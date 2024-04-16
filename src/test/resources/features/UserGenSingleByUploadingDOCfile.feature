@tag
Feature: Institution User - Check the flow of User Generate Single by uploading DOC file

  @sanity
  Scenario: Verify the flow of Institution User Generate Single by uploading DOC file
    Given login institution user by valid username and password
    Then click on certificate click Generate single 
    Then click on Certificate type dropdown and select certificate type
    Then Fill by the required fields
    Then Upload DOC file into Upload the document field
    Then click by next button
    