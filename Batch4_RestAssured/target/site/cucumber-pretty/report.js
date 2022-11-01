$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/Reqres.feature");
formatter.feature({
  "name": "To test all Reqres.in application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regres"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To test the get api calls in reqres.in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@GETAPI"
    }
  ]
});
formatter.step({
  "name": "I pass the \u003cendPoint\u003e for get Api call",
  "keyword": "When "
});
formatter.step({
  "name": "I get the statusCode \u003cstatusCode\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "endPoint",
        "statusCode"
      ]
    },
    {
      "cells": [
        "api/users?page\u003d2",
        "200"
      ]
    },
    {
      "cells": [
        "api/users/2",
        "200"
      ]
    },
    {
      "cells": [
        "api/users/23",
        "404"
      ]
    },
    {
      "cells": [
        "api/unknown",
        "200"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on Reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iAmOnReqresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the get api calls in reqres.in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regres"
    },
    {
      "name": "@GETAPI"
    }
  ]
});
formatter.step({
  "name": "I pass the api/users?page\u003d2 for get Api call",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iPassTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the statusCode 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iGetTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on Reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iAmOnReqresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the get api calls in reqres.in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regres"
    },
    {
      "name": "@GETAPI"
    }
  ]
});
formatter.step({
  "name": "I pass the api/users/2 for get Api call",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iPassTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the statusCode 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iGetTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on Reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iAmOnReqresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the get api calls in reqres.in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regres"
    },
    {
      "name": "@GETAPI"
    }
  ]
});
formatter.step({
  "name": "I pass the api/users/23 for get Api call",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iPassTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the statusCode 404",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iGetTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am on Reqres application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iAmOnReqresApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To test the get api calls in reqres.in",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regres"
    },
    {
      "name": "@GETAPI"
    }
  ]
});
formatter.step({
  "name": "I pass the api/unknown for get Api call",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iPassTheEndpoint(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get the statusCode 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.stepDefintion.iGetTheStatusCode(int)"
});
formatter.result({
  "status": "passed"
});
});