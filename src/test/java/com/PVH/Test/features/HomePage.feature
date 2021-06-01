Feature: LoginFeature
  This feature is responsible for testing all the scenarios for login of application

  Background:
    Given I am a customer user
    And I accept the cookies preference


  Scenario: 1- Check Login with correct username and password
    And I click the sign up link
    When I login successfully with the correct credentials
      | Email                | Password  |
      | ibi35awesu@gmail.com | 123456789 |
    Then I should see the account login successful with the text "Hoi!"


  Scenario: 2- Check Login with correct username and blank password
    And I click the sign up link
    When I enter the correct username as "ibi35awesu@gmail.com"
    And I leave the "password" field blank
    And I click the sign up button
    Then I should see an error message displayed:
      | Vul het veld in |

  Scenario: 3- Check Login with correct password and blank email
    And I click the sign up link
    When I enter the correct password as "123456789"
    And I leave the "email" field blank
    And I click the sign up button
    Then I should see an error message displayed:
      | Vul het veld in |

  Scenario: 4- Check with blank email and password
    And I click the sign up link
    When I leave the "email" field blank
    And I leave the "password" field blank
    And I click the sign up button
    Then I should see an error message displayed:
      | Vul het veld in |
      | Vul het veld in |

  Scenario: 5- Check Login with correct email and invalid password
    And I click the sign up link
    When I enter the correct username as "ibi35awesu@gmail.com"
    When I enter the correct password as "gameOver"
    And I click the sign up button
    Then I should see an error message displayed:
      | Je gebruikersnaam en wachtwoord matchen niet. Probeer het nog eens. |