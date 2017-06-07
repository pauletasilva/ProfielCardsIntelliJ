Feature: Show All Profile Cards
	As a user
	I want to see all existing profile cards 
	So that I can obtain meaningful information about each members' profile cards

	Scenario: First time accessing the website's main page
		Given it is the first time accessing the website
		And the profile cards have a default configuration on what information is shown
		When I reach the main page
		Then I see all profile cards according to the default configuration
		
	Scenario: Member has information in all existing fields
		Given Member has information in all existing fields
		When I reach the main page
		Then I see all profile cards with information about the respective member
		
	Scenario: Member does not have information in one or more fields
		Given a member doesn't have information for one or more fields
		When I reach the main page
		Then every field without information of that profile card will display a message saying that the information was not found
		
	Scenario: All members are able to attend to a conference
		Given all members are confirmed
		When I check profile cards
		Then I see all profile cards according to their predefined configuration
		
	Scenario Outline: A member is not able to attend
		Given the member <memberName> is not able to attend due to <reason>
		And other members are able to attend to the conference
		When I check the main page
		Then I get feedback saying that <memberName> is unable to attend due to <reason>
			
	Examples:
		| memberName | reason |
		| Carlos |sickness |
		| Carlos | personal issues |
		| Carlos | other reason |
		| João |sickness |
		| João | personal issues |
		| João | other reason |
		| Tiago |sickness |
		| Tiago | personal issues |
		| Tiago | other reason |
		| Nivi |sickness |
		| Nivi | personal issues |
		| Nivi | other reason |
		