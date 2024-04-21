Feature: Automation Exercise front page
  Scenario: Check the title
    Given I am on the Automation Exercise front page
    When I do nothing
    Then the page title should be "Automation Exercise"
    And the page should contain "Automation Exercise"
    
    