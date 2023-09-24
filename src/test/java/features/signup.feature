Feature: signUp feature
  Background :
    Given user at TalentTek

  @signup @regression @smoke
  Scenario : verify user can successfully create an account
    And user click on "Create new Account" Button
    And user fill out the sign up form with all valid data
    When user click on "Create my account" button at the end
    Then user should be able to see "Thank you for sign up" message

  @signup @regression @smoke
#  Scenario: Verify that user could not able to create an account by leaving the first name field empty
#    Given user at talentTek homepage
#    And user click on "Create New Account" Button
#    And user left the first name field empty
#    And user click on "Create my account" button
#    Then user could not able to create an account and will see "The First Name field is required." message
#
#  @signup @regression @smoke
#  Scenario: Verify user could not able to create an account the first name with special characters
#    Given user at talentTek Homepage
#    And user click on "Create New Account" Button
#    And user enter  First Name as "@#Ra"
#    And user fill out the rest of the form with valid data
#    And user click on "Create my account" button
#    Then user could not able to create an account and will see "The First Name field may only contain alphabetical characters." message
#
#  @signup @regression @smoke
#  Scenario: Verify that user could not able to create an account with firstname less than 3 char
#    Given user at talentTEK Homepage
#    And user click on "Create New Account" Button
#    And user enter firstname as "ra"
#    And user fill out the rest of the form with valid data
#    When user click on "Create my account" button
#    Then user could not be able to create an account and will see "The First Name field must be at least 3 characters in length." message
#
#  @signup @regression @smoke
#  Scenario: Verify that user could not able to create an account by leaving the Last name field empty
#    Given user at talentTek homepage
#    And user click on "Create New Account" Button
#    And user left the last name field empty
#    And user click on "Create my account" button
#    Then user could not able to create an account and will see "The Last Name field is required."
#
#  @signup @regression @smoke
#  Scenario: Verify that user could not able to create an account lastname with special characters
#    Given user at talentTek Homepage
#    And user click on "Create New Account" Button
#    And user enter lastname as "Fa@%"
#    And user fill out the rest of the form with valid data
#    And user click on "Create my account" button
#    Then user could not able to create an account and will see "The Last Name field may only contain alphabetical characters." message
#
#
#  @signup @regression @smoke
#  Scenario: Verify that user could not able to create an account with lastname less than 3 char
#    Given user at talentTEK Homepage
#    And user click on "Create New Account" Button
#    And user enter lastname as "Fa"
#    And user fill out the rest of the form with valid data
#    When user click on "Create my account" button
#    Then user could not be able to create an account and will see "The Last Name field must be at least 3 characters in length." message
#
