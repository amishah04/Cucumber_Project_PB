 Feature: 
 Login Test 
 Scenario:
Validate Login Test 
Given i launch url in browser
When i enter user name 
And i enter password
When i click on login button
Then i validate url
Then i close browser

@tag
Scenario Outline:
Validate with multiple data
Given user launch url in "<Browser>"
When user enter "<username>" in textbox
When user enter "<password>" textbox
When user click on login
Then user validate url
Then user close browser
Examples:
|Browser|username|password|
|chrome|Admin|Qedge123!@#|
|chrome|Admin|Qedge123|
