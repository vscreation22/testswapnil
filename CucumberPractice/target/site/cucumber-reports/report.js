$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contact_Fill_form.feature");
formatter.feature({
  "line": 1,
  "name": "contact fill form senario",
  "description": "",
  "id": "contact-fill-form-senario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "To verify that user should be able to fill contact form",
  "description": "",
  "id": "contact-fill-form-senario;to-verify-that-user-should-be-able-to-fill-contact-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@contacts_Form"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should have on login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When enter user details"
    },
    {
      "line": 7,
      "value": "#|swapnil7004|swapnil22|"
    }
  ],
  "line": 8,
  "name": "enter user credentials excle",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#And User enters UserName and Password"
    },
    {
      "line": 10,
      "value": "# And user enters valid credentials as \"Swapnilv215@gmail.com\" and \"swapnil22\""
    }
  ],
  "line": 11,
  "name": "Message displayed crm Login Successfully again",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "mouse hover on contacts option",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on the new contact option \"\u003cfristname\u003e\" and \"\u003clastname\u003e\" and \"\u003ccompany\u003e\" and \"\u003cposition\u003e\" and \"\u003cmobile\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "contact-fill-form-senario;to-verify-that-user-should-be-able-to-fill-contact-form;",
  "rows": [
    {
      "cells": [
        "fristname",
        "lastname",
        "company",
        "position",
        "mobile"
      ],
      "line": 16,
      "id": "contact-fill-form-senario;to-verify-that-user-should-be-able-to-fill-contact-form;;1"
    },
    {
      "cells": [
        "Swapnil",
        "Vyawahare",
        "Ioconnect",
        "QA eng",
        "9028971601"
      ],
      "line": 17,
      "id": "contact-fill-form-senario;to-verify-that-user-should-be-able-to-fill-contact-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7809589700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "To verify that user should be able to fill contact form",
  "description": "",
  "id": "contact-fill-form-senario;to-verify-that-user-should-be-able-to-fill-contact-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@contacts_Form"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User should have on login Page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When enter user details"
    },
    {
      "line": 7,
      "value": "#|swapnil7004|swapnil22|"
    }
  ],
  "line": 8,
  "name": "enter user credentials excle",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#And User enters UserName and Password"
    },
    {
      "line": 10,
      "value": "# And user enters valid credentials as \"Swapnilv215@gmail.com\" and \"swapnil22\""
    }
  ],
  "line": 11,
  "name": "Message displayed crm Login Successfully again",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "mouse hover on contacts option",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on the new contact option \"Swapnil\" and \"Vyawahare\" and \"Ioconnect\" and \"QA eng\" and \"9028971601\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Contact_Fill_form.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 6771243700,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Fill_form.read_data_from_excel()"
});
formatter.result({
  "duration": 6498855600,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Fill_form.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 178100,
  "status": "passed"
});
formatter.match({
  "location": "Contact_Fill_form.mouse_hover_on_contacts_option()"
});
formatter.result({
  "duration": 3390910600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Swapnil",
      "offset": 33
    },
    {
      "val": "Vyawahare",
      "offset": 47
    },
    {
      "val": "Ioconnect",
      "offset": 63
    },
    {
      "val": "QA eng",
      "offset": 79
    },
    {
      "val": "9028971601",
      "offset": 92
    }
  ],
  "location": "Contact_Fill_form.click_on_the_new_contact_option(String,String,String,String,String)"
});
formatter.result({
  "duration": 8165552100,
  "status": "passed"
});
formatter.after({
  "duration": 2788495700,
  "status": "passed"
});
});