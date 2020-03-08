Feature: Add Dependent

Background:

Given I am logged into HRMS
And I navigated to Employee List Page
Then I search for Employee ID "9876" and click on search
And I select the Employee


  @regression
  Scenario Outline: Add multiple dependent
  
    Then I click on Dependents
    And I click on add button
    Then I enter "<Name>","<Relationship>","<Date of Birth>"   
    And I click save button
    Then I see Dependent added
 Examples:
   |Name|Relationship|Date of Birth|
   |Jon|Child|2014-05-07|
   |Merry|Spouse|1997-06-03|  
   |Jennifer|Child|2008-04-12|  