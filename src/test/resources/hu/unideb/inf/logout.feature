Feature: Saucedemo Logout Functionality

  Background:
    Given the home page is opened

  Scenario Outline: Logging out from the application

    And the 'Username' field is filled with '<username>'
    And the 'Password' field is filled with '<password>'
    And the 'Login' button is clicked
    When the 'Menu' button is clicked
    And the 'Logout' button is clicked
    Then the user should be redirected to the login page
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce |
      |error_user  |secret_sauce |
      |visual_user |secret_sauce |
      |performance_glitch_user|secret_sauce|