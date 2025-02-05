$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/FacebookNew.feature");
formatter.feature({
  "name": "Validation of Facebook Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validation of Login Fuctionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sainty"
    }
  ]
});
formatter.step({
  "name": "user launch URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefination.Facebook2Stepdef.user_launch_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the creads",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefination.Facebook2Stepdef.user_enters_the_creads()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the new Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.Facebook2Stepdef.user_validate_the_new_Home_Page()"
});
formatter.result({
  "status": "passed"
});
});