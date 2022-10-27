@Reqres
Feature: To test all reqres.in application

  Background:
    Given Iam on Reqres application

@GETLISTOFUSERS
  Scenario: To test the list of users in reqres
    When I pass the end point for get list of users
    Then I get the status code 404
@POSTAPI
  Scenario: To test the create users in reqres
    When I pass the end point for post api call
    Then I get the status code 201

@GETAPI
  Scenario Outline: To test the all get calls in reqres
    When I pass the <endPoint>for get api call
    Then I get the status code <statusCode>
    Examples:
      | endPoint          | statusCode |
      | /api/users?page=2 | 200        |
      | /api/users/2      | 200        |
      | /api/users/23     | 404        |
      | /api/unknown      | 200        |
      | /api/unknown/2    | 200        |

@POSTAPIPOJO
  Scenario: To test the create users in reqres by using pojo
    When I pass the end point for post api call ( pojo)
    Then I get the status code 201