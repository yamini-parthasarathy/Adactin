$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Parallel.feature");
formatter.feature({
  "line": 1,
  "name": "Launch browser parallelly",
  "description": "",
  "id": "launch-browser-parallelly",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Launch google browser first and then facebook browser",
  "description": "",
  "id": "launch-browser-parallelly;launch-google-browser-first-and-then-facebook-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch google application url",
  "keyword": "Given "
});
formatter.match({
  "location": "Test2.user_launch_google_application_url()"
});
formatter.result({
  "duration": 29071481200,
  "status": "passed"
});
});