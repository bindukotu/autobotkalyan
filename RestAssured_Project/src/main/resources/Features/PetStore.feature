@Swagger
Feature: To test the petstore.swagger.io application

  @POSTAPI
  Scenario: To test the create user in the petstore applicatio
     Given I am on the petstore applicaton
    When I pass the endpoint for the postapi call
    Then  I get the status code 200
