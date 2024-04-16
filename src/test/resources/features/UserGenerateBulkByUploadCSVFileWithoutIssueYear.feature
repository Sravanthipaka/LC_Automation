@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File Without Issue Year

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File Without Issue Year
    Given the permission of the application1
    When the user logs in successfully using UN & PWD
    Then confirm the Appearance of a Popup Message
    And proceed to the section titled Certificates tab1
    And select the option labeled Bulk Certificates1 
    And choose an item from the Dropdown1
    And upload both a JPG1 and a CSV1 filess at a time
    And Ensure that the Checkbox is Selected before Save it