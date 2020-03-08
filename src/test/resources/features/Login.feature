@sprint1 @login
Feature: Login

  @smoke
  Scenario: Valid login
    Given I open browser and navigated to the HRMS
    When I enter valid username and valid password
    And I click on login button
    Then I successfully logged in
    And I close browser

  @smoke
  Scenario: Invalid Login
    Given I open browser and navigated to the HRMS
    When I enter valid username and invalid password
    And I click on login button
    Then I see error message
    And I close browser
   
    
    @smoke
    Scenario Outline: Invalid login and message validation
    When I enter "<Username>" and "<Password>" 
    And I click on login button
    Then I see "<ErrorMessage>"
    
    Examples:
    
    |Username|Password|ErrorMessage|
    |Admin|Admin123   |Invalid credentials|
    |Admin|           |Password cannot be empty|
    |     |Syntax@123 |Username cannot be empty|
    |     |           |Username cannot be empty|
