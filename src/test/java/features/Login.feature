Feature: Application 

@SmokeTest
Scenario: User wants to log in
Given User is on the landing page 
When User enters username  "USN" and password "a23"
And User clicks on the submit button
Then User has successfully "Logged in"
@SmokeTest
Scenario: User wants to log in and logout respectively
Given User is on the landing page 
When User enters username  "xyz" and password "a23"
And User clicks on the submit button
Then User has successfully "Logged out"


@SmokeTest
Scenario: User wants to sign up
Given User is on NetBanking landing page
When User sign up with following details
| riya | 3415gch | abc@abcd.com |USA | 5676899877|
Then Home page is populated
And Cards displayed are "false"


