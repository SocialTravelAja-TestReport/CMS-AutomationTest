@itinerary @TTS-457
Feature: Top Itinerary Tableview

  Background: User already on Top Itinerary Page
    Given User already login as Admin
    And User navigate to Top Itinerary Page

  @fixing
  Scenario: Column visibility
    Then All Listed column below visible:
      | Itinerary Title |
      | Nama            |
      | Aksi            |
      | Rank            |

  @Manual
  @Manual:Passed
  Scenario: Data is sorted by rank
    Then Data is sorted by rank

  @Manual
  @Manual:Failed
  Scenario: Able to edit itinerary rank by dragging the row position
    Then Dragging will automatically update rank/position
