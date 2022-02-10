Feature: Data table Google AutoSuggestion

  @newTest
  Scenario: Print autosuggestions
    Given user is on Google page
    Then user search companies one after another and print them
      | companyname  |
      | IBM          |
      | Wipro        |
      | ITAutomation |
    And close the browser
