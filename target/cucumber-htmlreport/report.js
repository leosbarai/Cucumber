$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoFF.feature");
formatter.feature({
  "line": 1,
  "name": "Validate first and last name4",
  "description": "As a user I need to validate first and last name",
  "id": "validate-first-and-last-name4",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check first name and last name41",
  "description": "",
  "id": "validate-first-and-last-name4;check-first-name-and-last-name41",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on demo site page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters last name",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoStepDef.user_need_to_be_on_demo_site_page()"
});
formatter.result({
  "duration": 14895408691,
  "status": "passed"
});
formatter.match({
  "location": "DemoStepDef.user_enters_first_name()"
});
formatter.result({
  "duration": 1187785968,
  "status": "passed"
});
formatter.match({
  "location": "DemoStepDef.user_enters_last_name()"
});
formatter.result({
  "duration": 1181749812,
  "status": "passed"
});
formatter.match({
  "location": "MultiStepDef.close_browser()"
});
formatter.result({
  "duration": 961761541,
  "status": "passed"
});
formatter.uri("GoogleFF.feature");
formatter.feature({
  "line": 1,
  "name": "Validate search of Google5",
  "description": "As a user I need to validate a search of Google",
  "id": "validate-search-of-google5",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validade search field51",
  "description": "",
  "id": "validate-search-of-google5;validade-search-field51",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters search string",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleStepDef.user_need_to_be_on_google_page()"
});
formatter.result({
  "duration": 4322789760,
  "status": "passed"
});
formatter.match({
  "location": "GoogleStepDef.user_enters_search_string()"
});
formatter.result({
  "duration": 1171179798,
  "status": "passed"
});
formatter.match({
  "location": "MultiStepDef.close_browser()"
});
formatter.result({
  "duration": 997018938,
  "status": "passed"
});
formatter.uri("MultiFF.feature");
formatter.feature({
  "line": 1,
  "name": "Create account of Facebook6",
  "description": "As a user I need to open facebook home page and do the validations",
  "id": "create-account-of-facebook6",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validade First Name field61",
  "description": "",
  "id": "create-account-of-facebook6;validade-first-name-field61",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.match({
  "location": "MultiStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 5213353424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "MultiStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 190487703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "MultiStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 53374773,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate create a user multiple fields62",
  "description": "",
  "id": "create-account-of-facebook6;validate-create-a-user-multiple-fields62",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enters user \"Ryan\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enters user \"Jack\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User checks user \"Ryan\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User mobile field should be blank",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "MultiStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 1971744592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "MultiStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 174951063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 18
    }
  ],
  "location": "MultiStepDef.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 249273094,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "MultiStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 50496449,
  "status": "passed"
});
formatter.match({
  "location": "MultiStepDef.user_mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 40753702,
  "status": "passed"
});
formatter.match({
  "location": "MultiStepDef.close_browser()"
});
formatter.result({
  "duration": 109033634,
  "status": "passed"
});
});