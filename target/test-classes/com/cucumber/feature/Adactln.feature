Feature: Sample Test Cases for Automation for AdactIn Hotel Application



@TC_01
Scenario: To verify valid login details
When user enters the username
And user enters the password
Then User clicks the login button
Then User logout

@TC_02
Scenario: To verify whether the check-out date field accepts a later date than checkin date.
When user enters the username
And user enters the password
Then User clicks the login button
When User selects their required option location,hotel,room type,no of rooms
And User selects checkin and checkout date
Then Verify that system gives an error saying check-in-date should not be later than check-out-date.
Then User logout