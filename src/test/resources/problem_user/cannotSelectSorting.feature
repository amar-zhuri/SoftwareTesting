Feature: Validate Sorting Behavior for Problem User

  Scenario: Sorting dropdown is stuck for problem_user
    Given the home page is opened
    And the "Username" field is filled with "problem_user"
    And the "Password" field is filled with "secret_sauce"
    When the "Login" button is clicked
    When the sorting option is changed to "Price (low to high)"
    Then the sorting dropdown should still show "Name (A to Z)"
