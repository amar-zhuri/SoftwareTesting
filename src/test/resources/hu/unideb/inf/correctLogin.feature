Feature: Correct User Login

  Background:
    Given the home page is opened

    Scenario Outline: Correct login attempts
      Given the 'Username' field is filled with '<username>'
      And the 'Password' field is filled with '<password>'
      When the 'Login' button is clicked
      Then the user should be redirected to the invetory URL
      Examples:
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce |
      |error_user  |secret_sauce |
      |visual_user |secret_sauce |
      |performance_glitch_user|secret_sauce|