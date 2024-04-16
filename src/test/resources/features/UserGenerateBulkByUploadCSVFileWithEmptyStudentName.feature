@tag
Feature: Institution User - Check the flow of Generate Bulk By Upload CSV File With Empty Student Name

  @sanity
  Scenario: Verify the institution user - Generate Bulk By Upload CSV File With Empty Student Name
    Given the access of the application
    When User login successfully using un & pwd
    Then confirm the appearance of a popup 
    And proceed to the section  Certificates tab
    And select the option  Bulk Certificates 
    And choose item from  dropdown
    And upload both a JPG and CSV filess at atime
    And ensure  the checkbox selected before saving it