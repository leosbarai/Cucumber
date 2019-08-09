Feature: Create account of Facebook2
As a user I need to open facebook home page and do the validations 

Scenario: Validate create a user multiple fields21
Given User need to be on Facebook login page
When Enter following data
|Username	|UserSurName	|Mobile	|
|Tom			|Hanks				|1234		|
|Jack			|Daniels			|5678		|
Then Close browser