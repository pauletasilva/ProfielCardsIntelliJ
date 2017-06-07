Feature: Adjust Profile Cards
	As a user
	I want to adjust the content of all profile cards
	So that I can see different information regarding the profile cards in the main page
	
	Scenario: First time accessing the website
 		Given it is the first time accessing the website
 		When I reach the main page
 		Then all profile cards are shown with default configuration
		
	Scenario: Access profile cards configuration
		Given I want to access profile cards configuration
		When I press the configuration button
		Then I should see all the parameters that I can adjust
		
	Scenario: Adjust only one detail of the profile cards configuration to show more details
		Given the profile cards configuration is accessed
		When I select <detail> to be shown in the profile cards
		And I press the button save
		Then the configuration of the profiles cards is saved
		And I am redirected to the main page
		And the webpage displays the profile cards with the <configinformation>

		#update: add another placeholder (<configinformation>) in the step and include it in the examples table beloow
	Examples:
	|detail| configinformation |
	|email| team-member-1@ipleiria.pt |
	|email| team-member-2@ipleiria.pt |
	|email| team-member-3@ipleiria.pt |
	|current ocupation|
	|working experience|
	|education|
	|projets involved|
	|certifications and awards|
	
	Scenario: Adjust two or more details of the profile cards configuration to show more details
		Given the profile cards configuration is accessed
		When I select two or more details to be shown in the profile cards
		And I press the button save
		Then the configuration of the profiles cards is saved
		And I am redirected to the main page
		And the webpage displays the profile cards with the saved configuration
		
	Scenario: Adjust profile cards configuration to hide details
		Given the profile cards configuration is accessed
		When I select <detail> to be hidden in the profile cards
		And I press the button save
		Then the configuration of the profiles cards is saved
		And I am redirected to the main page
		And the webpage displays the profile cards with the saved configuration
		
	Examples:
	|detail|
	|email|
	|current ocupation|
	|working experience|
	|education|
	|projets involved|
	|certifications and awards|
	
	Scenario: Adjust two or more details of the profile cards configuration to hide more details
		Given the profile cards configuration is accessed
		When I select two or more details to be hidden in the profile cards
		And I press the button save
		Then the configuration of the profiles cards is saved
		And I am redirected to the main page
		And the webpage displays the profile cards with the saved configuration
		
	Scenario: Cancel profile cards configuration without changing default values
		Given the profile cards configuration is accessed
		When I choose to cancel the configuration of the profile cards
		Then the configuration of the profiles cards stays the same as before
		And the information shown regarding the profile cards remains the same
		And I am redirected to the main page
		
	Scenario: Cancel profile cards configuration after changing default values
		Given the profile cards configuration is accessed
		And I change one or more values
		When I choose to cancel the configuration of the profile cards
		Then the configuration of the profiles cards should remain the same
		And the information shown regarding the profile cards should remain the same
		And I am redirected to the main page
		
	Scenario: Leave profile cards configuration
		Given the profile cards configuration is accessed
		When I leave the configuration of the profile cards
		Then the configuration of the profiles cards should remain the same
		And the information shown regarding the profile cards should remain the same
		And I am redirected to another page
		
		