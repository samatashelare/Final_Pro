#Feature: Login functionality

 # Scenario: Successful login with valid credentials
  #  Given the user is on the login page
   # When the user enters a valid username and password
    #Then the user should be redirected to the dashboard
    

Feature: Login Functionality

		@RegressionTest 
		Scenario: verify login with valid cred
		
		Given launch a browser with url
		When user enter the valid username
		When user enter the valid password
		When click on Login button
		Then user logged in  
		@SanityTest
			Scenario: verify login with Invalid username
		
		Given launch a browser with url
		When user enter the invalid username
		When user enter the valid password
		When click on Login button
		Then user should not logged in  
		

    
    