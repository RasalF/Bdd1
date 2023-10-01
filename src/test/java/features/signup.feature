Feature: signUp feature

  @signup @regression @smoke @hb
  Scenario: verify user can successfully create an account
    Given user at TalentTek homepage
    And user click on "Create new Account" Button
    And user fill out the sign up form with all valid data
    When user click on "Create my account" button at the end
    Then user should be able to see "Thank you for sign up" message