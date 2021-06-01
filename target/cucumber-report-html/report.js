$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddNewAddress.feature");
formatter.feature({
  "line": 1,
  "name": "AddNewAddressFeature",
  "description": "This feature is responsible for testing all the scenarios for login of application",
  "id": "addnewaddressfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20863605700,
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
  "name": "I am a customer user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I accept the cookies preference",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepdefs.iAmACustomerUser()"
});
formatter.result({
  "duration": 360853300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.iAcceptTheCookiesPreference()"
});
formatter.result({
  "duration": 3208481000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "1- Check Login with correct username and password",
  "description": "",
  "id": "addnewaddressfeature;1--check-login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I click the sign up link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I login successfully with the correct credentials",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 12
    },
    {
      "cells": [
        "ibi35awesu@gmail.com",
        "123456789"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I navigate to My Account overview page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click Directory to add new address",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I land in My Account Directory page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click the Add new address",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I fill the form displayed on the screen",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click the save button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the new address added to my account profile",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I delete the current address to revert back to the previous status",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepdefs.iClickTheSignUpLink()"
});
formatter.result({
  "duration": 4040506200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.iLoginSuccessfullyWithTheCorrectCredentials(DataTable)"
});
formatter.result({
  "duration": 3146279800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iNavigateToMyAccountOverviewPage()"
});
formatter.result({
  "duration": 15788389800,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iClickDirectoryToAddNewAddress()"
});
formatter.result({
  "duration": 6695967100,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iLandInMyAccountDirectoryPage()"
});
formatter.result({
  "duration": 35600,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iClickTheAddNewAddress()"
});
formatter.result({
  "duration": 1171030400,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iFillTheFormDisplayedOnTheScreen()"
});
formatter.result({
  "duration": 15279674700,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (d6a485884e23acd621df82ecf52ce315)] -\u003e id: firstName] (tried for 15 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027WAY2AUTOTESTING\u0027, ip: \u0027192.168.1.94\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\Kunle\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64293}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 90.0.4430.212, webStorageEnabled: true}\nSession ID: d6a485884e23acd621df82ecf52ce315\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat com.PVH.framework.base.DriverContext.enterTextbox(DriverContext.java:61)\r\n\tat com.PVH.Test.pages.AddressPage.FillFormAs(AddressPage.java:72)\r\n\tat com.PVH.Test.steps.AddNewAddressStepdefs.iFillTheFormDisplayedOnTheScreen(AddNewAddressStepdefs.java:46)\r\n\tat ✽.And I fill the form displayed on the screen(AddNewAddress.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iClickTheSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressStepdefs.theNewAddressAddedToMyAccountProfile()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewAddressStepdefs.iDeleteTheCurrentAddressToRevertBackToThePreviousStatus()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 5722375500,
  "status": "passed"
});
formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature is responsible for testing all the scenarios for login of application",
  "id": "loginfeature",
  "keyword": "Feature"
});
