@tag
Feature: Institution User - Check the flow of By uploading the files with the combination of JPG/JPEG/DOC/DOCX in Bulk Generated certificates

  @sanity
  Scenario: Verify the flow of Bulk Generated certificates By uploading the files with the combination of JPG/JPEG/DOC/DOCX
    Given the user Login 
    When Click on the Certificates tab 
    Then Click on Generated Bulk Certificates
    Then Select Certificate Type
    Then Upload All Certificates 
    Then Click Next button
    