@tag
Feature: Institution User - Check the flow of User Bulk without selecting the Certificare Type

  @sanity
  Scenario: Verify the flow of Institution User Bulk without selecting the Certificare Type
    Given login as the username and password
    Then Click on the Certificates tab then click on the generate bulk option
    Then upload the original certificate
   