$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("premierleaguebet.feature");
formatter.feature({
  "line": 1,
  "name": "Place a bet for an English premier league game",
  "description": "\r\nAs a WH Customer I want the ability to place a bet on a English Premier League event",
  "id": "place-a-bet-for-an-english-premier-league-game",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3842467095,
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
  "name": "I select an english premier league club \"Liverpool\" and place a \"0.05\" bet",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the odds and returns for club \"Liverpool\"  offered are displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.I_am_on_the_William_Hill_homepage()"
});
formatter.result({
  "duration": 6452656655,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_select_the_football_option()"
});
formatter.result({
  "duration": 163805591,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.I_select_the_competitions_option()"
});
formatter.result({
  "duration": 1202895273,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liverpool",
      "offset": 41
    },
    {
      "val": "0.05",
      "offset": 65
    }
  ],
  "location": "StepDefinition.iSelectAnEnglishPremierLeagueClubAndPlaceABet(String,String)"
});
formatter.result({
  "duration": 3337145271,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[starts-with(@id,\u0027stake-input\u0027)]\"}\n  (Session info: chrome\u003d57.0.2987.133)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 39 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027UK866122\u0027, ip: \u002710.254.151.39\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\921495\\AppData\\Local\\Temp\\scoped_dir12444_2097}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d57.0.2987.133, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: fb693b5ec544e68717bc8a8d68635cbd\n*** Element info: {Using\u003dxpath, value\u003d//input[starts-with(@id,\u0027stake-input\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat pages.FootballCompetitionsPage.enterBettingAmount(FootballCompetitionsPage.java:47)\r\n\tat steps.StepDefinition.iSelectAnEnglishPremierLeagueClubAndPlaceABet(StepDefinition.java:60)\r\n\tat ✽.And I select an english premier league club \"Liverpool\" and place a \"0.05\" bet(premierleaguebet.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Liverpool",
      "offset": 31
    }
  ],
  "location": "StepDefinition.theOddsAndReturnsForClubOfferedAreDisplayedCorrectly(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 20526,
  "status": "passed"
});
});