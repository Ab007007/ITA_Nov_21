Feature: Google AutoSuggestion

Background:
Given user is on Google page

@bg
Scenario: Print autosuggestions
When user search for "IBM"
Then user should get suggestions releated to user text
And user will print the autosuggestions

@bg
Scenario: Print autosuggestions
When user search for "WIPRO"
Then user should get suggestions releated to user text
And user will print the autosuggestions