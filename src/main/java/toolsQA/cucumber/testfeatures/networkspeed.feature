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
@NetworkSpeed
Feature: NetworkSpeed check
 

  @fast.com
  Scenario Outline: Network Speed check using fast.com
    Given The user is in  fast.com
   
    When the user waits to see the network speed 
  
    Then the user validates the actual network speed with expected "<ExpectedSpeed>"
   
   Examples:
   |ExpectedSpeed|
   |25|
   

 