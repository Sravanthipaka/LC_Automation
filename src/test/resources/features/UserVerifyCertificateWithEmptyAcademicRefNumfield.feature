@tag
Feature: Institution User - Check the flow of Institution User Verify Certificate with empty Academic Reference Number field

  @sanity
  Scenario: Verify the flow of Institution User Verify Certificate with empty Academic Reference Number field
    Given login the institution user and enter valid username and password
    Then click certificates
    Then click Verify Certificates 
    Then select certificate type1
    Then fill all input fields then click on next button
    
 
    