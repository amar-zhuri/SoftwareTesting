Feature: Saucedemo Cart Validation

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Adding multiple items to the cart and verifying the cart contents
    Given the 'Sauce Labs Backpack' is added to the cart
    And the 'Sauce Labs Bike Light' is added to the cart
    And the 'Cart' button is clicked
    Then the cart should display '2' items
    # I have removed the products becuase it makes problem when you start RunCucamberTest, but its not needed when you test alone.
    Then the 'Remove' button is clicked
    Then the 'RemoveBikeLight' button is clicked