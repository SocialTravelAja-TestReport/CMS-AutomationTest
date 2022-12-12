@itinerary
Feature: Modal Add Itinerary Search bar

  Background: User already open Add Itinerary Modal
    Given User already login as Admin
    And User navigate to Top Itinerary Page
    And User click add itinerary button

  Scenario: Search itinerary by Itinerary Title
    When User search top itinerary query "Title Arif Rachman" on Modal Add Itinerary
    Then Top Itinerary with name "Title Arif Rachman" appeared in Add Itinerary Modal

  Scenario: Search itinerary by "Nama Itinerary"
    When User search top itinerary query "Arif Rachman" on Modal Add Itinerary
    Then Top Itinerary with name "Arif Rachman" appeared in Add Itinerary Modal

  Scenario: Search itinerary with blank value
    When User search top itinerary query "" on Modal Add Itinerary
    Then All itinerary should by visible in Add Itinerary Modal