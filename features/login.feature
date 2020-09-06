Feature: user can login

  Scenario: Login as auth user
    Given Open Amazon page
    When Click login
    When Enters credentials
    Then Info shows up