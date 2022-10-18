$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLoginFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios billing login Functinality validation",
  "description": "",
  "id": "techfios-billing-login-functinality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2945853900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 901750100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functinality-validation;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DbTechfiosLogin1"
    },
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Given User is on Techfios login page"
    }
  ],
  "line": 10,
  "name": "User enters username from database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters password from database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User Should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_from_database()"
});
formatter.result({
  "duration": 3677657700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_password_from_database()"
});
formatter.result({
  "duration": 3094706300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 3961218000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_Should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 142853100,
  "status": "passed"
});
formatter.after({
  "duration": 892513300,
  "status": "passed"
});
});