Feature: Automation Exercise front page
  Scenario: Check the title
    Given I am on the Automation Exercise front page
    Then the page title should be "Automation Exercise"
    And the Products link should contain text "Products"
    When I click Products link
    Then the Products page opens that has "All Products" header

  # Scenario: Adding a product to Cart
  #   Given I am on the Automation Exercise front page
  #   When I add "Blue Top" to cart
  #   And I click on the cart link
  #   Then I should have "Blue Top" in my cart
  
  # Scenario: Adding multiple products to Cart
  #   Given I am on the Automation Exercise front page
  #   When I add these items to cart
  #     | Blue Top      |
  #     | Men Tshirt    |
  #     | Winter Top    |
  #     | Stylish Dress |
  #   Then I should have the items in cart
  #     | Blue Top      |
  #     | Men Tshirt    |
  #     | Winter Top    |
  #     | Stylish Dress |
  