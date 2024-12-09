Feature: Remove Button Doesn't Work

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'problem_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked


  Scenario: Verifying that the button remove is not working
    Given the 'Sauce Labs Backpack' is added to the cart
    And the 'Sauce Labs Bike Light' is added to the cart
    Then the cart should display '2' items
    Then the 'Remove' button is clicked
    Then the 'RemoveBikeLight' button is clicked
    Then the cart should display '2' items