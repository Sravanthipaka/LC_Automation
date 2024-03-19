@tag
Feature: Institution User - Check the flow of Institution User Verify Certificates

  @sanity
  Scenario: Verify the flow of Institution User Verify Certificates
    Given login by the user and enter username and password
    Then click on the certificates
    Then click the Verify Certificates option
    Then Select the certificate type
    Then fill all the input fields and click on Next button
    Then upload original certificate and QR Code 
    Then click on Next button
    