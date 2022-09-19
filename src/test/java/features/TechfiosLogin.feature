@LoginFeature @Regression
Feature: Techfios billing login Functinality validation

	Background:
	Given User is on Techfios login page
	
@TechfiosLogin1 @smoke
Scenario: User should be able to login with valid credentials
#Given User is on Techfios login page
When User enters username as "demo2@techfios.com"
When User enters password as "abc123"
When User clicks signin button
Then User Should land on dashboard page


@TechfiosLogin2 
Scenario: User should be able to login with valid credentials
#Given User is on Techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks signin button
Then User Should land on dashboard page



