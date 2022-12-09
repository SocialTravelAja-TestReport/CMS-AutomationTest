@itinerary @TTS-457
Feature: Top Itinerary Delete Icon

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page

  @fixing
  Scenario: Itinerary Page Delete Button functionality
    When User click delete itinerary button
    Then Delete itinerary confirmation modal appeared