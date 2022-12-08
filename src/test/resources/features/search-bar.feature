@search-bar
Feature: Search Bar

  As an logged in Admin
  I want to __ utilize search bar __
  In order to ** filter data which data i want to see **

#  Background: User already login as Super Admin
#    Given User already login as Admin
#    And User navigate to User Management Page

  Scenario: Validate search by existing name
    Given User already login as Admin
    And User navigate to User Management Page
    When Admin Search by name "Ruben"
    Then User with name "Ruben" appeared

  Scenario: Validate search by existing email
    When Admin Search by email "benson@yopmail.com"
    Then User with email "benson@yopmail.com" appeared

  Scenario: Validate search by existing phone number
    When Admin Search by phone number "0822141540433"
    Then User with phone number "+62 822 1415 4043 3" appeared

  Scenario: Validate search non existence data
    When Admin Search with invalid data
    Then There is no result

