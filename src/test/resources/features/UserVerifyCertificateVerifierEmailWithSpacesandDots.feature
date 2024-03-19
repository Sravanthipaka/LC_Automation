@tag
Feature: Institution User - Check the verification flow with verifier email id with spaces and dots.

  @sanity
  Scenario:  Check the flow of Institution User verification flow with verifier email id with spaces and dots.
  Then Navigate to certificates
  Then click on Verify certificate
  Then Select certificate Type
  Then Enter Student details
  Then Enter Verifier details
  Then click on Next