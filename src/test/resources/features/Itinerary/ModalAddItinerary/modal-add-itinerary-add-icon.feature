@itinerary
Feature: Modal Add Itinerary add icon

  Background: User already open Add Itinerary Modal
    Given User already login as Admin
    And User navigate to Top Itinerary Page
    And User click add itinerary button

  Scenario: Modal Add Itinerary add icon
    When User click add icon on Modal Add Itinerary
#    Then Will add itinerary to top itinerary list
    And Modal "Berhasil" appeared