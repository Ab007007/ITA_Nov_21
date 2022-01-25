Feature: Google AutoSuggestion

@regression
Scenario: Print autosuggestions
Given user is on Google page
When user search for "IBM"
Then user should get suggestions releated to user text
And user will print the autosuggestions

@uat
Scenario: Print autosuggestions
Given user is on Google page
When user search for "WIPRO"
Then user should get suggestions releated to user text
And user will print the autosuggestions