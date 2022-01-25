Feature: Google AutoSuggestion

	@regression
  Scenario Outline: Print autosuggestions
    Given user is on Google page
    When user search for <companyname>
    Then user should get suggestions releated to user text
    And user will print the autosuggestions

    Examples: 
      | companyname  |
      | IBM          |
      | Wipro        |
      | ITAutomation |
