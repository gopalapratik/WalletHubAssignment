@Assignment
Feature: FaceBook

Scenario Outline: FaceBook Login and Post message validation

Given user login to "<application>"
When user provides username and password
Then user is logged into FaceBook home page
When user posts a status message "<message>"
Then status message "<message>" is posted successfully 


Examples:
|application|message|
|FaceBook |Hello World|