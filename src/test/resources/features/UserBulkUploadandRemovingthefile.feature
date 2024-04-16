@tag
Feature: Institution User - Check the flow of  Bulk with Approval by uploading files and remove then click on the Next button.

  @tag1
  Scenario: Verify the Generate Bulk with Approval by uploading files and remove then click on the Next button.
    Given login with valid credentails
    And clickon certificates
    When select certificateType
    And click on checkbox
    Then Verify the Error msg displayed without uploading csv file