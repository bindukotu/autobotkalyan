Feature: To test the all petstore.swagger.io application

  Background:
    Given I am on petstore apllication

  Scenario: To test the get api call in petstore.swagger.io
    When I pass the endpoint for get Api call
    Then I get the statusCode 404

  Scenario: To test the post api call in petstore.swagger.io

    When I pass the endpoint for post api call
    Then I get the statusCode 404