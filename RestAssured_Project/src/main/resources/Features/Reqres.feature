@Reqres
Feature: To test the reqres.in application

  Background:
    Given I am on the reqres application

@GETAPI
  Scenario Outline: To test the list of users in reqres
    When I pass the <endpoint> for get api call
    Then I get the statusCode <statusCode>
    Examples:
      | endpoint         | statusCode |
      | api/users?page=2 | 200        |
      | api/users/2      | 200        |
      | api/unknown      | 200        |
      | api/unknown/2    | 200        |

  @POSTAPI
  Scenario: To test the create users in reqres
    When I pass the endpoint for post api call
    Then I get the statusCode 201

