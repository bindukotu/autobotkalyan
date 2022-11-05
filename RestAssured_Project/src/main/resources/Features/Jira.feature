@JiraAutomation
Feature: To automate the jira using postman

@EpicCreation
  Scenario: To create the Epic using postman
    Given I am on the jira application
    When I pass the end point to create the Epic
    Then I see the status code 201
