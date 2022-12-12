@itinerary @TTS-457
Feature: Add Itinerary Button

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page

  Scenario: Add Itinerary Button functionality
    When User click add itinerary button
    Then Add Itinerary modal open