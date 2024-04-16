@tag
Feature: Institution User - Check the flow of Recent Certificate GenerationsandVerification Download QR Code

  @sanity
  Scenario: Verify the flow of Institution User Recent Certificate GenerationsandVerification Send Mail
    Given login at into the Username and password
    Then  Scroll down
    Then  click the downoad QR Code icon recent certificate generations
    Then  click on the Download qr code in recent certificate verifications
    