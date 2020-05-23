Feature: The user creates a new account
  Scenario: The user creates a new account
    Given The user is on Phone app
    When The user taps "Contacts"
    And The user taps "Create_a_new_contact"
    And The user types "John" to "First_Name" area
    And The user types "Doe" to "Last_Name" area
    And The user types "07501234567" to "Phone" area
    And The user taps "Save"
    Then "John Doe" is diplayed in "John_Doe"

