$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 2,
  "name": "FaceBook",
  "description": "",
  "id": "facebook",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Assignment"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "FaceBook Login and Post message validation",
  "description": "",
  "id": "facebook;facebook-login-and-post-message-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user login to \"\u003capplication\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user provides username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is logged into FaceBook home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user posts a status message \"\u003cmessage\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "status message \"\u003cmessage\u003e\" is posted successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "facebook;facebook-login-and-post-message-validation;",
  "rows": [
    {
      "cells": [
        "application",
        "message"
      ],
      "line": 14,
      "id": "facebook;facebook-login-and-post-message-validation;;1"
    },
    {
      "cells": [
        "FaceBook",
        "Hello World"
      ],
      "line": 15,
      "id": "facebook;facebook-login-and-post-message-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "FaceBook Login and Post message validation",
  "description": "",
  "id": "facebook;facebook-login-and-post-message-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Assignment"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user login to \"FaceBook\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user provides username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is logged into FaceBook home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user posts a status message \"Hello World\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "status message \"Hello World\" is posted successfully",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "FaceBook",
      "offset": 15
    }
  ],
  "location": "FaceBookStepDef.user_login_to(String)"
});
formatter.result({
  "duration": 9977147311,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookStepDef.user_provides_username_and_password()"
});
formatter.result({
  "duration": 15200872135,
  "status": "passed"
});
formatter.match({
  "location": "FaceBookStepDef.user_is_logged_into_FaceBook_home_page()"
});
formatter.result({
  "duration": 737044925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 29
    }
  ],
  "location": "FaceBookStepDef.user_posts_a_status_message(String)"
});
formatter.result({
  "duration": 3901673475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 16
    }
  ],
  "location": "FaceBookStepDef.status_message_is_posted_successfully(String)"
});
formatter.result({
  "duration": 10122192264,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(),\u0027Just now\u0027)]\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-C3IEI47\u0027, ip: \u0027192.168.0.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.46.628402 (536cd7adbad73a..., userDataDir: C:\\Users\\PRATIK~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:50808}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.142, webStorageEnabled: true}\nSession ID: 9e12d88d345df3fbd281edaabb32a7ac\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(),\u0027Just now\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat com.automation.pageobjects.FaceBookHomePO.linkJustNow(FaceBookHomePO.java:56)\r\n\tat com.automation.pages.FaceBookHomePage.postMessageValidation(FaceBookHomePage.java:39)\r\n\tat com.automation.stepdefs.FaceBookStepDef.status_message_is_posted_successfully(FaceBookStepDef.java:37)\r\n\tat ✽.Then status message \"Hello World\" is posted successfully(Facebook.feature:10)\r\n",
  "status": "failed"
});
formatter.uri("WalletHub.feature");
formatter.feature({
  "line": 2,
  "name": "FaceBook and WalletHub",
  "description": "",
  "id": "facebook-and-wallethub",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Assignment"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Wallethub Login and validation",
  "description": "",
  "id": "facebook-and-wallethub;wallethub-login-and-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user launches WalletHub \"\u003capplication\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters valid WalletHub credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user lands on WalletHub Homepage and give five stars after hovering on every star",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user chooses Policy dropdown, write the review and click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is navigated to confirmation page where user validates the review post is successfully posted and clicks on Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user navigates to Profile page from home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user validates review message",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "facebook-and-wallethub;wallethub-login-and-validation;",
  "rows": [
    {
      "cells": [
        "application"
      ],
      "line": 17,
      "id": "facebook-and-wallethub;wallethub-login-and-validation;;1"
    },
    {
      "cells": [
        "WalletHub"
      ],
      "line": 18,
      "id": "facebook-and-wallethub;wallethub-login-and-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Wallethub Login and validation",
  "description": "",
  "id": "facebook-and-wallethub;wallethub-login-and-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Assignment"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launches WalletHub \"WalletHub\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters valid WalletHub credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user lands on WalletHub Homepage and give five stars after hovering on every star",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user chooses Policy dropdown, write the review and click on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is navigated to confirmation page where user validates the review post is successfully posted and clicks on Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user navigates to Profile page from home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user validates review message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "WalletHub",
      "offset": 25
    }
  ],
  "location": "WalletHubStepDef.user_launches_WalletHub(String)"
});
formatter.result({
  "duration": 11660195187,
  "status": "passed"
});
formatter.match({
  "location": "WalletHubStepDef.user_enters_valid_WalletHub_credentials()"
});
formatter.result({
  "duration": 9604270588,
  "status": "passed"
});
formatter.match({
  "location": "WalletHubStepDef.user_lands_on_WalletHub_Homepage_and_give_five_stars_after_hovering_on_every_star()"
});
formatter.result({
  "duration": 10223564731,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 0, Size: 0\r\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:657)\r\n\tat java.util.ArrayList.get(ArrayList.java:433)\r\n\tat com.automation.pages.WalletHubHomePage.starValidationAndClick(WalletHubHomePage.java:20)\r\n\tat com.automation.stepdefs.WalletHubStepDef.user_lands_on_WalletHub_Homepage_and_give_five_stars_after_hovering_on_every_star(WalletHubStepDef.java:30)\r\n\tat ✽.Then user lands on WalletHub Homepage and give five stars after hovering on every star(WalletHub.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WalletHubStepDef.user_chooses_Policy_dropdown_write_the_review_and_click_on_Submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WalletHubStepDef.user_is_navigated_to_confirmation_page_where_user_validates_the_review_post_is_successfully_posted_and_clicks_on_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WalletHubStepDef.user_navigates_to_Profile_page_from_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WalletHubStepDef.user_validates_review_message()"
});
formatter.result({
  "status": "skipped"
});
});