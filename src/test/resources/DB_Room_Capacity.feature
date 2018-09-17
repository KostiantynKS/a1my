Feature: Rooms and their capacity

@db
Scenario: comparing rooms and capacity with specific rooms
Given User has connection to the database and send the request in JDBC
Then compare the response with expected