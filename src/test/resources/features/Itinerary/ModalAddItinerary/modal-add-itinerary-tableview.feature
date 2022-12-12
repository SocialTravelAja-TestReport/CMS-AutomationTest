@itinerary
Feature: Modal Add Itinerary Tableview

  Background: User already open Add Itinerary Modal
    Given User already login as Admin
    And User navigate to Top Itinerary Page
    And User click add itinerary button

  Scenario: Modal Add Itinerary Column visibility
    Then All Listed column below visible:
      | Itinerary Title|
      | Nama           |
      | Aksi           |

  @Manual
  @Manual:Passed
  Scenario: Modal Add Itinerary List itinerary
    Then All list of itinerary that was created by user is visible

  Scenario: Modal Add Itinerary Pagination limit
    Then Pagination limit is set to 5 row per page
