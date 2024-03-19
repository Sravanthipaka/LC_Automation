@tag
Feature: Institute Admin - Check the flow of CertificatesApprovals

  @tag1
  Scenario: Verify the flow of Institute Admin CertificatesApprovals
    Given login to Admin with Username and password
    Then click on Certificates dropdown
    Then select the Approvals 
    Then click on BulkApproval
    Then click on SingleApproval
   
  