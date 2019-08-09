Feature: Transfer fund Feature file


Background: User naviagtes to Fund transfer page
Given User launch site
Then  User should entered un and pwd
When User should click login btn
Then User should be on home page
Then User should click Fundtransfer link

Scenario: Validate Fund transfer for negative flow 
Given User is on Fund Transfer page
Then User should fill partial details
When User click submit button
Then Error message should display

Scenario: Validate Fund transfer for negative flow 
Given User is on Fund Transfer page
Then User should fill wrong details
When User click submit button
Then Error message should display

Scenario: Validate Fund transfer for negative flow 
Given User is on Fund Transfer page
Then User should not fill details
When User click submit button
Then Error message should display

Scenario: Validate Fund transfer 
Given User is on Fund Transfer page
Then User should fill details
When User click submit button
Then FUnd should taransfered

