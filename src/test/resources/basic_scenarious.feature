Feature: Basic test scenarios

Background:
Given User is on the sign in page
When User put his valid credentials such as email and username
Then  Verify that User is on the homePage

@smoke 
Scenario: User navigating to the HuntingPage
Given User already logged and on the HomePage
When User click on the hunt button
Then User should be on the on the hunting page


@smoke
Scenario: User navigating to the Schedule page
Given User again already logged and on the HomePage
When User click on the schedule button
Then User should be on the on the schedule page