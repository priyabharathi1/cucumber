
@tag
Feature: To perform login functionality
  
  @tag1
  Scenario: To verify the login feature
    Given To launch the adactin home page
    When I enter username "priyabharathi"
    And I enter password "bharathi"
    And I click login button
    Then It should navigate to adactin home page
    
    @tag2
     Scenario:  Search hotel page functions
    Given User is on the search hotel page 
    When Customer selects the location 
    And Customer select the hotel type
    And Customer select room types
    And  Customer selects number of rooms 
    And Customer selects the check-in and Check out date
    And Customer selects the Adults per room 
    And Customer selects the children per room 
    And Search button is clicked
    Then The page is navigated to Select Hotel with details 

    @tag3
    Scenario: Select hotel functionality
    Given User is on the select hotel page 
    When I clicks the select radio button 
    And I clicks the continue button 
    Then The page is navigated to Book a Hotel page  
    
    @tag4
     Scenario: Booking a Hotel 
    Given User is on the Book hotel page 
    When Customer checks the details and Enter the first name as "priya" 
    And Customer enters the last name "bharathi"
    And Customer enters the billing address as "aaa"
    And  Customer enters the credit card number as "8765432112345678"
    And Customer selects the credit card Type
    And Customer selects the expiry date of credit card with Month and Year 
    And Customer Enters the CVV number
    And Book now button is clicked 
    Then The Processing message is displayed and page is navigated to booking confirmation
    
   @tag5
   Scenario: Booking Confirmation 
    Given Booking confirmation is visible to the user 
    When Customer can verify all the details 
    And Customer clicks the Logout button
    Then The Adactin booking page succedfully logged out 