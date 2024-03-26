@tag
Feature: Institution User - Check the flow of Institution User Bulk with Approvals

  @tag1
  Scenario: Verify the flow of Institution User Bulk with Approvals
    Given login for Admin by Username and password
    Then click the adminsettings dropdown
    Then select settings 
    Then click Approval checkbox
    Then Scroll down and click submit
    Then Click the Signout
    Then login with user details
    Then click the Certificate Dropdown
    Then select bulk generation
    Then click on Certificate type
    Then Upload pdf Files
    Then Upload Data Files
    
    
    
    
   