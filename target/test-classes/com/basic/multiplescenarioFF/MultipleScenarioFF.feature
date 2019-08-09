Feature: Create account of Facebook7
As a user I need to open facebook home page and do the validations 

Scenario: Validade First Name field71
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then Close browser

Scenario: Validate create a user multiple fields72
Given User need to be on Facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present
Then User mobile field should be blank
Then Close browser