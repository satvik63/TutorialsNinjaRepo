
Feature: Login functinality scenarios

	@Login @One
	Scenario: Verify whether the User is able to login with valid credentials
	  Given I launch the application
	  And I naviage to Account Login page
	  When I login to the application using Username "satvik63@gmail.com" and Password "satvik123"
    Then I should see that the User is able to successfully login

    
		@Login @Two
    Scenario: Verify that the User is not able to login with invalid credentials
      Given I launch the application
	  	And I naviage to Account Login page
	  	When I login to the application using Username "satvik63@gmail.com" and Password "satvik12399"
      Then I should see an error message informing the User about invalid credentials
      
    @Login @Three
    Scenario: Verify that the User is not able to login without providing credentials
      Given I launch the application
	  	And I naviage to Account Login page
	  	When I login to the application using Username "" and Password ""
      Then I should see an error message informing the User about invalid credentials
      
      
		@Login @Four
    Scenario: Verify that the User is able to reset forgotten password
      Given I launch the application
	  	And I naviage to Account Login page
	  	When I reset the forgotten password for "satvik63@gmail.com"
	  	Then I should see a message informing that the password reset details have been sent to the email address

