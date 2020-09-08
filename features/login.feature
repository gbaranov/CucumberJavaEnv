Feature: user can login


Background:
  Given Open Amazon page

  Scenario: Login as auth user
    When Click login
    When Enters username as "username@gmail.com"
    Then Info shows up

  Scenario Outline: the user should be avle to login
    When the user enters "<username>" and "<password>"
    Then user should be able to see account balance

    Examples:
      | username  | password  |
      | username2 | password2 |
      | username3 | password3 |