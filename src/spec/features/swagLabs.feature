
Feature: Login into Swag Labs wwebsite 
  I want to Login into Swag Labs website

  @LoginSwaglabs
  Scenario: Login into Swag Labs website
    Given I want to login into Swag Labs website
    When I enter my username
    And I add password 
    And I click on Login button 
    Then I am logged in the swag Labs website
    And I am redirected to the internal page