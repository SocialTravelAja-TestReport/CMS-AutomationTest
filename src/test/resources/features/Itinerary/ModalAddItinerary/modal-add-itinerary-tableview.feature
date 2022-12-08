@itinerary
Feature: Modal Add Itinerary Tableview

  Scenario: Modal Add Itinerary Column visibility
    Then All Listed column below visible:
      | Itinerary Title|
      | Name           |
      | Aksi           |

  Scenario: Modal Add Itinerary List itinerary
    Then All list of itinerary that was created by user is visible

  Scenario: Modal Add Itinerary Pagination limit
    Then Pagination limit is set to 5 row per page
