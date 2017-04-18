$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("premierleaguebet.feature");
formatter.feature({
  "line": 1,
  "name": "Place a bet for an English premier league game",
  "description": "\r\nAs a WH Customer I want the ability to place a bet on a English Premier League event",
  "id": "place-a-bet-for-an-english-premier-league-game",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3958550555,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "English Premier League bet",
  "description": "",
  "id": "place-a-bet-for-an-english-premier-league-game;english-premier-league-bet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the William Hill homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select the football option",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select the competitions option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select an english premier league club \"Bournemouth\" and place a \"0.05\" bet",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the odds and returns for club \"Bournemouth\"  offered are displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.I_am_on_the_William_Hill_homepage()"
});
formatter.result({
  "duration": 6084878159,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_select_the_football_option()"
});
formatter.result({
  "duration": 478725059,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_select_the_competitions_option()"
});
formatter.result({
  "duration": 1324911595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bournemouth",
      "offset": 41
    },
    {
      "val": "0.05",
      "offset": 67
    }
  ],
  "location": "StepDefinition.iSelectAnEnglishPremierLeagueClubAndPlaceABet(String,String)"
});
formatter.result({
  "duration": 4368290133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bournemouth",
      "offset": 31
    }
  ],
  "location": "StepDefinition.theOddsAndReturnsForClubOfferedAreDisplayedCorrectly(String)"
});
formatter.result({
  "duration": 273698090,
  "status": "passed"
});
formatter.after({
  "duration": 1628534753,
  "status": "passed"
});
});