Feature: Login functionality for adactin application

Background:
Given user enter application url
And user enter "aarthyrajeev" as username
And user enter "abc123" as password
Then user verify the username in the homepage

@login
Scenario Outline: Successful login into the adactin application with valid credential 
When user enter application url
And user enter "<username>" as username
And user enter "<password>" as password
Then user verify the username in the homepage

Examples:
|username|password|
|ragu1234|ragu1234|

@searchhotel1
Scenario: Search adactin application for Location,Hotel,roomtype,no of rooms,adultsperroom,search 
Given user enter Location
When user enter Hotel
And user enter RoomType
And user enter NoOfRooms
Then user clicks search
Given Select radio button option
When click continue
Given user enter FirstName
When user enter LastName
And user enter BillingAddress
And user enter CcNo
And user enter CcType
And user enter ExpiryMonth
And user enter ExpiryYear
And user enter CvvNo
Then user clicks BookNow
Given user clicks get itinerary
Given user selects all itinerary
When user clicks cancel selected options
Then user clicks and logs out of the webpage

@searchhotel2
Scenario: Search adactin application for Location,Hotel,roomtype,no of rooms,adultsperroom,search 
Given user enter Location
When user enter Hotel
And user enter RoomType
And user enter NoOfRooms
Then user clicks search
Given Select radio button option
When click continue
Given user enter FirstName
When user enter LastName
And user enter BillingAddress
And user enter CcNo
And user enter CcType
And user enter ExpiryMonth
And user enter ExpiryYear
And user enter CvvNo
Then user clicks BookNow
Given user clicks get itinerary
Given user selects all itinerary
When user clicks cancel selected options
Then user clicks and logs out of the webpage