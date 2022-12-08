@itinerary
Feature: Modal Add Itinerary Search bar

  Background: User already open Modal Add Itinerary

  Scenario: Search bar functionality
    When User search top itinerary name "Danau Toba"
    Then Top Itinerary with name "Danau Toba" appeared