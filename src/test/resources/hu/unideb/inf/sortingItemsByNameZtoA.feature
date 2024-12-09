Feature: Sorting Items

  Scenario: Items should be sorted by name in descending order
    Given the home page is opened
    And the "Username" field is filled with "standard_user"
    And the "Password" field is filled with "secret_sauce"
    When the "Login" button is clicked
    And the 'Filter' dropdown is selected with "Name (Z to A)"
    Then the items should be sorted by name in descending order
