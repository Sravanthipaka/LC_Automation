@tag
Feature: Institution User - Check the verification by giving email without @
	@Sanity
	Scenario: Check the flow of Institution User Verifier email id without @
	Then Navigate to the certificates
  Then click on the Verify certificate
  Then Select a certificate Type
  Then Enter the Student details
  Then Enter the Verifier details
  Then click next button