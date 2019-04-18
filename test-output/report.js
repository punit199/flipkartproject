$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Er punit kumar/eclipse-workspacenew/fipcatproject/src/test/java/feature/homepage.feature");
formatter.feature({
  "line": 2,
  "name": "filpkat home page",
  "description": "",
  "id": "filpkat-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "duration": 24553934865,
  "status": "passed"
});
formatter.before({
  "duration": 147106,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "select the mi phone with range 10000 to 20000",
  "description": "",
  "id": "filpkat-home-page;select-the-mi-phone-with-range-10000-to-20000",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@SmokeTesting"
    },
    {
      "line": 16,
      "name": "@first"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "close the popup",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "login to filpkat",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "enter the \"mobile\" in search box and enter",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "set the range and verify the range",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "select the ram for ph",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "get all the sujjected phone in ui",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage.close_the_popup()"
});
formatter.result({
  "duration": 684191305,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.login_to_filpkat()"
});
formatter.result({
  "duration": 1018254897,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mobile",
      "offset": 11
    }
  ],
  "location": "HomePage.enter_the_mobile_name_in_search_box_and_enter(String)"
});
formatter.result({
  "duration": 3642348043,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.set_the_range_and_verify_the_range()"
});
formatter.result({
  "duration": 9073267190,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.select_the_ram_for_ph()"
});
formatter.result({
  "duration": 252383960,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.get_all_the_sujjected_phone_in_ui()"
});
formatter.result({
  "duration": 1860690521,
  "status": "passed"
});
formatter.after({
  "duration": 61152,
  "status": "passed"
});
formatter.after({
  "duration": 2336682859,
  "status": "passed"
});
});