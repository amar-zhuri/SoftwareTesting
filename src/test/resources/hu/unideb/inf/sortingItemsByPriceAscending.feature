Feature: Saucedemo Inventory Filtering

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Sorting items by price (low to high)
    When the 'Filter' dropdown is selected with 'Price (low to high)'
    Then the items should be sorted by price in ascending order
