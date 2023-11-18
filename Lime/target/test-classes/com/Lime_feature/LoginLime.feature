Feature: LimeRoad
Scenario: LimeRoad login functionality
Given User launch the browser "chrome"
When User launch the Url "https://www.limeroad.com/"
And User click the profile
And User click the login
And Enter Phone Number
And User Click Next
And User Enter OTP
And I should be logged in successfully
Then User Close the browser