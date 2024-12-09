Feature: Saucedemo Cart Total Validation

  Background:
    Given the home page is opened


  Scenario: Verifying cart total price after adding multiple items
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked
    Given the 'Sauce Labs Backpack' is added to the cart
    And the 'Sauce Labs Bike Light' is added to the cart
    And the 'Cart' button is clicked
    And the 'Checkout' button is clicked
    And the 'First Name' field is filled with 'Test'
    And the 'Last Name' field is filled with 'User'
    And the 'Zip Code' field is filled with '12345'
    When the 'Continue' button is clicked
    Then the cart total should match the sum of item prices
    Then the 'Finish' button is clicked


