@DbLoginFeature @Regression
Feature: Techfios billing login Functinality validation

	Background:
	Given User is on Techfios login page
	
@DbTechfiosLogin1 @smoke
Scenario: User should be able to login with valid credentials
#Given User is on Techfios login page
When User enters username from database
When User enters password from database
When User clicks signin button
Then User Should land on dashboard page



