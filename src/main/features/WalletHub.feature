Feature: FaceBook and WalletHub



Scenario Outline: Wallethub Login and validation

Given user launches WalletHub "<application>"
When user enters valid WalletHub credentials
Then user lands on WalletHub Homepage and give five stars after hovering on every star
Then user chooses Policy dropdown, write the review and click on Submit button
Then user is navigated to confirmation page where user validates the review post is successfully posted and clicks on Continue button
When user navigates to Profile page from home page
Then user validates review message
 


Examples:
|application|
|WalletHub  |





