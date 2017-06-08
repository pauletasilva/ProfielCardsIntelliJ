Feature: Show Profile Card Details
	As a user 
	I want to be able to check a profile card details
	So that I can access all the details about a members' profile card
	
	Scenario: Member does not have certain details
		Given a Member does not have <detail>
		When I select the profile card of <member_name>
		Then the field of <detail> shows feedback refering that required detail was not found
		
	Examples:
		|detail	|member_name|
		|name			 |Carlos|
		|short bio		 |Carlos|
		|social networks |Carlos|
		|name			 |João|
		|short bio		 |João|
		|social networks |João|
		|name			 |Nivi|
		|short bio		 |Nivi|
		|social networks |Nivi|
		|name		     |Tiago|
		|short bio		 |Tiago|
		|social networks |Tiago|
		
	Scenario: Member does not have a image/photo
		Given a Member does not have a certain image/photo
		When I select the profile card of <member_name>
		Then the field containing the image shows the default image

	Examples:
		|member_name|
		|Carlos|
		|João|
		|Nivi|
		|Tiago|
		
	Scenario: Access to a members' profile card
		Given I want to access to a members' profile card details
		And I'm in the landing page
		When I select a profile card
		Then I should see all the details of the selected member profile card
		
	Scenario: Member has details
		Given Member has details
		When I select the profile card of member <member_name>
		Then I see all details of the member <member_name>
		
	Examples:
		|member_name|
		|Carlos|
		|João|
		|Nivi|
		|Tiago|
		
	Scenario: Member has no details
		Given Member has no details
		When I select the profile card of <member_name>
		Then I'm redirected to that profile card
		And I get feedback saying <feedback_msg>

	Examples:
		|member_name|feedback_msg|
		|Carlos|Carlos has no details|
		|João|João has no details|
		|Nivi|Nivi has no details|
		|Tiago|Tiago has no details|
