#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Netflix 
Feature: Netflix home page check
   @termsofuse
  Scenario: Netflix terms of use scenario
    Given the user is in netflix home page
    
    When the user clicks the terms of use link
    
    Then the user verifies the various points in terms of use
    |1|Membership|
    |2|Free Trials|
    |3|Billing and Cancellation|
    |4|Netflix Service|
    |5|Passwords and Account Access|
    |6|Warranties and Limitations on Liability|
    |7|Class Action Waiver|
    |8|Miscellaneous|
    
 
   
   @CorporateInformation
   Scenario: Corporate Information first para text Verification
   
   	Given the user is in netflix home page
    
    When the user clicks the Corporate Information link
    
    Then the user verifies the first para 
    
    |Netflix serves members in many different countries. The Netflix entity that provides you with access to the Netflix service and qualifies as your data controller depends on your country of membership, and will be listed in your membership or payment confirmation email.|
  
	@MediaCentre
   Scenario: Media Centre Press Releases and Blogs button Verification
   
   	Given the user is in netflix home page
    
    When the user clicks the Media Centre link
    
    Then the user verifies the Press Releases and Blogs button is displayed 
   
 
