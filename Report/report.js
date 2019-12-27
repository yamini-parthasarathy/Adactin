$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality for adactin application",
  "description": "",
  "id": "login-functionality-for-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"\u003cusername\u003e\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;1"
    },
    {
      "cells": [
        "ragu1234",
        "ragu1234"
      ],
      "line": 18,
      "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 636400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"aarthyrajeev\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter \"abc123\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 29557299700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aarthyrajeev",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 5834465700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 235627800,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 7566995700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successful login into the adactin application with valid credential",
  "description": "",
  "id": "login-functionality-for-adactin-application;successful-login-into-the-adactin-application-with-valid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user enter application url",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enter \"ragu1234\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enter \"ragu1234\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 1136347500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ragu1234",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 254628500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ragu1234",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 132071700,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 3889480200,
  "status": "passed"
});
formatter.after({
  "duration": 344600,
  "status": "passed"
});
formatter.before({
  "duration": 201700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"aarthyrajeev\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter \"abc123\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 761714600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aarthyrajeev",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 151933800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 111723000,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 2612492100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Search adactin application for Location,Hotel,roomtype,no of rooms,adultsperroom,search",
  "description": "",
  "id": "login-functionality-for-adactin-application;search-adactin-application-for-location,hotel,roomtype,no-of-rooms,adultsperroom,search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@searchhotel1"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user enter Location",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "user enter Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user enter RoomType",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user enter NoOfRooms",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user clicks search",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Select radio button option",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "click continue",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user enter FirstName",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "user enter LastName",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user enter BillingAddress",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user enter CcNo",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user enter CcType",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user enter ExpiryMonth",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user enter ExpiryYear",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user enter CvvNo",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user clicks BookNow",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user clicks get itinerary",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user selects all itinerary",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "user clicks cancel selected options",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user clicks and logs out of the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_Location()"
});
formatter.result({
  "duration": 2775196700,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_Hotel()"
});
formatter.result({
  "duration": 1420494300,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_RoomType()"
});
formatter.result({
  "duration": 1262811700,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_NoOfRooms()"
});
formatter.result({
  "duration": 1145295800,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_clicks_search()"
});
formatter.result({
  "duration": 3850340300,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmationPage_StepDefinition.select_radio_button_option()"
});
formatter.result({
  "duration": 2541205000,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmationPage_StepDefinition.click_continue()"
});
formatter.result({
  "duration": 4289913800,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_FirstName()"
});
formatter.result({
  "duration": 2870654300,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_LastName()"
});
formatter.result({
  "duration": 2230005100,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_BillingAddress()"
});
formatter.result({
  "duration": 2153162400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CcNo()"
});
formatter.result({
  "duration": 2367619300,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CcType()"
});
formatter.result({
  "duration": 2197376600,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_ExpiryMonth()"
});
formatter.result({
  "duration": 2289724900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_ExpiryYear()"
});
formatter.result({
  "duration": 2233887700,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CvvNo()"
});
formatter.result({
  "duration": 2143897400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_clicks_BookNow()"
});
formatter.result({
  "duration": 8128517600,
  "status": "passed"
});
formatter.match({
  "location": "RBookingPage_StepDefinition.user_clicks_get_itinerary()"
});
formatter.result({
  "duration": 7446007100,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_selects_all_itinerary()"
});
formatter.result({
  "duration": 2261682300,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_clicks_cancel_selected_options()"
});
formatter.result({
  "duration": 4710379800,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_clicks_and_logs_out_of_the_webpage()"
});
formatter.result({
  "duration": 3950390600,
  "status": "passed"
});
formatter.after({
  "duration": 246400,
  "status": "passed"
});
formatter.before({
  "duration": 246200,
  "status": "passed"
});
formatter.before({
  "duration": 239200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enter application url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"aarthyrajeev\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter \"abc123\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify the username in the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "ILogin_StepDefinition.user_enter_application_url()"
});
formatter.result({
  "duration": 1043414300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aarthyrajeev",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_username(String)"
});
formatter.result({
  "duration": 228849100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 12
    }
  ],
  "location": "ILogin_StepDefinition.user_enter_as_password(String)"
});
formatter.result({
  "duration": 141390900,
  "status": "passed"
});
formatter.match({
  "location": "ILogin_StepDefinition.user_verify_the_username_in_the_homepage()"
});
formatter.result({
  "duration": 2422284100,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Search adactin application for Location,Hotel,roomtype,no of rooms,adultsperroom,search",
  "description": "",
  "id": "login-functionality-for-adactin-application;search-adactin-application-for-location,hotel,roomtype,no-of-rooms,adultsperroom,search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 43,
      "name": "@searchhotel2"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "user enter Location",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "user enter Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user enter RoomType",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user enter NoOfRooms",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user clicks search",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "Select radio button option",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "click continue",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "user enter FirstName",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "user enter LastName",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user enter BillingAddress",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "user enter CcNo",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user enter CcType",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "user enter ExpiryMonth",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "user enter ExpiryYear",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user enter CvvNo",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user clicks BookNow",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "user clicks get itinerary",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "user selects all itinerary",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "user clicks cancel selected options",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "user clicks and logs out of the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_Location()"
});
formatter.result({
  "duration": 1216154100,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_Hotel()"
});
formatter.result({
  "duration": 1152828800,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_RoomType()"
});
formatter.result({
  "duration": 1260693900,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_enter_NoOfRooms()"
});
formatter.result({
  "duration": 1118296700,
  "status": "passed"
});
formatter.match({
  "location": "JSearch_StepDefinition.user_clicks_search()"
});
formatter.result({
  "duration": 18167800400,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmationPage_StepDefinition.select_radio_button_option()"
});
formatter.result({
  "duration": 2152708000,
  "status": "passed"
});
formatter.match({
  "location": "KConfirmationPage_StepDefinition.click_continue()"
});
formatter.result({
  "duration": 3276411100,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_FirstName()"
});
formatter.result({
  "duration": 2179602900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_LastName()"
});
formatter.result({
  "duration": 2320566300,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_BillingAddress()"
});
formatter.result({
  "duration": 2225342800,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CcNo()"
});
formatter.result({
  "duration": 2317388600,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CcType()"
});
formatter.result({
  "duration": 2172854700,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_ExpiryMonth()"
});
formatter.result({
  "duration": 2168564100,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_ExpiryYear()"
});
formatter.result({
  "duration": 2205505400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_enter_CvvNo()"
});
formatter.result({
  "duration": 2138502300,
  "status": "passed"
});
formatter.match({
  "location": "PaymentPage_StepDefinition.user_clicks_BookNow()"
});
formatter.result({
  "duration": 8198108600,
  "status": "passed"
});
formatter.match({
  "location": "RBookingPage_StepDefinition.user_clicks_get_itinerary()"
});
formatter.result({
  "duration": 6868859200,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_selects_all_itinerary()"
});
formatter.result({
  "duration": 2167732800,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_clicks_cancel_selected_options()"
});
formatter.result({
  "duration": 4138859900,
  "status": "passed"
});
formatter.match({
  "location": "SBookingItinerary_StepDefinition.user_clicks_and_logs_out_of_the_webpage()"
});
formatter.result({
  "duration": 812122400,
  "status": "passed"
});
formatter.after({
  "duration": 112800,
  "status": "passed"
});
});