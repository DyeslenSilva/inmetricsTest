@RegisterClient

Feature: Register Client

	As a Employee of the company
	I want to register the client of our company.
	
	
	Background: Use navigates to register clients
		Given I am on the "Register Clients" page on URL "www.nga.com"
		Then I should see the page to register clients
		
	Scenario: Succefull Registered
		When I fill "nameClient" with "Dyeslen"
		And I fill "address" with "Av Tambore, 267"
		And I fill 	"phone" with "2132-3992"
		And I fill "city" with "Barueri"
		And I fill "state" state with "São Paulo" 
		Then the system should redirect to the page "Registred Succefully"
		And the system return to the homepage

	Scenario Outline: Failed Registred using wrong character
		When I dont fill the TextBox
		And I fill nameClient with "<nameClient>"
		And I fill adress with "<adress>"
		And I fill  phone with "<phone>"
		And I fill city with 	"<city>"
		And I fill state with "<state>"
		And I should see "<warning>" message
		Then the system should redirect to the page "Registred Failed"
		
		
		
		
	