Feature: AddNewAddressFeature
  This feature is responsible for testing all the scenarios for login of application

  Background:
    Given I am a customer user
    And I accept the cookies preference


  Scenario: 1- Check Login with correct username and password
    And I click the sign up link
    When I login successfully with the correct credentials
      | Email                | Password  |
      | ibi35awesu@gmail.com | 123456789 |
    And I navigate to My Account overview page
    And I click Directory to add new address
    Then I land in My Account Directory page
    When I click the Add new address
    And I fill the form displayed on the screen
    And I click the save button
    Then the new address added to my account profile
    And I delete the current address to revert back to the previous status