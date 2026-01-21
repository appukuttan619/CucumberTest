Feature: Testing the login functionality of OrangeHrm
  Given user is on landing page
  Scenario: Positive Scenario
    When user gives userName
    And user gives password
    And clicks on login
    Then verify user is on dashboard

