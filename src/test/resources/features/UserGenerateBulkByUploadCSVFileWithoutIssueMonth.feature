@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File Without Issue Month

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File Without Issue Month
    Given the permission of the application
    When the User logs in successfully using un & pwd
    Then confirm the appearance of a popup message
    And proceed to the section titled Certificates tab
    And select the option labeled Bulk Certificates 
    And choose an item from the dropdown
    And upload both a JPG and a CSV filess at a time
    And ensure that the checkbox is selected before saving it