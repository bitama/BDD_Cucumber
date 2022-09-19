@OtherLoginFeature @Regression
Feature: Techfios billing Otherlogin Functinality validation

Background:
Given User is on Techfios login page

@OtherLogin1 
Scenario Outline:1 User should  not be able to login with valid credentials
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks signin button
Then User Should land on dashboard page


Examples:
|username|password|
|demo@techfios.com|abc124|
|demo2@techfios.com|abc123|
|demo2@techfios.com|abc124|
