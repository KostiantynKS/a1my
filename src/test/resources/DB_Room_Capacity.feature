Feature: Rooms and their capacity

@smoke @db
Scenario: comparing rooms and capacity with specific rooms
Given User has connection to the database
When Send the request in JDBC
Then compare the response with expected