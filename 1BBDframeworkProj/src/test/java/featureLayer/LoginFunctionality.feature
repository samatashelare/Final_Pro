Feature: Login functionality

		Scenario: verify login with valid cred
		Given user launch a browser with url
		When user click on login link
		When user enter the username as "test@121" and enter the password as "test123456"
		When user click on login button
		Then user logged in as "Welcome test@121"
		
		Scenario: verify login with invalid username
		Given user launch a browser with url
		When user click on login link
		When user enter the invalid username as "test@1121" and enter the password as "test123456"
		When user click on login button
		Then user get popup and showing as "User does not exist."
		
			Scenario: verify login with invalid password
		Given user launch a browser with url
		When user click on login link
		When user enter the username as "test@121" and enter the invalid password as "dewdwe"
		When user click on login button
		Then user get popup and showing msg as "Wrong password."
		