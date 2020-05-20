Feature: The user creates a new account
  Scenario: The user creates a new account
    Given The user is on Phone app
    When The user taps "Contacts"
    And The user types "John" to "First_Name" area
    And The user types "Doe" to "Last_Name" area
    And The user types "07501234567" to "Phone" area
    And The user taps "Save"
    Then the number is saved

