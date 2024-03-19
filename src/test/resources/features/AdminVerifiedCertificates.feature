@tag
Feature: Institution Admin - Check the flow of Verified Certificates

  @sanity
  Scenario: Verify the flow of Institution Admin Verified Certificates
    Given Login to the Admin by using Username and Password
    When Click on Reports tab
    Then click on Verified Certificates
    Then click on Sendmail icon then click on ok button
    Then click on Download Source File
    Then click on Download Key file
    And Select Student Checkbox then again click on OK
    