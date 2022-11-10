@Swagger
Feature: To test the petstore.swagger.io application

  Background:
    Given I am on the petstore applicaton

  @POSTAPI
  Scenario: To test the create user in the petstore application
    When I pass the endpoint for the postapi call
    Then  I get the status code 200


  @POSTAPI1
  Scenario: To test the add the new pet in the pet store application
    When I pass the endpoint for Pet object that needs to be added to the store
    Then  I get the status code 200






