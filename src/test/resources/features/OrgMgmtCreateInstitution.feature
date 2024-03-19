@tag
Feature: Organisation Management - Check the flow of CreateInstitution

  @tag1
  Scenario: Verify the flow of Organisation Management CreateInstitution
    Given login for Management with Username and password
    Then click on Institutions dropdown
    Then select the Create Institution 
    Then Enter Insitution name and Select state dropdown fields
    Then Enter City and Address fields
    Then Upload the logo
    Then Select the Network dropdown
    Then Enter the Contact person and Email Id fields
    Then click on Submit 