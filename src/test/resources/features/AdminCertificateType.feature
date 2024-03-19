@tag
Feature: Institution Admin - Check the flow of CertificateTypes

  @sanity
  Scenario: Verify the flow of Institution Admin CertificateTypes
    Given login of Admin with Username and password
    Then click by Institutions dropdown
    Then select the Certificate Types
    Then click on the Certificate Type 
    Then edit the fields 
    Then click on GO
    