Feature: Basic test scenarios

@temp
Scenario: User should login on the page
Given User login on the page using credentials
When User on the starting page put credentials 
Then User push sign in
And Weryfy that user is on home page