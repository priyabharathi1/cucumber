
@tag
Feature: To check login Functionality
  

  @tag1
  Scenario: To verify the login feature
    Given To launch the makemytrip home page
    When I click login button 
    And I enter username
    And Iclick ok button
    And I enter password
    And I click enter button
    Then It should navigate to makemytrip home page

 
