@itinerary @TTS-459
Feature: Top Itinerary Delete Modal Batal Button

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page
    And User click delete itinerary button

  Scenario: Top Itinerary Delete Modal Batal Button functionality
    When User click Batal Button on Top Itinerary Delete Modal
    Then Top Itinerary Delete Modal is closed
    And User redirected to Top Itinerary Page