@petstore
Feature:To test petstore.swagger.io application
@POSTCREATEUSER
  Scenario: To test the create users in petstore
    Given I am on petstore application
    When I pass the endpoint for create users
    Then I get the status code 200

  Scenario Outline: To test the login functionality
    Given I am on petstore application
    When I pass end point for login page
    Then I enter the "<validUsername>"
    And I enter the "<validPassword>"
    And click on login button
    Then i get the status code 200


    Examples:
      | validUsername | validPassword |
      | abc           | ab1234        |
      | def           | de459         |
      | ghi           | aei89         |