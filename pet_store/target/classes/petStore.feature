@petstore
Feature:To test petstore.swagger.io application
  Background:
    Given I am on petstore application
@POSTCREATEUSER
  Scenario: To test the create users in petstore
    When I pass the endpoint for create users
    Then I get the status code 200
@USERLOGIN
  Scenario: To test the login functionality
    When I pass end point for login page
    And I enter the validUsername and validPassword
    Then i get the status code 200

@CREATEUSERSWITHARRAY
Scenario: To create list of users with given input array
  When I enter the end point for creating list of users
  And I provide payload
  Then I get the status code 200

