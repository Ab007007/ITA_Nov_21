Feature: Regular Expression in  AutoSuggestion

@test
Scenario: Print autosuggestions
Given user is on Google page
When user search for "IBM23234234234234"
Then user should get suggestion releated to user text
And user will save the autosuggestions



@test
Scenario: Print autosuggestion
Given user is on Google page
When user search for "IBM"
Then user should get suggestions releated to user text
And user will print the autosuggestions