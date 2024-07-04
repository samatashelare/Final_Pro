Feature: Contact functionality test
 
  Scenario Outline: verify the contact functionality
    Given user launch a browser with url
    When user click on contact link
    When user enter contact email "<email>" and name "<name>" and message "<message>"
    When user click on send message button
    Then user get a popup and shawing msg as "Thanks for the message!!"

    Examples: 
      | email  						| name 			| message   |
      | samata1@gmail.com |     samta | hi  		  |
      | samata2@gmail.com |     rita 	| hii       |
      | samata3@gmail.com |     yita 	| hello     |
      | samata4@gmail.com |     nita 	| hello     |
      
