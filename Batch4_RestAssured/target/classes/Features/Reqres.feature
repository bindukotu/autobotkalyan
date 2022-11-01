@Regres
Feature: To test all Reqres.in application

  Background:
    Given I am on Reqres application

  @GETAPI
  Scenario Outline: To test the get api calls in reqres.in
    When I pass the <endPoint> for get Api call
    Then I get the statusCode <statusCode>

    Examples:
      | endPoint         | statusCode |
      | api/users?page=2 | 200        |
      | api/users/2      | 200        |
      | api/users/23     | 404        |
      | api/unknown      | 200        |

  @POSTAPI
  Scenario: To test the create user in reqres
    When I pass the endpoint for post Api call
    Then I get the statusCode 201

