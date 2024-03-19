@tag
Feature: Institution User - Check the flow of Generate Single Without Approval

  @sanity
  Scenario: Verify the flow of Institution User Generate Single Without Approval
    Given Login valid Username and Password
    Then click the settings type in the admin
    Then select the settings option
    Then click on the approval checkbox
    Then click on the button
    Then click on the signout option
    Then login with the user details
    Then click the Certificate Dropdown
    Then Select the single generation
    Then click on the certificate type
    Then Enter all input fields
    Then click the Generate Certificate button
    