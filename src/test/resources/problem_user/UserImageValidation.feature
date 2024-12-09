Feature: Validate product images for problem user

  Scenario: Problem user sees the same image for all products
    Given the home page is opened
    And the "Username" field is filled with "problem_user"
    And the "Password" field is filled with "secret_sauce"
    When the "Login" button is clicked
    Then all products should have the same image
