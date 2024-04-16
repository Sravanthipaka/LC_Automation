@tag
Feature: Institution Admin - Check the flow of Add Certificate Type

  @sanity
  Scenario: Verify the flow of Institution Admin Add Certificate Type
    Given login admin username and password
    Then click on the Certificates
    Then click on the Add Certificate Type 
    Then enter the certificate type into field
    Then click on the Type dropdown and select the option
    Then click on Go button
   