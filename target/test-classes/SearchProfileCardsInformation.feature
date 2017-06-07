Feature: Search Profile Cards Information
	As a user
	I want to search information from the existing profile cards
	So that I can know if there are profile cards where I can see what I searched for

	Scenario: Searched word exists in only one profile card
		Given the searched word exists in only one profile card
		When I search for a certain word
		Then the profile card with the searched word is highlighted
		And I see all information related to the searched word in the respective profile card

	Scenario: Searched word exists in two or more profile cards
		Given the searched word exists
		When I search for a certain word
		And that word exists in <number_of_members> profile cards
		Then the profile cards with the searched word are highlighted
		And I see all information related to the searched word in each respective profile card
		
	Examples:
		|number_of_members|
		|two|
		|three|
		|four|
		
	Scenario: Searched word does not exist in the existing profile cards
		Given the searched word does not exist
		When I search for a certain word
		Then I get feedback informing that the searched information was not found
		