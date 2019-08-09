Feature: Validate login page

Background: User navaigates to login page
Given User launch site

Scenario: validate all tabs and logo
Given User should see all tabs
And   User should see logo 

Scenario: validate error message
Given user entered wrong credentails 
When User click login butotn
Then User should see error message

Scenario: validate fotter details
Given user should see all footer details

Scenario: validate successful login
When User click SignIn link
Then User should navigate to SignInPage
Then User should enter username and password
Then User should click LogInBUtton
Then User User should be on Home page
 



