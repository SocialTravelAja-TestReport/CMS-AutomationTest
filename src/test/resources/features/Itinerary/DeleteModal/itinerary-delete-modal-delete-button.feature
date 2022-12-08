@itinerary
Feature: Top Itinerary Delete Modal Hapus Button

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page
    And User click delete itinerary button

  Scenario: Top Itinerary Delete Modal Hapus Button functionality
    When User click Hapus Button on Top Itinerary Delete Modal
    Then Data removed from top itinerary