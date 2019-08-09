Feature: Create account of Facebook3
As a user I need to open facebook home page and do the validations 

Scenario: Validade First Name field31
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then Close browser

#Scenario: Validate create a user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user surname
#Then User checks user first name is present
#But User mobile field should be blank
