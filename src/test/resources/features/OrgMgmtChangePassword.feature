@tag
Feature: Organization Management - Check the flow of ChangePassword

  @sanity
  Scenario: Verify the flow of Organization Management ChangePassword
    Given Login into Username and Password
    Then Click on the settings tab
    Then Click change password 
    Then enter current password
    Then enter new password  
    And  re enter new password
    Then Click by Update and Click OK 
    
    
     
    