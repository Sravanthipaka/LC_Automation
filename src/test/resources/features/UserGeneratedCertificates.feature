@tag
Feature: Institution User - Check the flow of Generated Certificates

  @sanity
  Scenario: Verify the flow of Institution User Generated Certificates
    Given login with the valid Username and password
    Then click on reports type
    Then Click the generated certificates 
    Then Click the academic reference number 
    Then Click on sendmail icon then click Ok button
    Then Click the revoke icon then click the Ok
    Then Click on download original certificate icon then click the Ok
    And  Click on Download QR Code icon then click the Ok
    Then Click the header checkbox
    Then Click the action dropdown
    Then select the SendMail then click the GO 
    Then click the Ok 
   
    
    