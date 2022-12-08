Feature: Table View

  As an Admin,
  I want to __login as Super Admin__
  In order to ** View User Management Index **

  Background: User already login as Admin
    Given User already login as Admin
    And User navigate to User Management Page

  @tableview-001 @positive
  Scenario: Verify all required data provided on column
    When Admin is on User Management Page
    Then Admin can see following column
      | Name            |
      | Phone Number    |
      | Email           |
      | Registered Date |
      | Role            |
      | Status          |

  @tableview-002 @positive
  @Manual
  @Manual=Failed
  Scenario: Verify id is sorted ascending
    When Admin is on User Management Page
    Then Data is sorted ascending by default

  @tableview-003 @postive
  Scenario: Verify data shown limited by 10
    When Admin is on User Management Page
    Then Data is limited by 10 by default