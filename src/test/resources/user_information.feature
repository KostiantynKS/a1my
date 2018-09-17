Feature: User information

@temp
Scenario: Verify information about logged in user
Given I'm logged reservation API using "teachervamikemarcus@gmail.com" and "mikemarcus"
When I get the current user information using the endpoint
Then the information about current user should b returned
