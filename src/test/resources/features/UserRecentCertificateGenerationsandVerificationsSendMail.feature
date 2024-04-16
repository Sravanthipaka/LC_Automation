@tag
Feature: Institution User - Check the flow of Recent Certificate GenerationsandVerification Send Mail

  @sanity
  Scenario: Verify the flow of Institution User Recent Certificate GenerationsandVerification Send Mail
    Given login at the Username and password
    Then  Scroll the page
    Then  Click the Send Mail icon in Recent Certificate Generations
    Then  Click the send mail in Recent Certificate Verifications
    