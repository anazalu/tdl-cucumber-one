Feature: Automation Exercise front page
  Scenario: Check the title
    Given I am on the Automation Exercise front page
    Then the page title should be "Automation Exercise"
    And the Products link should contain text "Products"
    When I click Products link
    Then the Products page opens that has "All Products" header

  # Scenario Outline: Adding products to Cart
  #   Given I am on Products page
  #   When I add <items> 
  #   Then I should have <items> in Cart

  #   Examples:
  #     | items        | 
  #     |    Blue top  |
  #     |    Green top |
  #     |    Red top   |
  