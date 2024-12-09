Feature: Remove Button Works

  Background:
    Given the home page is opened



  Scenario Outline: Verifying that the button remove is working
    And the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    And the 'Login' button is clicked
    Given the 'Sauce Labs Backpack' is added to the cart
    And the 'Sauce Labs Bike Light' is added to the cart
    Then the cart should display '2' items
    Then the 'Remove' button is clicked
    Then the cart should display '1' items
     Then the 'RemoveBikeLight' button is clicked
    Examples:
      |username|password|
      |standard_user|secret_sauce|

      |visual_user |secret_sauce |
      |performance_glitch_user|secret_sauce|