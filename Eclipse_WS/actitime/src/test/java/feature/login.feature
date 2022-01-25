Feature: Validate Login

@actitime @regression
Scenario: Validate successfull login with Valid Credentials
Given user is on login page
When user enter valid username and password
And user click on login button
Then user should be landed on Dashboard page
And user validate the dashboard page 
And close the browser

@actitime
Scenario: Validate un-successfull login with invalid Credentials
Given user is on login page
When user enter invalid username and password
And user click on login button
Then user should be shown an error message
And user validate the Login page
And close the browser