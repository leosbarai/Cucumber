Feature: Create account of Facebook6
As a user I need to open facebook home page and do the validations 

Scenario: Validade First Name field61
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present

Scenario: Validate create a user multiple fields62
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
Then User mobile field should be blank
Then Close browser