@tag
Feature: Institution User - Check the flow of Bulk with Approvals

  @tag1
  Scenario: Verify the flow of Institution User Bulk with Approvals
    Given login for Admin with Username and password
    Then click on adminsettings dropdown
    Then select the settings 
    Then click on Approval checkbox
    Then scroll down and click on Submit
    Then click by signout
    Then login with user details
    Then click on certificate dropdown
    Then select the Bulk Generation
    Then click on Certificate type
    Then upload the PDF files
    Then upload the data files
    
    
    
    
   