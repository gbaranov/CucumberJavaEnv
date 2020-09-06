Feature: user can login


Background:
  Given Open Amazon page

  Scenario: Login as auth user
    When Click login
    When Enters credentials
    Then Info shows up