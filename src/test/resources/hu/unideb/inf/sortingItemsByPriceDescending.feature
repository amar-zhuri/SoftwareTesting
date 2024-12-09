Feature: Sorting items by price in descending order

  Scenario: Verify items are sorted by price from high to low
    Given the home page is opened
    And the "Username" field is filled with "standard_user"
    And the "Password" field is filled with "secret_sauce"
    When the "Login" button is clicked
    When the 'Filter' dropdown is selected with "Price (high to low)"
    Then the items should be sorted by price in descending order
