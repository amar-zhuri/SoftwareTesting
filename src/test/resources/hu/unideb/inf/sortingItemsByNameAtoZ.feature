Feature: Inventory Sorting Validation

  Background:
    Given the home page is opened
    And the 'Username' field is filled with 'standard_user'
    And the 'Password' field is filled with 'secret_sauce'
    And the 'Login' button is clicked

  Scenario: Sorting items by name (A to Z)
    When the 'Filter' dropdown is selected with 'Name (A to Z)'
    Then the items should be sorted by name in ascending order
