@tag
Feature: Organisation Sales - Check the flow of Organisation Sales Reports Receipts

  @sanity
  Scenario: Verify the flow of  Organisation Sales Reports Receipts
    Given Login by the Username3 and Password3
    When Click on the Reports 
    Then Click on the Receipts option
    Then Click on the Overall Organization Receipts
    Then Click on the InstitutionWise Receipts and Select the Institution Name from dropdown
    