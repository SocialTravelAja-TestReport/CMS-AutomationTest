@itinerary
Feature: Top Itinerary Search Bar functionality

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page

  Scenario: Search Top Itinerary data by name
    When Search Top Itinerary with name "Itinerary Title - 0"
    Then Top Itinerary with name "Itinerary Title - 0" appeared

#  Scenario: Search Top Itinerary data by Email
#    When Search Top Itinerary with email "contoh-email@gmail.com"
#    Then Top Itinerary with phone email "contoh-email@gmail.com" appeared
#
#  Scenario: Search Top Itinerary data by Email
#    When Search Top Itinerary with phone number ""
#    Then Top Itinerary with phone number "" appeared