@itinerary
Feature: Add Itinerary Button

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page

  Scenario: Add Itinerary Button functionality
    When User click add itinerary button
    Then User is on Add Itinerary Page