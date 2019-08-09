Feature: Validate Home page

Background: User naviagtes to Home page
Given User launch site
Then  User should entered un and pwd
When User click login btn
Then User should be on home page



Scenario: Validate if user name is displayed
Then User should see username 
Then user should see today date

Scenario: Validate if user see account details
When User select account 
And User click go button
Then User should see account details

Scenario: Validate if user see account details for negative flow
When User did not select account 
And User click go button
Then User should see account details


 