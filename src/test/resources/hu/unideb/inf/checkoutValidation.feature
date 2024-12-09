Feature: Checkout Validation

  Scenario Outline: Validate checkout form with different inputs
    Given the home page is opened
    And the "Username" field is filled with "standard_user"
    And the "Password" field is filled with "secret_sauce"
    And the "Login" button is clicked
    And the "Cart" button is clicked
    And the "Checkout" button is clicked
    When the "First Name" field is filled with "<firstName>"
    And the "Last Name" field is filled with "<lastName>"
    And the "Zip Code" field is filled with "<zipCode>"
    And the "Continue" button is clicked
    Then the error message "<expectedErrorMessage>" should be displayed
    And the 'Cancel' button is clicked

    Examples:
      | firstName       | lastName        | zipCode   | expectedErrorMessage                |
      |                 | SomeLastName    | 12345     | Error: First Name is required       |
      | SomeFirstName   |                 | 12345     | Error: Last Name is required        |
      | SomeFirstName   | SomeLastName    |           | Error: Postal Code is required      |
      |                 |                 |           | Error: First Name is required       |
      |                 |                 | 12345     | Error: First Name is required       |
      | SomeFirstName   |                 |           | Error: Last Name is required        |
