Feature: Testing the Register functionality in Tutorials Ninja
	
	@Register @One
		Scenario: Positive-Enter all the details in the Registration field
	
			Given I launch the application
			And I navigate to Account Registration page
			When I provide all the below valid details
				|First Name	| Satvik						|
				| LastName  | Konakalla 				|
    		| Email			| satvik63@gmail.com|
    		| Telephone	| 9212345678				|
    		| Password	| satvik123					|
    	And I select the Privacy Policy
    	And I click on Continue button
    	Then I should see that the User Account has successfully created
    
  @Register @Two
  	Scenario: Negative-Verify whether the user is not allowed to register on skipping mandatory fields
  		
  		Given I launch the application
  		And I navigate to Account Registration page
  		When I click on Continue button
  		Then I should see that the User Account is not created
  		And I should see the error messages informing the user to fill the mandatory fields
  		
  @Register @Three
		Scenario: Positive-Enter all the details with News letter subscription
	
			Given I launch the application
			And I navigate to Account Registration page
			When I provide all the below valid details
				|First Name	| Satvik						|
				| LastName  | Konakalla 				|
    		| Email			| satvik63@gmail.com|
    		| Telephone	| 9212345678				|
    		| Password	| satvik123					|
    	And I subscribe to the Newsletter
    	And I select the Privacy Policy
    	And I click on Continue button
    	Then I should see that the User Account has successfully created
  	
  @Register @Four
	 Scenario: Verify whether the user is restricted from registring a duplicate account
  	Given I launch the application
  	And I navigate to Account Registration page
  	When I provide the below duplicate details into the fields
  			|First Name	| Satvik						|
				| LastName  | Konakalla 				|
    		| Email			| satvik63@gmail.com|
    		| Telephone	| 9212345678				|
    		| Password	| satvik123					|
    And I select the Privacy Policy
    And I click on Continue button
		Then I should see the warning message stating that the user is already created
