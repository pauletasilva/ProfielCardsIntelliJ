Feature: Show All Profile Cards
	As a user
	I want to see all existing profile cards 
	So that I can obtain meaningful information about each members' profile cards

	Scenario: Accessing the website's main page
		Given I want to access the main page
		When main page is reached
		Then I see all profile cards in their default configuration
		
	Scenario Outline: A member has information in all existing fields
		Given "<memberName>" has information in all existing fields
		When main page is reached
		Then I see all profile cards with information about "<memberName>"

	Examples:
		| memberName |
		| Carlos |
		| João |
		| Tiago |
		| Nivi |