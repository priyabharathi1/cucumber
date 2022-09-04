
@tag
Feature: To check login functionality of webshop
  

  @tag2
  Scenario Outline: To verify the login feature of webshop page
    Given To launch Webshop page
    When I enter email <email> and password <password>
    And click login button
    Then it should navigate to booking page <status> 

    Examples: 
      | email                      | password | status  |
      | priyabharathi715@gmail.com | Priya@13 | success |
      | priya.bharathi0@gmail.com  |  priya   | Fail    |
